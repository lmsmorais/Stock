package br.uniso.stock;

public class ProdutosActivity {


    public  static final String EXTRA_PRODUTO_ID = "produto_id";

    /*
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoprodutos);

        int id_produto = (Integer) getIntent().getExtras().get(EXTRA_PRODUTO_ID);

        SQLiteOpenHelper databaseHelper = new StockBD(this);

        try {

            SQLiteDatabase db = databaseHelper.getReadableDatabase();
            Cursor cursor = db.query(
                "STOCK",
                        new String[] {"_id" ,"Nome_do_produto" , "quantidade"},
                    "_id = ? ",
                    new String[] {Integer.toString(id_produto)},
                    null ,null ,null

                );

            if(cursor.moveToFirst()){

                int Id21 = cursor.getInt(0);
                String produtoString= cursor.getString(1);
                int quantidade21 = cursor.getInt(2);

                TextView id = (TextView) findViewById(R.id.id);
                id.setText(Id21);

                TextView nome = (TextView) findViewById(R.id.produto);
                nome.setText(produtoString);


                TextView quantidade = (TextView) findViewById(R.id.quantidade);
                quantidade.setText(quantidade21);

            }

            cursor.close();
            db.close();

        }catch (SQLiteException e){
        Toast toast = Toast.makeText(this, "Problema com banco de dados", Toast.LENGTH_LONG);
            Log.d("Erro_BD_ProdutoActivity", e.getMessage());
        toast.show();

        }



    }
     */

}
