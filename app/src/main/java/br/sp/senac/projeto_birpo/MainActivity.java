package br.sp.senac.projeto_birpo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Produtos> lstProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstProdutos = new ArrayList<>();

        lstProdutos.add(new Produtos("Nescafé","(TK 502)",R.id.btnComprar,R.drawable.imgnescafe));


        RecyclerView mRecyclerView =(RecyclerView)findViewById(R.id.id_recycleView);
        ProdutosAdapter produtosAdapter = new ProdutosAdapter(getApplicationContext(),lstProdutos);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        mRecyclerView.setAdapter(produtosAdapter);

    }
}
