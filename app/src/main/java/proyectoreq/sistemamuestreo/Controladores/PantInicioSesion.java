package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

import App.Operacion;
import App.Tarea;
import App.Usuario;
import proyectoreq.sistemamuestreo.PantallasAnalista.PantPrincipalAnalista;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;


public class PantInicioSesion extends Activity {
    ArrayList<Usuario> listaObjUsuarios;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_inicio_sesion);

        conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        cargarUsuarios();


    }

    public void onClick(View view) {
        String usuario = ((EditText) findViewById(R.id.campoUsuario)).getText().toString();
        String contrasena = ((EditText) findViewById(R.id.campoContra)).getText().toString();
        RadioButton rAdmin, rAnalist;
        rAdmin = findViewById(R.id.radioAdmin);
        rAnalist = findViewById(R.id.radioAnalista);


        if(view.getId() == R.id.botonIniciar) {
            if (rAdmin.isChecked()) {
                if ("ihasbum".equals(usuario) && "admin".equals(contrasena)) {
                    Toast.makeText(getApplicationContext(), "Ingreso admin exitoso", Toast.LENGTH_SHORT).show();
                    Intent nuevaPant = new Intent(PantInicioSesion.this, MenuAdmin.class);
                    startActivity(nuevaPant);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorecta", Toast.LENGTH_SHORT).show();
                }
            }else if(rAnalist.isChecked()){
                if(validarAnalista(usuario,contrasena)) {
                    Intent pantAnalista = new Intent(PantInicioSesion.this, PantPrincipalAnalista.class);
                    startActivity(pantAnalista);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorecta", Toast.LENGTH_SHORT).show();
                }
            }
        }

        if(view.getId() == R.id.botonPantRegistrar) {
            Toast.makeText(getApplicationContext(), "Accediendo a registrar nuevo analista", Toast.LENGTH_SHORT).show();
            Intent pantReg = new Intent(PantInicioSesion.this, RegistrarUsuario.class);
            startActivity(pantReg);
        }


    }

    public Boolean validarAnalista(String nom, String con){
        if (listaObjUsuarios.isEmpty()){
            return false;
        }else {

            for (int i = 0; i < listaObjUsuarios.size(); i++) {
                if (listaObjUsuarios.get(i).getNombre().equals(nom)) {
                    if (listaObjUsuarios.get(i).getContrasena().equals(con)){
                        return true;
                    }
                }
            }
            return false;
        }


    }
    public void cargarUsuarios() {
        SQLiteDatabase bd = conn.getReadableDatabase();

        listaObjUsuarios = new ArrayList<Usuario>();
        Cursor cursor = bd.rawQuery("SELECT * FROM " + Utilidades.Tabla_Usuarios, null);
        while (cursor.moveToNext()) {
            Usuario usuario = new Usuario();
            usuario.setNombre(cursor.getString(2));
            usuario.setContrasena(cursor.getString(3));
            listaObjUsuarios.add(usuario);
        }
    }


}
