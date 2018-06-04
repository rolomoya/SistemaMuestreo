package proyectoreq.sistemamuestreo.utilidades;

public class Utilidades {

    //TABLA USUARIOS

    public static final String Tabla_Usuarios = "usuarios";
    public static final String Registro_IdUsuario = "idUsuario";
    public static final String Registro_NombreUsuario = "nombre";
    public static final String Registro_Usuario = "usuario";
    public static final String Registro_Contrasenna = "contrasenna";



    public static final String Crear_Tabla_Usuarios = "CREATE TABLE " + Tabla_Usuarios +" ("+Registro_IdUsuario+" Integer PRIMARY KEY AUTOINCREMENT, "+Registro_NombreUsuario+" Text, "+Registro_Usuario+" Text, "+Registro_Contrasenna+" Text)";

    //TABLA OPERACIONES

    public static final String Tabla_Operaciones = "operaciones";
    public static final String Registro_IdOperacion = "idOperacion";
    public static final String Registro_NombreOperacion = "nombre";
    public static final String Registro_DescripcionOperacion  = "descripcion";

    public static final String Crear_Tabla_Operaciones = "CREATE TABLE "+Tabla_Operaciones+" ("+Registro_IdOperacion+" Integer PRIMARY KEY AUTOINCREMENT,"+Registro_NombreOperacion+" Text, "+Registro_DescripcionOperacion+" Text)";

    //TABLA TAREAS

    public static final String Tabla_Tareas = "tareas";
    public static final String Registro_IdTarea = "idTarea";
    public static final String Registro_NombreTarea = "nombre";
    public static final String Registro_TipoTarea  = "tipo";

    public static final String Crear_Tabla_Tareas = "CREATE TABLE "+Tabla_Tareas+" ("+Registro_IdTarea+" Integer PRIMARY KEY AUTOINCREMENT, "+ Registro_NombreTarea+" Text, "+Registro_TipoTarea+" Text)";

    //TABLA TRABAJADORES

    public static final String Tabla_Trabajadores = "trabajadores";
    public static final String Registro_IdTrabajador = "idTrabajador";
    public static final String Registro_AliasTrabajador = "alias";
    public static final String Registro_PuestoTrabajador = "puesto";

    public static final String Crear_Tabla_Trabajadores = "CREATE TABLE "+Tabla_Trabajadores+" ("+Registro_IdTrabajador+" Integer PRIMARY KEY AUTOINCREMENT, "+Registro_AliasTrabajador+" Text, "+Registro_PuestoTrabajador+" Text)";


    public static final String Crear_Tabla_Muestreos = "CREATE TABLE muestreos (idMuestreo Integer, descripcion Text, cantObservaciones Integer, idOperacion Integer, FechaInicio Text)";

    public static final String Crear_Tabla_ObservacionesXMuestreo = "CREATE TABLE observacionesXMuestreo (idOperacionXMuestreo Integer, idTarea Integer, idTrabajador Integer, idMuestreo Integer, fechaHora Text, temperatura Integer, humedad Integer)";

    public static final String Crear_Tabla_TrabajadorXmuestreo = "CREATE TABLE trabajadoresXMuestreo (idTrabajadorXMuestreo Integer,  idTrabajador Integer, idMuestreo Integer)";

    public static final String Crear_Tabla_UsuarioXMuestreo = "CREATE TABLE usuariosXMuestreo (idUsuarioXMuestreo Integer,  idUsuario Integer, idMuestreo Integer)";

    public static final String Crear_Tabla_TareasXOperacion = "CREATE TABLE tareasXoperacion (idTareaXoperacion Integer, idTarea Integer, idOperacion Integer)";
}
