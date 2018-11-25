package dev.eunicemercedes.uidesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LlamadaEntranteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada_entrante);
        ImageButton aceptar=findViewById(R.id.aceptarLlamada);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contestarLlamada();
            }
        });

    }
    void contestarLlamada(){
        Intent contestar=new Intent(getApplicationContext(),LlamadaEnCursoActivity.class);
        startActivity(contestar);
    }
}
