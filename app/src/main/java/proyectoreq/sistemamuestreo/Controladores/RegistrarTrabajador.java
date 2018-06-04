package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import proyectoreq.sistemamuestreo.R;

public class RegistrarTrabajador extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_trabajador);
    }

    public void onClick(){
        String nombreTrab = ((EditText) findViewById(R.id.campoNombreTrab)).getText().toString();
        String alias = ((EditText) findViewById(R.id.campoAlias)).getText().toString();
        String puesto = ((EditText) findViewById(R.id.campoPuesto)).getText().toString();
    }
}
