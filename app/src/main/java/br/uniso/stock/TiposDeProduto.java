package br.uniso.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TiposDeProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        /*
        ListView listView = findViewById(R.id.lista_produtos);

        SQLiteOpenHelper databaseHelper = new StockBD(this);

        try {
            db = databaseHelper.getReadableDatabase();
            cursor = db.query(
                    "STOCK",
                    new String[] {"_id" ,"nome"},
            null,null , null , null, "nome ASC"

            );

            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[] {"nome"},
                    new int[] {android.R.id.text1},
                    0
            );
            listView.setAdapter((listAdapter));

        }catch (SQLiteException e){
        Toast toast = Toast.makeText(this, "Problema com banco de dados2", Toast.LENGTH_LONG);
        Log.d("ErroBD_TypeProdActivity", e.getMessage());
        toast.show();

    }

         */
        ArrayAdapter<Produtos> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,

                Produtos.estoque

        );

        ListView list = (ListView) findViewById(R.id.lista_produtos);
        list.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posiçao, long ids) {
                Intent intent = new Intent(TiposDeProduto.this, ProdutosActivity.class);
                intent.putExtra(ProdutosActivity.EXTRA_PRODUTO_ID, (int) ids);
                startActivity(intent);

            }
        };
        list.setOnItemClickListener(itemClickListener) ;

        }
    }
