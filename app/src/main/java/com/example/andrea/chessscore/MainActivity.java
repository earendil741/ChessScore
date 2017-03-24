package com.example.andrea.chessscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int whiteScore = 0;
    int blackScore = 0;

    int whiteKingControl = 0;
    int whiteQueenControl = 0;
    int whiteRokControl = 0;
    int whiteKnightControl = 0;
    int whiteBishopControl = 0;
    int whitePawnControl = 0;

    int blackKingControl = 0;
    int blackQueenControl = 0;
    int blackRokControl = 0;
    int blackKnightControl = 0;
    int blackBishopControl = 0;
    int blackPawnControl = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton whiteKingButton = (ImageButton) findViewById(R.id.white_king);

        whiteKingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whiteKingControl==0){
                    whiteScore = whiteScore + 999 ;
                    whiteKingControl = 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.white_win, Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        whiteKingButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whiteKingControl==1){
                    whiteKingControl = 0;
                    whiteScore = whiteScore - 999;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-999", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton whiteQueenButton = (ImageButton) findViewById(R.id.white_queen);

        whiteQueenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whiteQueenControl==0){
                    whiteScore = whiteScore + 9 ;
                    whiteQueenControl = 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+9", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        whiteQueenButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whiteQueenControl==1){
                    whiteQueenControl = 0;
                    whiteScore = whiteScore - 9;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-9", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton whiteRokButton = (ImageButton) findViewById(R.id.white_rok);

        whiteRokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whiteRokControl<2){
                    whiteScore = whiteScore + 5 ;
                    whiteRokControl = whiteRokControl + 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+5", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast_1,Toast.LENGTH_SHORT);
                    errorToast.show();
                }
            }
        });

        whiteRokButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whiteRokControl>0){
                    whiteRokControl = whiteRokControl - 1;
                    whiteScore = whiteScore - 5;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-5", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton whiteKnightButton = (ImageButton) findViewById(R.id.white_knight);

        whiteKnightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whiteKnightControl<2){
                    whiteScore = whiteScore + 3 ;
                    whiteKnightControl = whiteKnightControl + 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+3", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast_1,Toast.LENGTH_SHORT);
                    errorToast.show();
                }
            }
        });

        whiteKnightButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whiteKnightControl>0){
                    whiteKnightControl = whiteKnightControl - 1;
                    whiteScore = whiteScore - 3;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-3", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton whiteBishopButton = (ImageButton)findViewById(R.id.white_bishop);

        whiteBishopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whiteBishopControl<2){
                    whiteScore = whiteScore + 3 ;
                    whiteBishopControl = whiteBishopControl + 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+3", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast_1,Toast.LENGTH_SHORT);
                    errorToast.show();
                }

            }
        });

        whiteBishopButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whiteBishopControl>0){
                    whiteBishopControl = whiteBishopControl - 1;
                    whiteScore = whiteScore - 3;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-3", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton whitePawnButton = (ImageButton) findViewById(R.id.white_pawn);

        whitePawnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whitePawnControl<10){
                    whiteScore = whiteScore + 1 ;
                    whitePawnControl = whitePawnControl + 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+1", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast_1,Toast.LENGTH_SHORT);
                    errorToast.show();
                }
            }
        });

        whitePawnButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (whitePawnControl>0){
                    whitePawnControl = whitePawnControl - 1;
                    whiteScore = whiteScore - 1;
                    displayWhite(whiteScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-1", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackKingButton = (ImageButton) findViewById(R.id.black_king);

        blackKingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blackKingControl == 0){
                    blackScore = blackScore + 999;
                    blackKingControl = 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.black_win, Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast_1,Toast.LENGTH_SHORT);
                    errorToast.show();
                }
            }
        });

        blackKingButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackKingControl == 1){
                    blackKingControl = 0;
                    blackScore = blackScore - 999;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-999", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackQueenButton = (ImageButton) findViewById(R.id.black_queen);

        blackQueenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blackQueenControl == 0){
                    blackScore = blackScore + 9 ;
                    blackQueenControl = 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+9", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        blackQueenButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackQueenControl == 1){
                    blackQueenControl = 0;
                    blackScore = blackScore - 9;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-9", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackRokButton = (ImageButton) findViewById(R.id.black_rok);

        blackRokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (blackRokControl<2){
                    blackScore = blackScore + 5 ;
                    blackRokControl = blackRokControl + 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+5", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        blackRokButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackRokControl>0){
                    blackRokControl = blackRokControl - 1;
                    blackScore = blackScore - 5;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-5", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackKnightButton = (ImageButton) findViewById(R.id.black_knight);

        blackKnightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blackKnightControl<2){
                    blackScore = blackScore + 3 ;
                    blackKnightControl = blackKnightControl + 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+3", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        blackKnightButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackKnightControl>0){
                    blackRokControl = blackRokControl - 1;
                    blackScore = blackScore - 3;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-3", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackBishopButton = (ImageButton)findViewById(R.id.black_bishop);

        blackBishopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blackBishopControl<2){
                    blackScore = blackScore + 3 ;
                    blackBishopControl = blackBishopControl + 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+3", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        blackBishopButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackBishopControl>0){
                    blackBishopControl = blackBishopControl - 1;
                    blackScore = blackScore - 3;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-3", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton blackPawnButton = (ImageButton) findViewById(R.id.black_pawn);

        blackPawnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blackPawnControl<10){
                    blackScore = blackScore + 1 ;
                    blackPawnControl = blackPawnControl + 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "+1", Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.error_toast_1, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        blackPawnButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (blackPawnControl>0){
                    blackPawnControl = blackPawnControl - 1;
                    blackScore = blackScore - 1;
                    displayBlack(blackScore);
                    Toast toast = Toast.makeText(getApplicationContext(), "-1", Toast.LENGTH_SHORT);
                    toast.show();
                    return true;
                }else{
                    Toast errorToast = Toast.makeText(getApplicationContext(),R.string.error_toast,Toast.LENGTH_SHORT);
                    errorToast.show();
                    return true;
                }
            }
        });

        ImageButton infoButton = (ImageButton)findViewById(R.id.info);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast infoToast = Toast.makeText(getApplicationContext(),R.string.info_toast ,Toast.LENGTH_LONG);
                infoToast.show();
            }
        });

        Button resetButton = (Button)findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whiteScore = 0;
                blackScore = 0;

                whiteKingControl = 0;
                whiteQueenControl = 0;
                whiteRokControl = 0;
                whiteKnightControl = 0;
                whiteBishopControl = 0;
                whitePawnControl = 0;

                blackKingControl = 0;
                blackQueenControl = 0;
                blackRokControl = 0;
                blackKnightControl = 0;
                blackBishopControl = 0;
                blackPawnControl = 0;

                displayWhite(whiteScore);
                displayBlack(blackScore);
            }
        });

    }

    public void displayWhite (int score){
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayBlack (int score){
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(score));
    }
}
