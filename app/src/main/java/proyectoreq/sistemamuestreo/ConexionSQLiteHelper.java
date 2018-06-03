package proyectoreq.sistemamuestreo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String Crear_Tabla_Usuarios = "CREATE TABLE usuarios (idUsuario Integer, nombre Text, usuario Text, contrasenna Text)";
    final String Crear_Tabla_Operaciones = "CREATE TABLE operaciones (idOperacion Integer,nombre Text, descripcion Text)";
    final String Crear_Tabla_Tareas = "CREATE TABLE tareas (idTarea Integer, nombre Text, tipo Text)";
    final String Crear_Tabla_Trabajadores = "CREATE TABLE trabajadores (idTrabajador Integer, alias Text, puesto Text)";
    final String Crear_Tabla_Muestreos = "CREATE TABLE muestreos (idMuestreo Integer, descripcion Text, cantObservaciones Integer, idOperacion Integer, FechaInicio Text)";
    final String Crear_Tabla_ObservacionesXMuestreo = "CREATE TABLE observacionesXMuestreo (idOperacionXMuestreo Integer, idTarea Integer, idTrabajador Integer, idMuestreo Integer, fechaHora Text, temperatura Integer, humedad Integer)";
    final String Crear_Tabla_TrabajadorXmuestreo = "CREATE TABLE trabajadoresXMuestreo (idTrabajadorXMuestreo Integer,  idTrabajador Integer, idMuestreo Integer)";
    final String Crear_Tabla_UsuarioXMuestreo = "CREATE TABLE usuariosXMuestreo (idUsuarioXMuestreo Integer,  idUsuario Integer, idMuestreo Integer)";
    final String Crear_Tabla_TareasXOperacion = "CREATE TABLE tareasXoperacion (idTareaXoperacion Integer, idTarea Integer, idOperacion Integer)";

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Crear_Tabla_Usuarios);
        db.execSQL(Crear_Tabla_Operaciones);
        db.execSQL(Crear_Tabla_Tareas);
        db.execSQL(Crear_Tabla_Trabajadores);
        db.execSQL(Crear_Tabla_Muestreos);
        db.execSQL(Crear_Tabla_ObservacionesXMuestreo);
        db.execSQL(Crear_Tabla_TrabajadorXmuestreo);
        db.execSQL(Crear_Tabla_UsuarioXMuestreo);
        db.execSQL(Crear_Tabla_TareasXOperacion);

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
