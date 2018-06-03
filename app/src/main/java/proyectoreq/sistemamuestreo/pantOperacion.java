package proyectoreq.sistemamuestreo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pantOperacion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_operacion);
    }

    public void onClick(View view){
        //aqui se llama la instrucción sql para guardar el nombre y descripcion de la operacion
        String nomOp = ((EditText)findViewById(R.id.nombreOp)).getText().toString(); // String que se agarra del campo de nombre
        String descOp = ((EditText)findViewById(R.id.descripOp)).getText().toString(); // String que se agarra del campo de descripcion

    }
}
