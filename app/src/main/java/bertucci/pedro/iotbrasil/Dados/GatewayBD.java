package bertucci.pedro.iotbrasil.Dados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pedro on 19/05/17.
 */

public class GatewayBD {

    private SQLiteDatabase sqLiteDb;

    public GatewayBD (Context context){
        sqLiteDb = new DataBaseHelper(context).getWritableDatabase();
    }

    public void inserir(Gateway gateway) throws Exception{
        ContentValues valores = new ContentValues();

        valores.put("nome",gateway.getNome());
        valores.put("telefone", gateway.getTelefone());
        sqLiteDb.insert("gateway",null,valores);

    }

    public String listar(){

        List <Gateway> list = new ArrayList<>();

        String[] colunas = new String[]{"nome", "telefone"};

        Cursor cursor = sqLiteDb.query("gateway",colunas,null,null,null,null, "nome ASC");

        if(cursor.getCount()>0){
            cursor.moveToFirst();

            do{

                return cursor.getString(cursor.getColumnIndex("telefone"));

            }while (cursor.moveToNext());
        }


        return  null;
    }
}
