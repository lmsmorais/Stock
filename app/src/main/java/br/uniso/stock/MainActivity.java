package br.uniso.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickEstoqueAtual(View view){
        Intent intent = new Intent(this, EstoqueAtualActivity.class);
        startActivity(intent);
    }

    public void onClickAdicionarProdutoActivity(View view){
        Intent intent = new Intent(this, AdicionarProdutoActivity.class);
        startActivity(intent);
    }

    public void onClickFazerPedidoDeReposicao(View view){
        Intent intent = new Intent(this,FazerPedidoDeReposicaoActivity.class);
        startActivity(intent);
    }

    /*@Override Sem valores para serem salvos atualmente
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt( );
        super.onSaveInstanceState(savedInstanceState);

    } */
}