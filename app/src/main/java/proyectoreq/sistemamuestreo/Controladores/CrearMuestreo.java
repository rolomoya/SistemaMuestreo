package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import App.Operacion;
import App.Trabajador;
import App.Usuario;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class CrearMuestreo extends Activity {
    ListView lvUsuarios, lvTrabajadores;
    ArrayList<String> listUs, listTra;
    ArrayList<Usuario> listObUs;
    ArrayList<Trabajador> listObTr;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_muestreo);

        conn = new ConexionSQLiteHelper(getApplicationContext(),"bd_muestreos",null,1);

        lvUsuarios = (ListView) findViewById(R.id.listViewUsuariosMuest);
        consultarUsuarios();

        ArrayAdapter adap1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listUs);
        lvUsuarios.setAdapter(adap1);

        lvTrabajadores = (ListView) findViewById(R.id.listViewTrabajadoresMuest);
        consultarTrabajadores();


        ArrayAdapter adap2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listTra);
        lvTrabajadores.setAdapter(adap2);
    }

    public void consultarUsuarios() {
        SQLiteDatabase bd = conn.getReadableDatabase();

        listObUs = new ArrayList<Usuario>();
        Cursor cursor = bd.rawQuery("SELECT * FROM " + Utilidades.Tabla_Usuarios, null);
        while (cursor.moveToNext()) {
            Usuario usuario = new Usuario();
            usuario.setNombre(cursor.getString(2));
            usuario.setContrasena(cursor.getString(3));
            listObUs.add(usuario);
        }

        obtenerListaU();
    }

    public void obtenerListaU(){

        listUs = new ArrayList<String>();
        for(int i = 0; i < listObUs.size(); i++){
            listUs.add(listObUs.get(i).getNombre());
        }
    }

    public void consultarTrabajadores() {
        SQLiteDatabase bd = conn.getReadableDatabase();

        listObTr = new ArrayList<Trabajador>();
        Cursor cursor = bd.rawQuery("SELECT * FROM " + Utilidades.Tabla_Trabajadores, null);
        while (cursor.moveToNext()) {
            Trabajador trabajador = new Trabajador();
            trabajador.setAlias(cursor.getString(1));
            trabajador.setPuesto(cursor.getString(2));
            listObTr.add(trabajador);
        }

        obtenerListaT();
    }

    public void obtenerListaT(){

        listTra = new ArrayList<String>();
        for(int i = 0; i < listObTr.size(); i++){
            listTra.add(listObTr.get(i).getAlias());
        }
    }
}
