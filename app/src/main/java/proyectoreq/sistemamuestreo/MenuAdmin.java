package proyectoreq.sistemamuestreo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuAdmin extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

    }

    public void onClick(View v){
        if (v.getId() == R.id.botonNuevaOp){
            Toast.makeText(getApplicationContext(), "NUEVA OP", Toast.LENGTH_SHORT).show();
        }
    }




}
