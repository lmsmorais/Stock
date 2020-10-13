package br.uniso.stock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FazerPedidoDeReposicaoActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_pedido_de_reposicao);
    }

    public void onEnviarPedidoDeReposicao(View view){

        EditText viewMensagem = (EditText) findViewById(R.id.mensagemDeReposicao);
        String txtMensagem = viewMensagem.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, txtMensagem);

        startActivity(intent);
    }

}
