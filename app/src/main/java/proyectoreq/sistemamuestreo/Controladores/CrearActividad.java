package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import proyectoreq.sistemamuestreo.Controladores.ConexionSQLiteHelper;
import proyectoreq.sistemamuestreo.R;

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

    }
}
