package com.cursoandroid.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.aula.recyclerview.RecyclerItemClickListener;
import com.cursoandroid.recyclerview.R;
import com.cursoandroid.recyclerview.activity.adapter.Adapter;
import com.cursoandroid.recyclerview.activity.model.Filme;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Filmes
        this.criarFilmes();

        //configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), "Item pressionado: " + filme.getTituloFilme(), Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), "Click longo: " + filme.getTituloFilme(), Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    public void criarFilmes() {
        Filme filme = new Filme("titulo1", "genero11", "2015");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo2", "genero12", "2020");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3", "genero13", "2010");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo4", "genero14", "2016");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo5", "genero15", "2022");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo22", "genero121", "2022");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo33", "genero132", "2012");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo44", "genero143", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo55", "genero154", "2021");
        this.listaFilmes.add(filme);
    }
}
