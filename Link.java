package com.example.liua.csproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Link extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        //Button link = (Button)findViewById(R.id.link);

    }

    public void goToSo (View view) {
        goToUrl ( "http://stackoverflow.com/");
    }

    //public void goToSu (View view) {
   //     goToUrl ( "http://superuser.com/");
    //}

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    //Button link = (Button)findViewById(R.id.link);
    //link.OnClickListener(new View.OnClickListener() {
       // public void onClick(View v) {
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("http://www.yourURL.com"));
            //startActivity(intent);
        //}
    //});



}
