package com.example.listacompras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_list_itens extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.listacompras.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_itens);
    }

    public void returnReply(View view) {
        Intent replyIntent = new Intent(this, MainActivity.class);
        replyIntent.putExtra(EXTRA_REPLY, "Arroz");
        startActivity(replyIntent);
    }

    public void secondButton(View view) {
        Intent replyIntent = new Intent(this, MainActivity.class);
        replyIntent.putExtra(EXTRA_REPLY, "Feijão");
        startActivity(replyIntent);
    }

    public void thirdButton(View view) {
        Intent replyIntent = new Intent(this, MainActivity.class);
        replyIntent.putExtra(EXTRA_REPLY, "Óleo");
        startActivity(replyIntent);
    }
}