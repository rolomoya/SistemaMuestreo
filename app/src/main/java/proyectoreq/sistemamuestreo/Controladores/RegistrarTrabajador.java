package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class RegistrarTrabajador extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_trabajador);
    }

    public void onClick(View view){
        //aqui se llama la instrucción sql para guardar el nombre y descripcion de la operacion
        registrar_Trabajador();
    }

    private void registrar_Trabajador() {
        String alias = ((EditText) findViewById(R.id.campoAlias)).getText().toString();
        String puesto = ((EditText) findViewById(R.id.campoPuesto)).getText().toString();

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();


        try {
            ContentValues values = new ContentValues();

            values.put(Utilidades.Registro_AliasTrabajador,alias);
            values.put(Utilidades.Registro_PuestoTrabajador,puesto);


            Long idResult = db.insert(Utilidades.Tabla_Trabajadores,Utilidades.Registro_IdTrabajador,values);
            Toast.makeText(getApplicationContext(), "Trabajador registrado correctamente", Toast.LENGTH_SHORT).show();

        } catch (SQLException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "No se pudo registrar el trabajador", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }
}
