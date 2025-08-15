package br.com.etecia.myapp;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    RecyclerView idListaProdutos;
    List<Produtos> lstProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Criando uma array que vai carregar a lista de produtos

        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("A56",R.drawable.a56));
        lstProdutos.add(new Produtos("S24",R.drawable.s24azul));
        lstProdutos.add(new Produtos("PS5",R.drawable.ps5));
        lstProdutos.add(new Produtos("Xbox",R.drawable.xbox));
        lstProdutos.add(new Produtos("Book 4",R.drawable.book4));
        lstProdutos.add(new Produtos("Dell",R.drawable.dellnote));
        lstProdutos.add(new Produtos("Apple Watch",R.drawable.applewatch));
        lstProdutos.add(new Produtos("Watch 7",R.drawable.watch7));
        lstProdutos.add(new Produtos("Buds 3 Pro",R.drawable.buds3pro));
        lstProdutos.add(new Produtos("Air Dots",R.drawable.airdots));


        idListaProdutos = findViewById(R.id.idListaProdutos);

        // tipo de layout
        idListaProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //instanciar o adaptador
        AdaptadorProduto adapter = new AdaptadorProduto(getApplicationContext(),lstProdutos);

        idListaProdutos.setAdapter(adapter);

    }
}