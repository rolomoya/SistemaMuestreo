package proyectoreq.sistemamuestreo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import proyectoreq.sistemamuestreo.utilidades.Utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.Crear_Tabla_Usuarios);
        db.execSQL(Utilidades.Crear_Tabla_Operaciones);
        db.execSQL(Utilidades.Crear_Tabla_Tareas);
        db.execSQL(Utilidades.Crear_Tabla_Trabajadores);
        db.execSQL(Utilidades.Crear_Tabla_Muestreos);
        db.execSQL(Utilidades.Crear_Tabla_ObservacionesXMuestreo);
        db.execSQL(Utilidades.Crear_Tabla_TrabajadorXmuestreo);
        db.execSQL(Utilidades.Crear_Tabla_UsuarioXMuestreo);
        db.execSQL(Utilidades.Crear_Tabla_TareasXOperacion);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        db.execSQL("DROP TABLE IF EXISTS tareas");
        db.execSQL("DROP TABLE IF EXISTS operaciones");
        db.execSQL("DROP TABLE IF EXISTS trabajadores");
        db.execSQL("DROP TABLE IF EXISTS muestreos");
        db.execSQL("DROP TABLE IF EXISTS observacionesXMuestreo");
        db.execSQL("DROP TABLE IF EXISTS trabajadoresXMuestre");
        db.execSQL("DROP TABLE IF EXISTS usuariosXMuestreo");
        db.execSQL("DROP TABLE IF EXISTS tareasXoperacion");
        onCreate(db);

    }
}
