package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import App.Operacion;
import App.Tarea;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class ConsultarTareas extends Activity {

    ListView listViewTar;

    ArrayList<String> listaTareas;
    ArrayList<Tarea> listaObjTareas;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_tareas);

        conn = new ConexionSQLiteHelper(getApplicationContext(),"bd_muestreos",null,1);

        listViewTar = (ListView) findViewById(R.id.ListViewTareas);
        consultarOperaciones();

        ArrayAdapter adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaTareas);
        listViewTar.setAdapter(adap);

    }

    public void consultarOperaciones() {
        SQLiteDatabase bd = conn.getReadableDatabase();
        Tarea tar = null;

        listaObjTareas = new ArrayList<Tarea>();
        Cursor cursor = bd.rawQuery("SELECT * FROM " + Utilidades.Tabla_Tareas, null);
        int i = 0;
        while (cursor.moveToNext()) {
            tar = new Tarea();
            tar.setNombre(cursor.getString(1));
            tar.setTipo(cursor.getString(2));
            i++;
            listaObjTareas.add(tar);
        }

        obtenerLista();
    }

    public void obtenerLista(){

        listaTareas = new ArrayList<String>();
        for(int i = 0; i < listaObjTareas.size(); i++){
            listaTareas.add("Tarea: "+listaObjTareas.get(i).getNombre() + " - Tipo: " + listaObjTareas.get(i).getTipo());
        }


    }
}
