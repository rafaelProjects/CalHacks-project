package com.example.stanleyou.asphalt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rentOutButton = (Button)findViewById(R.id.rentOutButton);
        rentOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), RentOutActivity.class);
                startActivity(startIntent);
            }
        });

        Button reserveButton = (Button)findViewById(R.id.ReserveButton);
        reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ReserveActivity.class);
                startActivity(startIntent);
            }
        });

        Button submitReserveButton = (Button)findViewById(R.id.rentOutSubmitButton);
        submitReserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText address = (EditText) findViewById(R.id.addressInput);
                EditText timeFrom = (EditText) findViewById(R.id.timeFromInput);
                EditText timeTo = (EditText) findViewById(R.id.timeToInput);
                EditText numberOfParkingSpots = (EditText) findViewById(R.id.numberOfParkingSpotsInput);

                String addressString = address.getText().toString();
                //String  = address.getText().toString();
            }
        });

    }
}
