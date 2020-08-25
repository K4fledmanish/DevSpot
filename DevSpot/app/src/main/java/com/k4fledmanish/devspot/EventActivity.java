package com.k4fledmanish.devspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class EventActivity extends AppCompatActivity {



    private TextView tvvtitle, tvvdescription,tvvcategory;
    private ImageView img;
    private Button getTicketButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        tvvtitle = (TextView)findViewById(R.id.event_texttitle);
        tvvdescription = (TextView) findViewById(R.id.textDescription);
        tvvcategory = (TextView) findViewById(R.id.textCategory);
        img = (ImageView) findViewById(R.id.eventthumbnail);

        getTicketButton = (Button) findViewById(R.id.getTicket);

        // Receive Data

        final Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");





        // Setting values

        tvvtitle.setText(Title);
        tvvdescription.setText(Description);
        img.setImageResource(image);



       getTicketButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),QrCodeGenerator.class));
           }
       });




    }
}
