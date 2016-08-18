package com.example.edwardlafontant.tic_attack_toe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tpChal extends Game_board {

    Button player1, player2;
    int p1, p2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp_chal);

        player1 = (Button)findViewById(R.id.player1tap);
        player2 = (Button)findViewById(R.id.player2tap);


        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p1++;
                player1.setText(Integer.toString(p1));

                if(p1 == 10){
                    player = 1;


                    new android.app.AlertDialog.Builder(context)
                            .setMessage("Player 1 won! Player 1's turn")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // do nothing
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
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

                    new AlertDialog.Builder(context)
                            .setMessage("Player 2 won! Player 2's turn")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // do nothing
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();


                }



            }
        });

    }

}
