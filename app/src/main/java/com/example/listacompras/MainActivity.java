package com.example.listacompras;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String item = intent.getStringExtra(activity_list_itens.EXTRA_REPLY);
        TextView produto1 = findViewById(R.id.text_view_um);
        TextView produto2 = findViewById(R.id.text_view_dois);
        TextView produto3 = findViewById(R.id.text_view_tres);
        produto1.setText(item);

    }

    public void showListItens(View view) {
        Intent intent = new Intent(this,activity_list_itens.class);
        startActivity(intent);
    }
}