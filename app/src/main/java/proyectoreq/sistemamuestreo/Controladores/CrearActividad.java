package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import proyectoreq.sistemamuestreo.Controladores.ConexionSQLiteHelper;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class CrearActividad extends Activity {

    ArrayList<String> lista_tipos;
    String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_actividad);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);

        Spinner spinnerTipos = findViewById(R.id.spinnerTiposActiv);

        tipo = "";

        obtLista();

        ArrayAdapter<CharSequence> adaptador=new ArrayAdapter(this,android.R.layout.simple_spinner_item,lista_tipos);
        spinnerTipos.setAdapter(adaptador);


        spinnerTipos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i!=0){
                    tipo = lista_tipos.get(i);
                }else{
                    tipo = "";
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void obtLista() {
        lista_tipos = new ArrayList<String>();
        lista_tipos.add("-Seleccione tipo-");
        lista_tipos.add("Colaborativa");
        lista_tipos.add("Improductiva");
        lista_tipos.add("Productiva");
    }


    public void onClick(View view){
        //Llamar sql para guardar en bd la actividad
        registrar_Tarea();
    }

    private void registrar_Tarea() {
        String nomTarea = ((EditText)findViewById(R.id.campoNombreActiv)).getText().toString(); // String que se agarra del campo de nombre
        System.out.println(nomTarea);
        System.out.println(tipo);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();

        if(! tipo.isEmpty()) {
            try {
                ContentValues values = new ContentValues();

                values.put(Utilidades.Registro_NombreTarea, nomTarea);
                values.put(Utilidades.Registro_TipoTarea, tipo);

                Long idResult = db.insert(Utilidades.Tabla_Tareas, Utilidades.Registro_IdTarea, values);
                Toast.makeText(getApplicationContext(), "Tarea registrada correctamente", Toast.LENGTH_SHORT).show();

            } catch (SQLException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "No se pudo registrar la tarea", Toast.LENGTH_SHORT).show();
            }
        } else Toast.makeText(getApplicationContext(), "Seleccione un tipo", Toast.LENGTH_SHORT).show();
        db.close();
    }
}
