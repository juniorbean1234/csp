package com.example.nelsonj.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class Startscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);

        Button button = (Button) findViewById(R.id.clickbutton);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Startscreen.this, MainActivity1.class));
            }
        });
        Button button2 = (Button) findViewById(R.id.button);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] x = new String[4];
                x[0]="http://www.popsci.com/robot/roach/can/jump/to/great/heights";
                x[1]="http://www.livescience.com/54908/shape/shifting/device/can/morph/on/demand.html";
                x[2]="http://www.livescience.com/54898/brightest/x/ray/laser/blows/up/water/droplets/in/stunning-\n" +
                        "video.html";
                x[3]="http://www.livescience.com/54877/hypersonic/hifire/engine/test/flight.html";
                Random rand = new Random();
                Uri uri = Uri.parse(x[rand.nextInt(3)]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



    }}
