package com.neck.findme.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import com.neck.findme.sqlite.EstructuraBd.CalificacionEstablecimiento;
import com.neck.findme.sqlite.EstructuraBd.Direccion;
import com.neck.findme.sqlite.EstructuraBd.Especialidad;
import com.neck.findme.sqlite.EstructuraBd.Establecimiento;
import com.neck.findme.sqlite.EstructuraBd.EstadoMunicipio;
import com.neck.findme.sqlite.EstructuraBd.Giro;
import com.neck.findme.sqlite.EstructuraBd.Pedido;
import com.neck.findme.sqlite.EstructuraBd.PedidoProductoServicio;
import com.neck.findme.sqlite.EstructuraBd.Persona;
import com.neck.findme.sqlite.EstructuraBd.ProductoServicio;
import com.neck.findme.sqlite.EstructuraBd.Promocion;
import com.neck.findme.sqlite.EstructuraBd.PromocionPersona;
import com.neck.findme.sqlite.EstructuraBd.TipoProducto;
import com.neck.findme.sqlite.EstructuraBd.Usuario;

/**
 * Created by Kevin on 22/08/2016.
 */
public class BaseDatosOH extends SQLiteOpenHelper {

    private static final String NOMBRE_BASE_DATOS = "findme.neck";

    private static final int VERSION_ACTUAL = 3;

    private final Context contexto;

    public interface Tablas {
        String CALIFICACION_ESTABLECIMIENTO = "calificacion_establecimiento";
        String DIRECCION = "direccion";
        String ESPECIALIDAD = "especialidad";
        String ESTABLECIMIENTO = "establecimiento";
        String ESTADO_MUNICIPIO = "estado_municipio";
        String GIRO = "giro";
        String PEDIDO = "pedido";
        String PEDIDO_PRODUCTO_SERVICIO = "pedido_producto_servicio";
        String PERSONA = "persona";
        String PRODUCTO_SERVICIO = "producto_servicio";
        String PROMOCION = "promocion";
        String PROMOCION_PERSONA = "promocion_persona";
        String TIPO_PRODUCTO = "tipo_producto";
        String USUARIO = "usuario";
    }

    public interface Referencias {
        String ID_DIRECCION = String.format("REFERENCES %s(%s)", Tablas.DIRECCION, Direccion.ID);
        String ID_ESPECIALIDAD = String.format("REFERENCES %s(%s)", Tablas.ESPECIALIDAD, Especialidad.ID);
        String ID_ESTABLECIMIENTO = String.format("REFERENCES %s(%s)", Tablas.ESTABLECIMIENTO, Establecimiento.ID);
        String ID_ESTADO_MUNICIPIO = String.format("REFERENCES %s(%s)", Tablas.ESTADO_MUNICIPIO, EstadoMunicipio.ID);
        String ID_GIRO = String.format("REFERENCES %s(%s)", Tablas.GIRO, Giro.ID);
        String ID_PEDIDO = String.format("REFERENCES %s(%s)", Tablas.PEDIDO, Pedido.ID);
        String ID_PERSONA = String.format("REFERENCES %s(%s)", Tablas.PERSONA, Persona.ID);
        String ID_PRODUCTO_SERVICIO = String.format("REFERENCES %s(%s)", Tablas.PRODUCTO_SERVICIO, ProductoServicio.ID);
        String ID_PROMOCION = String.format("REFERENCES %s(%s)", Tablas.PROMOCION,Promocion.ID );
        String ID_TIPO_PRODUCTO = String.format("REFERENCES %s(%s)", Tablas.TIPO_PRODUCTO, TipoProducto.ID);
        String ID_USUARIO = String.format("REFERENCES %s(%s)", Tablas.USUARIO, Usuario.ID);
    }

    public BaseDatosOH(Context contexto) {
        super(contexto, NOMBRE_BASE_DATOS, null, VERSION_ACTUAL);
        this.contexto = contexto;
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                db.setForeignKeyConstraintsEnabled(true);
            } else {
                db.execSQL("PRAGMA foreign_keys=ON");
            }
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s ( " +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(150) NOT NULL, " +
                        "%s VARCHAR(20) NOT NULL)",
                Tablas.USUARIO,
                Usuario.ID,
                Usuario.EMAIL,
                Usuario.CONTRASENIA));

        db.execSQL(String.format("CREATE TABLE  IF NOT EXISTS %s ( " +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(100) NOT NULL, " +
                        "%s INTEGER)",
                Tablas.ESTADO_MUNICIPIO,
                EstadoMunicipio.ID,
                EstadoMunicipio.DSC,
                EstadoMunicipio.PARENT_ID));

        db.execSQL(String.format("CREATE TABLE  IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(50) NOT NULL, " +
                        "%s VARCHAR(50) NOT NULL, " +
                        "%s VARCHAR(10) NOT NULL, " +
                        "%s VARCHAR(10), " +
                        "%s VARCHAR(10), " +
                        "%s VARCHAR(10), " +
                        "%s VARCHAR(5), " +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s )",
                Tablas.DIRECCION,
                Direccion.ID,
                Direccion.COLONIA,
                Direccion.CALLE,
                Direccion.NO_EXT,
                Direccion.NO_INT,
                Direccion.LOTE,
                Direccion.MZ,
                Direccion.CP,
                Direccion.ESTADO_ID, Referencias.ID_ESTADO_MUNICIPIO,
                Direccion.MUNICIPIO, Referencias.ID_ESTADO_MUNICIPIO));

        db.execSQL(String.format("CREATE TABLE  IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(100) NOT NULL, " +
                        "%s VARCHAR(100) NOT NULL, " +
                        "%s VARCHAR(100), " +
                        "%s INTEGER %s, " +
                        "%s INTEGER NOT NULL %s )",
                Tablas.PERSONA,
                Persona.ID,
                Persona.NOMBRE,
                Persona.P_APELLIDO,
                Persona.S_APELLIDO,
                Persona.DIRECCION_ID, Referencias.ID_DIRECCION,
                Persona.USUARIO_ID, Referencias.ID_USUARIO));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(50) NOT NULL)",
                Tablas.GIRO,
                Giro.ID,
                Giro.DSC));

        db.execSQL(String.format("CREATE TABLE  IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(50) NOT NULL, " +
                        "%s INTEGER NOT NULL)",
                Tablas.ESPECIALIDAD,
                Especialidad.ID,
                Especialidad.DSC,
                Especialidad.GIRO_ID));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(100) NOT NULL, " +
                        "%s VARCHAR(10) NOT NULL, " +
                        "%s BIGINT, " +
                        "%s BIGINT, " +
                        "%s SMALLINT, " +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s)",
                Tablas.ESTABLECIMIENTO,
                Establecimiento.ID,
                Establecimiento.NOMBRE,
                Establecimiento.TELEFONO,
                Establecimiento.COORD_X,
                Establecimiento.COORD_Y,
                Establecimiento.SERVICIO_DOMICILIO,
                Establecimiento.DIRECCION_ID, Referencias.ID_DIRECCION,
                Establecimiento.USUARIO_ID, Referencias.ID_USUARIO,
                Establecimiento.GIRO_ID, Referencias.ID_GIRO,
                Establecimiento.ESPECIALIDAD_ID, Referencias.ID_ESPECIALIDAD));

        db.execSQL(String.format("CREATE TABLE  IF NOT EXISTS %s(" +
                        "%s INTEGER NOT NULL, " +
                        "%s INTEGER NOT NULL %s," +
                        "%s INTEGER NOT NULL %s," +
                        "%s VARCHAR(200) )",
                Tablas.CALIFICACION_ESTABLECIMIENTO,
                CalificacionEstablecimiento.CALIFICACION,
                CalificacionEstablecimiento.ESTABLECIMIENTO_ID, Referencias.ID_ESTABLECIMIENTO,
                CalificacionEstablecimiento.USUARIO_ID, Referencias.ID_USUARIO,
                CalificacionEstablecimiento.OBSERVACIONES));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(50) NOT NULL)",
                Tablas.TIPO_PRODUCTO,
                TipoProducto.ID,
                TipoProducto.DSC));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s VARCHAR(100) NOT NULL, " +
                        "%s VARCHAR(200), " +
                        "%s DECIMAL(3,2), " +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s )",
                Tablas.PRODUCTO_SERVICIO,
                ProductoServicio.ID,
                ProductoServicio.PRODUCTO_SERVICIO,
                ProductoServicio.DESCRIPCION,
                ProductoServicio.PRECIO,
                ProductoServicio.ESTABLECIMIENTO_ID, Referencias.ID_ESTABLECIMIENTO,
                ProductoServicio.TIPO_PRODUCTO_ID, Referencias.ID_TIPO_PRODUCTO));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                        "%s DATETIME NOT NULL, " +
                        "%s DECIMAL(5,2)," +
                        "%s INTEGER NOT NULL %s, " +
                        "%s INTEGER NOT NULL %s )",
                Tablas.PEDIDO,
                Pedido.ID,
                Pedido.FECHA_HORA,
                Pedido.TOTAL,
                Pedido.ESTABLECIMIENTO_ID, Referencias.ID_ESTABLECIMIENTO,
                Pedido.PERSONA_ID,Referencias.ID_PERSONA));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER NOT NULL, " +
                        "%s INTEGER NOT NULL %s," +
                        "%s INTEGER NOT NULL %s )",
                Tablas.PEDIDO_PRODUCTO_SERVICIO,
                PedidoProductoServicio.CANTIDAD,
                PedidoProductoServicio.PRODUCTO_SERVICIO_ID, Referencias.ID_PRODUCTO_SERVICIO,
                PedidoProductoServicio.PEDIDO_ID, Referencias.ID_PEDIDO));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                "%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                "%s DATE NOT NULL, " +
                "%s DATE NOT NULL, " +
                "%s VARCHAR(200), " +
                "%s INTEGER NOT NULL %s )",
                Tablas.PROMOCION,
                Promocion.ID,
                Promocion.FECHA_INICIO,
                Promocion.FECHA_FIN,
                Promocion.DESCRIPCION,
                Promocion.ESTABLECIMIENTO_ID,Referencias.ID_ESTABLECIMIENTO));

        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(" +
                        "%s INTEGER NOT NULL %s," +
                        "%s INTEGER NOT NULL %s )",
                Tablas.PROMOCION_PERSONA,
                PromocionPersona.PERSONA_ID, Referencias.ID_PERSONA,
                PromocionPersona.PROMOCION_ID, Referencias.ID_PROMOCION));

        insetCatalogs(db);
    }
    private void insetCatalogs(SQLiteDatabase db){
        db.execSQL("insert or ignore into giro(id, dsc) values(1,'Alimenticio')");
        db.execSQL("insert or ignore into especialidad values(1,'Comida Corrida',1)");
        db.execSQL("insert or ignore into especialidad values(2,'Tacos',1)");
        db.execSQL("insert or ignore into especialidad values(3,'Antojitos Mexicanos',1)");
        db.execSQL("insert or ignore into especialidad values(4,'Comida China',1)");
        db.execSQL("insert or ignore into especialidad values(5,'Comida Japonesa',1)");
        db.execSQL("insert or ignore into especialidad values(6,'Fast Food',1)");
        db.execSQL("insert or ignore into especialidad values(7,'Hamburguesas',1)");
        db.execSQL("insert or ignore into especialidad values(8,'Ensaladas',1)");
        db.execSQL("insert or ignore into especialidad values(9,'Alitas',1)");
        db.execSQL("insert or ignore into especialidad values(10,'Pizzas',1)");
        db.execSQL("insert or ignore into especialidad values(11,'Helados',1)");
        db.execSQL("insert or ignore into especialidad values(12,'Comida Italiana',1)");
        db.execSQL("insert or ignore into especialidad values(13,'Crepas',1)");
        db.execSQL("insert or ignore into especialidad values(14,'Postres',1)");
        db.execSQL("insert or ignore into especialidad values(14,'Postres',1)");
        //db.execSQL("insert or ignore into ");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*db.execSQL("DROP TABLE IF EXISTS " + Tablas.CALIFICACION_ESTABLECIMIENTO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.DIRECCION);
        //db.execSQL("DROP TABLE IF EXISTS " + Tablas.ESPECIALIDAD);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.ESTABLECIMIENTO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.ESTADO_MUNICIPIO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.GIRO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PEDIDO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PEDIDO_PRODUCTO_SERVICIO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PERSONA);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PRODUCTO_SERVICIO);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PROMOCION);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.PROMOCION_PERSONA);
        db.execSQL("DROP TABLE IF EXISTS " + Tablas.TIPO_PRODUCTO);
        //db.execSQL("DROP TABLE IF EXISTS " + Tablas.USUARIO);*/
        onCreate(db);
    }
    public void insertLocales(SQLiteDatabase db){
       db.execSQL("INSERT OR IGNORE INTO establecimiento (id,nombre, telefono, usuario_id, direccion_id, giro_id, especialidad_id, coord_x, coord_y, servicio_domicilio) " +
               "VALUES (1,'Taquería Selene', '5558810346', 1, 1, 1, 2, 19.6423273, -99.2309641, 0);");
        db.execSQL("INSERT OR IGNORE INTO establecimiento (id,nombre, telefono, usuario_id, direccion_id, giro_id, especialidad_id, coord_x, coord_y, servicio_domicilio) " +
                "VALUES (2,'Antojitos Mexicanos \"Los güeros\"', '5591951874', 2, 1, 1, 2, 19.6392595, -99.2124135, 0);");
    }
    public void insertDirecciones(SQLiteDatabase db){
        db.execSQL("INSERT OR IGNORE INTO direccion (id,colonia, calle, no_ext, no_int, lote, mz, cp, estado_id, municipio_id) " +
                "VALUES (1,'Colinas del Lago', 'Calle Río Lerma', '107', NULL, NULL, NULL, 54744 , 15, 1002);");
        db.execSQL("INSERT OR IGNORE INTO direccion (id,colonia, calle, no_ext, no_int, lote, mz, cp, estado_id, municipio_id) " +
                "VALUES (2,'Infonavit Centro', 'Av. Jose Ma. Morelos', 'S/N', NULL, NULL, NULL, 54700 , 15, 1002);");
    }
    public void insertLocalidades(SQLiteDatabase db){
        db.execSQL("insert or ignore into estado_municipio values(15,'Estado de México',null)");
        db.execSQL("insert or ignore into estado_municipio values(1002,'Cuautitlan Izcalli',15)");
    }
}
