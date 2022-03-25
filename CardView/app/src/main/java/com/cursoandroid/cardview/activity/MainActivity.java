package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.preparaPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void preparaPostagens() {

        Postagem p = new Postagem("Jamiltonn", "#tbt Viagem maneira!", R.drawable.imagem1);
        this.postagens.add(p);
        p = new Postagem("Ana C.", "Promocao de viagens!", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Bruno D.", "#Paris!", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Carla E.", "Foto legal!", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
