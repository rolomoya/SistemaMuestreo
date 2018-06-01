package proyectoreq.sistemamuestreo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class PantInicioSesion extends Activity {

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
                    Toast.makeText(getApplicationContext(), "Ingreso exitoso", Toast.LENGTH_SHORT).show();
                    Intent nuevaPant = new Intent(PantInicioSesion.this, MenuAdmin.class);
                    startActivity(nuevaPant);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
