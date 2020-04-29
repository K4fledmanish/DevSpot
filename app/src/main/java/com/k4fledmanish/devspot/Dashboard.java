package com.k4fledmanish.devspot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;


public class Dashboard extends AppCompatActivity implements View.OnClickListener{


    private CardView openQRScanner;
    private CardView openBookActivity;
    private CardView openEventActivity;
    private CardView openAboutActivity;
    private CardView logout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        openQRScanner = (CardView) findViewById(R.id.qrScanner);


        openBookActivity = (CardView) findViewById(R.id.books);
        openEventActivity = (CardView) findViewById(R.id.events);
        openAboutActivity = (CardView) findViewById(R.id.about);
        logout = (CardView) findViewById(R.id.logout);



        // adding on click listener for the each cardview


        openQRScanner.setOnClickListener(this);
        openAboutActivity.setOnClickListener(this);
        openBookActivity.setOnClickListener(this);
        openEventActivity.setOnClickListener(this);
        logout.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.books : i = new Intent(Dashboard.this,BooksActivity.class);startActivity(i);break;
            case R.id.events : i = new Intent(Dashboard.this,EventsActivity.class);startActivity(i);break;
            case R.id.about : i = new Intent(Dashboard.this,About.class);startActivity(i);break;

            case R.id.logout:FirebaseAuth.getInstance().signOut();startActivity(new Intent(Dashboard.this,Splash.class));finish();break;



            case R.id.qrScanner : i = new Intent(Dashboard.this,QrBarCodeScanner.class);startActivity(i);break;
            default:break;
        }

    }
}