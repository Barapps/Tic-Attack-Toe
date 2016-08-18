package com.example.edwardlafontant.tic_attack_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tpChal extends Game_board {

    Button player1, player2;
    TextView one, two;
    int p1, p2;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp_chal);

        player1 = (Button)findViewById(R.id.player1tap);
        player2 = (Button)findViewById(R.id.player2tap);
        one = (TextView)findViewById(R.id.textView1);


        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p1++;
                player1.setText(Integer.toString(p1));

                if(p1 == 10){
                    player = 1;
                    finish();


                }

            }
        });

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p2++;
                player2.setText(Integer.toString(p2));

                if(p2 == 10){

                    player = 2;
                    finish();


                }



            }
        });






    }

}
