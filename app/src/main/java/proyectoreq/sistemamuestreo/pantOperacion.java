package proyectoreq.sistemamuestreo;

import android.app.Activity;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class pantOperacion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_operacion);
    }

    public void onClick(View view){
        //aqui se llama la instrucción sql para guardar el nombre y descripcion de la operacion

        Registrar_Operacion();
    }

    private void Registrar_Operacion() {
        String nomOp = ((EditText)findViewById(R.id.nombreOp)).getText().toString(); // String que se agarra del campo de nombre
        String descOp = ((EditText)findViewById(R.id.descripOp)).getText().toString(); // String que se agarra del campo de descripcion
        System.out.println(nomOp);
        System.out.println(descOp);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();


        try {
            ContentValues values = new ContentValues();

            values.put(Utilidades.Registro_NombreOperacion,nomOp);
            values.put(Utilidades.Registro_DescripcionOperacion,descOp);

            db.insert(Utilidades.Crear_Tabla_Operaciones,Utilidades.Registro_IdOperacion,values);
            Toast.makeText(getApplicationContext(), "Operación registrada correctamente", Toast.LENGTH_SHORT).show();
        } catch (SQLException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "No se pudo registrar la operación", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }
}
