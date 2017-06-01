package bertucci.pedro.iotbrasil.Dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pedro on 19/05/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Gateway";
    private static final int DATABASE_VERSION = 1;

    private static String GATEWAY = "CREATE TABLE gateway (" +
            "id_gateway INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nome TEXT, telefone TEXT)";

    private static String SMS = "CREATE TABLE sms(" +
            "id_sms INTEGER PRIMARY KEY AUTOINCREMENT," +
            "numero TEXT, selecinado TEXT)";

    private static String TPC = "CREATE TABLE tcp(" +
            "id_tcp INTEGER PRIMARY KEY AUTOINCREMENT," +
            "ip TEXT, selecionado TEXT)";

    private static String DEVICE = "CREATE TABLE decive(" +
            "id_device INTEGER PRIMARY KEY AUTOINCREMENT," +
            "id INTEGER, nome_device TEXT)";

    private static String CANAL = "CREATE TABLE canal(" +
            "id_canal INTEGER PRIMARY KEY AUTOINCREMENT," +
            "canal1 text, canal2 text, canal3 text,canal4 text)";

    DataBaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(GATEWAY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE gateway");
        onCreate(db);
    }
}
