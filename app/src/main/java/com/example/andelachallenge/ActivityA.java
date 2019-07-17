package com.example.andelachallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ActivityC;
import com.example.ActivityB;

public class ActivityA extends AppCompatActivity {
    public Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
       // button=(Button) findViewById(R.id.button);



       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://andela.com/alc/";
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }


        });*/
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view){

                Intent k= new Intent(getApplicationContext(), ActivityC.class);
                startActivity(k);
            }
        });


    }


    public void ActivityB(View view) {
        Intent l=new Intent(ActivityA.this, ActivityB.class);
                startActivity(l);


    }
}
