package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class RegistrarUsuario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

    }

    public void onClick(View view){
        //aqui se llama la instrucción sql para guardar el nombre y descripcion de la operacion
        Registrar_Usuario();
    }

    private void Registrar_Usuario() {
        String nomUsuario = ((EditText)findViewById(R.id.campoNombreReg)).getText().toString(); // String que se agarra del campo de nombre
        String usuario = ((EditText)findViewById(R.id.campoUsuarioReg)).getText().toString(); // String que se agarra del campo de descripcion
        String pass = ((EditText)findViewById(R.id.campoPassReg)).getText().toString(); // String que se agarra del campo de descripcion
        System.out.println(nomUsuario);
        System.out.println(usuario);
        System.out.println(pass);
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_muestreos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();


        try {
            ContentValues values = new ContentValues();

            values.put(Utilidades.Registro_NombreUsuario,nomUsuario);
            values.put(Utilidades.Registro_Usuario,usuario);
            values.put(Utilidades.Registro_Contrasenna,pass);

            Long idResult = db.insert(Utilidades.Tabla_Usuarios,Utilidades.Registro_IdUsuario,values);
            Toast.makeText(getApplicationContext(), "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();

        } catch (SQLException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "No se pudo registrar el usuario", Toast.LENGTH_SHORT).show();
        }
        db.close();
        Intent devolver = new Intent(RegistrarUsuario.this,PantInicioSesion.class);
        startActivity(devolver);
    }

}
