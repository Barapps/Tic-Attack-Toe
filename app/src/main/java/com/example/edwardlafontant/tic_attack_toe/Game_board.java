package com.example.edwardlafontant.tic_attack_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class Game_board extends AppCompatActivity {

    Button A0, A1, A2, B0, B1, B2, C0, C1, C2;
    int player = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        A0 = (Button)findViewById(R.id.A0);
        A1 = (Button)findViewById(R.id.A1);
        A2 = (Button)findViewById(R.id.A2);
        B0 = (Button)findViewById(R.id.B0);
        B1 = (Button)findViewById(R.id.B1);
        B2 = (Button)findViewById(R.id.B2);
        C0 = (Button)findViewById(R.id.C0);
        C1 = (Button)findViewById(R.id.C1);
        C2 = (Button)findViewById(R.id.C2);

        A0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               exOh(A0);
                gameState(A0);

            }
        });
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(A1);
                gameState(A1);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(A2);
                gameState(A2);
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B0);
                gameState(B0);
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B1);
                gameState(B1);


            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(B2);
                gameState(B2);


            }
        });

        C0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(C0);
                gameState(C0);


            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(C1);
                gameState(C1);


            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exOh(C2);
                gameState(C2);


            }
        });




    }

    public void exOh(Button button){



        if(player == 1){

            player =  2;

            button.setText("X");
            button.setClickable(false);


        }else{

        if(player == 2) {

            player = 1;

            button.setText("O");
            button.setClickable(false);

        }

        }



    }

    public void gameState(Button button){

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



}
