package br.uniso.stock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EstoqueAtualActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estoque_atual);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posiçao, long id) {
                if(posiçao == 0){
                    Intent intent = new Intent(EstoqueAtualActivity.this, TiposDeProduto.class);
                    startActivity(intent);

                }

            }
        };
        ListView list = (ListView) findViewById(R.id.list_opçoes);
        list.setOnItemClickListener(itemClickListener);
    }
}
