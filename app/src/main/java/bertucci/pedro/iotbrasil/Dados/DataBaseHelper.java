package bertucci.pedro.iotbrasil.Dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pedro on 19/05/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DadosGateway";
    private static final int DATABASE_VERSION = 1;

    private static String GATEWAY = "CREATE TABLE gateway (" +
            "id_gateway INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nome text, telefone text)";

    private static String CANAL = "CREATE TABLE canal (" +
            "id_canal INTEGER PRIMARY KEY AUTOINCREMENT," +
            "canal text)";

    private static String TELEFONES = "CREATE TABLE telefones (" +
            "id_telefone INTEGER PRIMARY AUTOINCREMENT," +
            "telefone text)";

    DataBaseHelper(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(GATEWAY);
        db.execSQL(CANAL);
        db.execSQL(TELEFONES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE gateway");
        db.execSQL("DROP TABLE canal");
        db.execSQL("DROP TABLE telefones");
        onCreate(db);
    }
}
