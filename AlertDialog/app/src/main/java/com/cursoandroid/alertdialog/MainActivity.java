package com.cursoandroid.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Titulo da dialog.");
        dialog.setMessage("Mensagem da dialog.");

        //configurar cancelamento(ao clicar fora da caixa)
        dialog.setCancelable(false);

        //confugurar icone
        dialog.setIcon(android.R.drawable.ic_dialog_alert);

        //configurar acoes para sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Executar acao ao clicar o botao sim.", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Executar acao ao clicar o botao nao.", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.create();
        dialog.show();

    }
}
