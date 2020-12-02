
package br.uniso.stock;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StockBD extends SQLiteOpenHelper {

    private static final String DB_NAME="Stock";
    private  static final  int DB_VERSION=1;

    StockBD(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        atualizaStock(db , 0, DB_VERSION);
        String sql;

        sql = "CREATE TABLE STOCK (" +
                "_id INTEGER PRIMARY KEY, " +
                "Nome_do_produto TEXT," +
                "quantidade INTEGER  " +
                ");";


        db.execSQL(sql);

        InsertStock(db,"1" , "Pedra" , "234" );
        InsertStock(db,"2" , "Ferro" , "654" );
        InsertStock(db,"3" , "Aço" , "127" );


    }
    public  static  void  InsertStock(SQLiteDatabase db, String id, String produto, String quantidade){

        ContentValues stockadd = new ContentValues();
        stockadd.put("_id", id);
        stockadd.put("Nome_do_produto", produto);
        stockadd.put("quantidade", quantidade);


        db.insert("STOCK", null, stockadd);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        atualizaStock(db , oldVersion, newVersion);
    }
    private void atualizaStock(SQLiteDatabase db, int oldVersion, int newVersion){

        String sql;
        if(oldVersion < 1 ){

                sql = "CREATE TABLE STOCK (" +
                        "_id INTEGER PRIMARY KEY, " +
                        "Nome_do_produto TEXT," +
                        "quantidade INTEGER  " +
                        ");";


                db.execSQL(sql);

                InsertStock(db,"ID" , "Produto" , "quantidade" );

    }
        if (oldVersion <= 2 ){
            sql="ALTER TABLE STOCK ADD COLUMN Favorita NUMERIC";
            db.execSQL(sql);
        }
    }
}
