package com.cursoandroid.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursoandroid.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sobre extends Fragment {


    public Sobre() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Etiam sodales leo vel augue egestas, id sollicitudin est tincidunt. Mauris non " +
                "consequat magna, quis pretium nunc. In faucibus metus a ornare elementum.";
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);

        Element versao = new Element();
        versao.setTitle("versao 1.0");

       return new AboutPage(getActivity())
               .setImage(R.drawable.logo)
               .setDescription(descricao)

               .addGroup("Entre em contato")
               .addEmail("atendimento@atm.com.br", "Envie um Email")
               .addWebsite("google.com", "Acesse nosso site")
               .addGroup("Redes Sociais")
               .addFacebook("the.medy", "Facebook")
               .addInstagram("the.medy","Instagram")
               .addTwitter("the.medy", "Twitter")
               .addYoutube("the.medy", "YouTube")
               .addGitHub("the.medy", "GitHub")
               .addPlayStore("com.facebook.katana", "Download App")

               .addItem(versao)
               
                .create();
    }

}
