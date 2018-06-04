package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import proyectoreq.sistemamuestreo.Controladores.ConexionSQLiteHelper;
import proyectoreq.sistemamuestreo.R;

public class CrearActividad extends Activity {

    ArrayList<String> lista_tipos;
    String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_actividad);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);

        Spinner spinnerTipos = findViewById(R.id.spinnerTiposActiv);



        obtLista();

        ArrayAdapter<CharSequence> adaptador=new ArrayAdapter(this,android.R.layout.simple_spinner_item,lista_tipos);
        spinnerTipos.setAdapter(adaptador);


        spinnerTipos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i!=0){
                    tipo = lista_tipos.get(i-1);
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


    public void onClick(){
        //Llamar sql para guardar en bd la actividad

    }
}
