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

    //TABLA MUESTREOS

    public static final String Tabla_Muestreos = "muestreos";
    public static final String Registro_IdMuestreo = "idMuestreo";
    public static final String Registro_descripcionMuestreo = "descripcion";
    public static final String Registro_cantObservaciones = "cantObservaciones";
    public static final String Registro_FKidOPeracion = "idOperacion";
    public static final String Registro_FechaMuestreo = "fechaInicio";

    public static final String Crear_Tabla_Muestreos = "CREATE TABLE "+Tabla_Muestreos+" ("+Registro_IdMuestreo+" Integer PRIMARY KEY AUTOINCREMENT, "+Registro_descripcionMuestreo+" Text, "+Registro_cantObservaciones+" Integer, "+Registro_FKidOPeracion+" Integer, "+Registro_FechaMuestreo+" Text, FOREIGN KEY ("+Registro_FKidOPeracion+") REFERENCES "+Tabla_Operaciones+"("+Registro_IdOperacion+"))";


    //TABLA OBSERVACIONES X MUESTREOS

    public static final String Tabla_observacionesXMuestreo = "observacionesXMuestreo";
    public static final String Registro_IdObservacionesXMuestreo = "idObservacionesXMuestreo";
    public static final String Registro_FKIdTarea = "idTarea";
    public static final String Registro_FKIdTrabajador = "idTrabajador";
    public static final String Registro_FKIdMuestreo = "idMuestreo";
    public static final String Registro_FechaObservaciones = "fechaHora";
    public static final String Registro_Temperatura = "temperatura";
    public static final String Registro_Humedad = "humedad";

    public static final String Crear_Tabla_ObservacionesXMuestreo = "CREATE TABLE "+Tabla_observacionesXMuestreo+" ("+Registro_IdObservacionesXMuestreo+
                                " Integer PRIMARY KEY AUTOINCREMENT, "+Registro_FKIdTarea+" Integer, "+Registro_FKIdTrabajador+" Integer, "+Registro_FKIdMuestreo+
                                " Integer, "+Registro_FechaObservaciones+" Text, "+Registro_Temperatura+" Integer, "+Registro_Humedad+" Integer, FOREIGN KEY ("+Registro_FKIdTarea+") REFERENCES "
            +Tabla_Tareas+"(    "+Registro_IdTarea+"),FOREIGN KEY ("+Registro_FKIdTrabajador+") REFERENCES "+Tabla_Trabajadores+"("+Registro_IdTrabajador+"), FOREIGN KEY ("+Registro_FKIdMuestreo+") REFERENCES "+Tabla_Muestreos+"("+Registro_IdMuestreo+"))";

    //TABLA TRABAJADOR X MUESTREO
    public static final String Tabla_TrabajadorXMuestreo = "trabajadoresXMuestreo";
    public static final String Registro_IdTrabajadorXMuestreo = "IdtrabajadoresXMuestreo";
    public static final String Registro_FKIdTrabajador2 = "idTrabajador";
    public static final String Registro_FKIdMuestreo2 = "idMuestreo";

    public static final String Crear_Tabla_TrabajadorXmuestreo = "CREATE TABLE "+Tabla_TrabajadorXMuestreo+" ("+Registro_IdTrabajadorXMuestreo+" Integer PRIMARY KEY AUTOINCREMENT,  "+Registro_FKIdTrabajador2+" Integer, "+Registro_FKIdMuestreo2+" Integer,  FOREIGN KEY ("+Registro_FKIdMuestreo2+") REFERENCES "+Tabla_Muestreos+"("+Registro_IdMuestreo+"), FOREIGN KEY ("+Registro_FKIdTrabajador2+") REFERENCES "+Tabla_Trabajadores+"("+Registro_IdTrabajador+"))";

    //TABLA USUARIO X MUESTREO

    public static final String Tabla_UsuarioXMuestreo = "usuariosXMuestreo";
    public static final String Registro_IdUsuarioXMuestreo = "IdusuariosXMuestreo";
    public static final String Registro_FKIdUsuario = "idUsuario";
    public static final String Registro_FKIdMuestreo3 = "idMuestreo";

    public static final String Crear_Tabla_UsuarioXMuestreo = "CREATE TABLE "+Tabla_UsuarioXMuestreo+" ("+Registro_IdUsuarioXMuestreo+" Integer PRIMARY KEY AUTOINCREMENT,  "+Registro_FKIdUsuario+" Integer, "+Registro_FKIdMuestreo3+" Integer,  FOREIGN KEY ("+Registro_FKIdMuestreo3+") REFERENCES "+Tabla_Muestreos+"("+Registro_IdMuestreo+"), FOREIGN KEY ("+Registro_FKIdUsuario+") REFERENCES "+Tabla_Usuarios+"("+Registro_IdUsuario+") )";

    public static final String Tabla_TareaXOperacion = "tareasXoperacion";
    public static final String Registro_IdTareaXOperacion = "idTareaXoperacion";
    public static final String Registro_FKIdTarea2 = "idTarea";
    public static final String Registro_FKIdOperacion2 = "idOperacion";
    public static final String Crear_Tabla_TareasXOperacion = "CREATE TABLE "+Tabla_TareaXOperacion+" ("+Registro_IdTareaXOperacion+" Integer PRIMARY KEY AUTOINCREMENT, "+Registro_FKIdTarea2+" Integer, "+Registro_FKIdOperacion2+" Integer, FOREIGN KEY ("+Registro_FKIdTarea2+") REFERENCES "+Tabla_Tareas+"("+Registro_IdTarea+"), FOREIGN KEY ("+Registro_FKIdOperacion2+") REFERENCES "+Tabla_Operaciones+"("+Registro_IdOperacion+") )";
}
