package proyectoreq.sistemamuestreo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class PantInicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_inicio_sesion);
        final Button boton = (Button) findViewById(R.id.botonIniciar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.campoUsuario)).getText().toString();
                String contraseña = ((EditText) findViewById(R.id.campoContra)).getText().toString();
                if ("ihasbum".equals(usuario) && "admin".equals(contraseña)){
                    Toast.makeText(getApplicationContext(), "FELICIDADES!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
