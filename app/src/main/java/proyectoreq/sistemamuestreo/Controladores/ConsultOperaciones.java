package proyectoreq.sistemamuestreo.Controladores;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import App.Operacion;
import proyectoreq.sistemamuestreo.R;
import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class ConsultOperaciones extends Activity {

    ListView listViewOp;

    ArrayList<String> listaOperaciones;
    ArrayList<Operacion> listaObjOperaciones;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_operaciones);

        conn = new ConexionSQLiteHelper(getApplicationContext(),"bd_muestreos",null,1);

        listViewOp = (ListView) findViewById(R.id.listViewOperaciones);
        consultarOperaciones();

        ArrayAdapter adap = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaOperaciones);
        listViewOp.setAdapter(adap);

    }

    public void consultarOperaciones() {
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

    public void obtenerLista(){

        listaOperaciones = new ArrayList<String>();
        for(int i = 0; i < listaObjOperaciones.size(); i++){
            listaOperaciones.add(listaObjOperaciones.get(i).getNombre());
        }


    }
}
