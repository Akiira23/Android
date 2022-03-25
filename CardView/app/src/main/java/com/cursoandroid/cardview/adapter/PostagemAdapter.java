package com.cursoandroid.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> p) {
        this.postagens = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);
        holder.nome.setText(postagem.getNome());
        holder.postagem.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

       private TextView nome;
       private TextView postagem;
       private ImageView imagem;

       public MyViewHolder(@NonNull View itemView) {
           super(itemView);
           nome = itemView.findViewById(R.id.textNome);
           postagem = itemView.findViewById(R.id.textPostagem);
           imagem = itemView.findViewById(R.id.imagePostagem);
       }
   }
}
