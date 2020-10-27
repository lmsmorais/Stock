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

        /* EditText viewMensagem = (EditText) findViewById(R.id.mensagemDeReposicao);
        String txtMensagem = viewMensagem.getText().toString(); */

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");


        EditText edt;
        String msg,qtd, produto, id ;

        edt = (EditText) findViewById(R.id.edtid);
        id = edt.getText().toString();

        edt = (EditText) findViewById(R.id.edtQtd);
        qtd = edt.getText().toString();

        edt = (EditText) findViewById(R.id.edtProduto);
        produto = edt.getText().toString();

        msg = "Enviar "+ qtd + " unidades do produto " + produto + " id = " + id;

        intent.putExtra(Intent.EXTRA_TEXT, "Fornecimento");
        intent.putExtra(Intent.EXTRA_TEXT, msg);

        startActivity(intent);
    }

}
