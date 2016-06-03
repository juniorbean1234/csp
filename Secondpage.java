package com.example.liua.csproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        Button btnn = (Button)findViewById(R.id.physics);
        Button btnnn = (Button)findViewById(R.id.alg2);
    btnn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        startActivity(new Intent(Secondpage.this, Physicspage.class));
    }
    }

    );
        btnnn.setOnClickListener(new View.OnClickListener()

                                {
                                    @Override
                                    public void onClick (View v){
                                        startActivity(new Intent(Secondpage.this, Link.class));
                                    }
                                }

        );
}
}
