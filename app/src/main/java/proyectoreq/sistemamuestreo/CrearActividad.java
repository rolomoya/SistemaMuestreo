package proyectoreq.sistemamuestreo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CrearActividad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_actividad);

        Spinner spinnerTipos = findViewById(R.id.spinnerTiposActiv);
        ArrayAdapter<CharSequence> adaptTipos = ArrayAdapter.createFromResource(this,R.array.spinner_tipos,android.R.layout.simple_spinner_item);

        spinnerTipos.setAdapter(adaptTipos);
    }

    public void onClick(){
        //Llamar sql para guardar en bd la actividad

    }
}
