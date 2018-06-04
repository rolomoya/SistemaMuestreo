package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

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
    ArrayList<String> listaOperaciones;
    ArrayList<Operacion> listaObjOperaciones;
    Spinner spinnerOp;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_muestreo);

        conn = new ConexionSQLiteHelper(getApplicationContext(),"bd_muestreos",null,1);

        spinnerOp = (Spinner) findViewById(R.id.spinnerOperacionesMuest);
        consultarOperaciones();
        ArrayAdapter<CharSequence> ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item,listaOperaciones);
        spinnerOp.setAdapter(ad);


        lvUsuarios = (ListView) findViewById(R.id.listViewUsuariosMuest);
        consultarUsuarios();

        ArrayAdapter adap1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listUs);
        lvUsuarios.setAdapter(adap1);

        lvTrabajadores = (ListView) findViewById(R.id.listViewTrabajadoresMuest);
        consultarTrabajadores();

        ArrayAdapter adap2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listTra);
        lvTrabajadores.setAdapter(adap2);
    }

    private void consultarOperaciones() {
        SQLiteDatabase bd = conn.getReadableDatabase();
        Operacion operacion = null;

        listaObjOperaciones = new ArrayList<Operacion>();
        Cursor cursor = bd.rawQuery("SELECT * FROM " + Utilidades.Tabla_Operaciones, null);
        int i = 0;
        while (cursor.moveToNext()) {
            operacion = new Operacion();
            operacion.setNombre(cursor.getString(1));
            operacion.setDescripcion(cursor.getString(2));

            i++;
            listaObjOperaciones.add(operacion);
        }

        obtenerLista();
    }

    private void obtenerLista() {
        listaOperaciones = new ArrayList<String>();
        for(int i = 0; i < listaObjOperaciones.size(); i++){
            listaOperaciones.add(listaObjOperaciones.get(i).getNombre());
        }
    }

    public void onClick(View view){
        //aqui se llama la instrucción sql para guardar el nombre y descripcion de la operacion
        registrar_Muestreo();
    }

    private void registrar_Muestreo() {
        
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
