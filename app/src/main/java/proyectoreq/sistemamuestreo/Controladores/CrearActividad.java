package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import proyectoreq.sistemamuestreo.Controladores.ConexionSQLiteHelper;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class CrearActividad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_actividad);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        Spinner spinnerTipos = findViewById(R.id.spinnerTiposActiv);
        ArrayAdapter<CharSequence> adaptTipos = ArrayAdapter.createFromResource(this,R.array.spinner_tipos,android.R.layout.simple_spinner_item);

        spinnerTipos.setAdapter(adaptTipos);
    }

    public void onClick(){
        //Llamar sql para guardar en bd la actividad
        registrar_Tarea();
    }

    private void registrar_Tarea() {
        String nomTarea = ((EditText)findViewById(R.id.campoNombreActiv)).getText().toString(); // String que se agarra del campo de nombre
        //String tipo = ((EditText)findViewById(R.id.spinnerTiposActiv)) // String que se agarra del campo de descripcion
        System.out.println(nomTarea);
        //System.out.println(tipo);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();


        try {
            ContentValues values = new ContentValues();

            values.put(Utilidades.Registro_NombreTarea,nomTarea);
         //   values.put(Utilidades.Registro_TipoTarea,tipo);

            Long idResult = db.insert(Utilidades.Tabla_Tareas,Utilidades.Registro_IdTarea,values);
            Toast.makeText(getApplicationContext(), "Tarea registrada correctamente", Toast.LENGTH_SHORT).show();

        } catch (SQLException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "No se pudo registrar la tarea", Toast.LENGTH_SHORT).show();
        }
        db.close();
    }
}
