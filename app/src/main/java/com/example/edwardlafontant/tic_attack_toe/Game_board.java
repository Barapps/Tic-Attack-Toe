package com.example.edwardlafontant.tic_attack_toe;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game_board extends AppCompatActivity {

    Button A0, A1, A2, B0, B1, B2, C0, C1, C2, resetBtn;
    static int player = 1, luckyNum = 0;
    static TextView testplayer;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);



        A0 = (Button) findViewById(R.id.A0);
        A1 = (Button) findViewById(R.id.A1);
        A2 = (Button) findViewById(R.id.A2);
        B0 = (Button) findViewById(R.id.B0);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        C0 = (Button) findViewById(R.id.C0);
        C1 = (Button) findViewById(R.id.C1);
        C2 = (Button) findViewById(R.id.C2);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        testplayer = (TextView) findViewById(R.id.playerView);




        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                finish();
                startActivity(intent);


            }
        });

        A0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(A0);
                gameState(A0);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();


            }
        });
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(A1);
                gameState(A1);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();



            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(A2);
                gameState(A2);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();

            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B0);
                gameState(B0);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();


            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B1);
                gameState(B1);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();



            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B2);
                gameState(B2);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();


            }
        });

        C0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exOh(C0);
                gameState(C0);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();
            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exOh(C1);
                gameState(C1);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exOh(C2);
                gameState(C2);
                randomNumber();
                testplayer.setText(Integer.toString(player));
                clickChallenge();
            }
        });


    }

    public void exOh(Button button) {

        resetBtn.setText(Integer.toString(luckyNum));


        if (player == 1) {

            player = 2;

            button.setText("X");
            button.setClickable(false);

        } else {

            if (player == 2) {

                player = 1;

                button.setText("O");
                button.setClickable(false);


            }

        }




    }


    public void gameState(Button button) {

        if (A0.getText().equals(A1.getText()) && A1.getText().equals(A2.getText())) {


            Toast.makeText(Game_board.this, A0.getText() + " Wins!", Toast.LENGTH_LONG).show();

        } else if (B0.getText().equals(B1.getText()) && B1.getText().equals(B2.getText())) {


            Toast.makeText(Game_board.this, B0.getText() + " Wins!", Toast.LENGTH_LONG).show();

        } else if (C0.getText().equals(C1.getText()) && C1.getText().equals(C2.getText())) {


            Toast.makeText(Game_board.this, C0.getText() + " Wins!", Toast.LENGTH_LONG).show();

            //end of across;

        } else if (A0.getText().equals(B0.getText()) && B0.getText().equals(C0.getText())) {


            Toast.makeText(Game_board.this, A0.getText() + " Wins!", Toast.LENGTH_LONG).show();

        } else if (A1.getText().equals(B1.getText()) && B1.getText().equals(C1.getText())) {


            Toast.makeText(Game_board.this, A1.getText() + " Wins!", Toast.LENGTH_LONG).show();

        } else if (A2.getText().equals(B2.getText()) && B2.getText().equals(C2.getText())) {


            Toast.makeText(Game_board.this, A2.getText() + " Wins!", Toast.LENGTH_LONG).show();

            //end of vertical;

        } else if (A0.getText().equals(B1.getText()) && B1.getText().equals(C2.getText())) {


            Toast.makeText(Game_board.this, A0.getText() + " Wins!", Toast.LENGTH_LONG).show();

        } else if (A2.getText().equals(B1.getText()) && B1.getText().equals(C0.getText())) {


            Toast.makeText(Game_board.this, A2.getText() + " Wins!", Toast.LENGTH_LONG).show();

            // end of diagonal;

        } else {


            return;

        }
    }

    public void randomNumber() {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);



        if(randomInt == luckyNum) {

            Random randomGenerator2 = new Random();
            int randomInt2 = randomGenerator2.nextInt(5);

            luckyNum = randomInt2;
        }else{

            luckyNum = randomInt;


        }



    }

    public void clickChallenge(){

        if(luckyNum == 1){ //number click countdown

            Intent intent= new Intent(Game_board.this,tpChal.class);
            startActivity(intent);


        }

        if(luckyNum == 2 && player == 2){ //player

            player = 1;


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    context);

            // set dialog message
            alertDialogBuilder
                    .setCancelable(false)
                    .setNegativeButton("2",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();

        }

        if(luckyNum == 3){



        }

        if(luckyNum == 4){



        }

    }


}

