package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    TextView label,win;
    String[] arr = {"e","e","e","e","e","e","e","e","e"};
    Boolean xTurn = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        label.setText("Player: X");
    }
    void initView(){
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        label = findViewById(R.id.player);
        win = findViewById(R.id.Winner);
        reset = findViewById(R.id.newGame);
    }
    Boolean xWin() {
        Boolean x = false;
        if ((arr[0] == "x" && arr[1] == "x" && arr[2] == "x")
                || (arr[0] == "x" && arr[1] == "x" && arr[2] == "x")
                || (arr[3] == "x" && arr[4] == "x" && arr[5] == "x")
                || (arr[6] == "x" && arr[7] == "x" && arr[8] == "x")
                || (arr[0] == "x" && arr[3] == "x" && arr[6] == "x")
                || (arr[1] == "x" && arr[4] == "x" && arr[7] == "x")
                || (arr[2] == "x" && arr[5] == "x" && arr[8] == "x")
                || (arr[0] == "x" && arr[4] == "x" && arr[8] == "x")
                || (arr[2] == "x" && arr[4] == "x" && arr[6] == "x")) {

            x = true;
        }
        return x;
    }
    Boolean oWin(){
        Boolean x = false;
        if((arr[0]=="x"&&arr[1]=="x"&&arr[2]=="x")
                ||(arr[0]=="o"&&arr[1]=="o"&&arr[2]=="o")
                ||(arr[3]=="o"&&arr[4]=="o"&&arr[5]=="o")
                ||(arr[6]=="o"&&arr[7]=="o"&&arr[8]=="o")
                ||(arr[0]=="o"&&arr[3]=="o"&&arr[6]=="o")
                ||(arr[1]=="o"&&arr[4]=="o"&&arr[7]=="o")
                ||(arr[2]=="o"&&arr[5]=="o"&&arr[8]=="o")
                ||(arr[0]=="o"&&arr[4]=="o"&&arr[8]=="o")
                ||(arr[2]=="o"&&arr[4]=="o"&&arr[6]=="o")){

                x = true;
        }
        return x;
    }
    Boolean tie(){
        int cnt = 0;
        Boolean x = false;
        for(int i = 0 ;i <9;i++){
            if(arr[i]!="e"){
                cnt++;
            }
        }
        if(cnt==9){
            x = true;
        }
        return x;
    }
    void res(){
        if(checkWinner()=="x"){
            Toast.makeText(this, "XWon", Toast.LENGTH_SHORT).show();
            win.setText("Winner: X");
            arr = new String[]{"s","s","s","s","s","s","s","s","s"};
        }
        else if(checkWinner()=="o"){
            Toast.makeText(this, "OWon", Toast.LENGTH_SHORT).show();
            win.setText("Winner: O");
            arr = new String[]{"s","s","s","s","s","s","s","s","s"};
        }
        else if(checkWinner()=="t"){
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
            win.setText("Draw Game");
            arr = new String[]{"s","s","s","s","s","s","s","s","s"};
        }
        else{
            xTurn = !xTurn;
        }
    }
    String checkWinner(){
        String ret = "";
        if(xWin()){
            ret = "x";
        }
        else if(oWin()){
            ret = "o";
        }
        else if(tie()){
            ret = "t";
        }
        else {
            ret = "c";
        }
        return ret;
    }

    public void onklick(View view) {
        if (view.getId()==R.id.btn1){
            if (arr[0]=="e"){
                if (xTurn){
                    arr[0]="x";
                    b1.setText("X");
                    b1.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[0]="o";
                    b1.setText("O");
                    label.setText("Player: X");
                }
                res();
            }
        }
        else if(view.getId()==R.id.btn2){
            if (arr[1]=="e"){
                if (xTurn){
                    arr[1]="x";
                    b2.setText("X");
                    b2.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[1]="o";
                    b2.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn3){
            if (arr[2]=="e"){
                if (xTurn){
                    arr[2]="x";
                    b3.setText("X");
                    b3.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[2]="o";
                    b3.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn4){
            if (arr[3]=="e"){
                if (xTurn){
                    arr[3]="x";
                    b4.setText("X");
                    b4.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[3]="o";
                    b4.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn5){
            if (arr[4]=="e"){
                if (xTurn){
                    arr[4]="x";
                    b5.setText("X");
                    b5.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[4]="o";
                    b5.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn6){
            if (arr[5]=="e"){
                if (xTurn){
                    arr[5]="x";
                    b6.setText("X");
                    b6.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[5]="o";
                    b6.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn7){
            if (arr[6]=="e"){
                if (xTurn){
                    arr[6]="x";
                    b7.setText("X");
                    b7.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[6]="o";
                    b7.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else if(view.getId()==R.id.btn8){
            if (arr[7]=="e"){
                if (xTurn){
                    arr[7]="x";
                    b8.setText("X");
                    b8.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[7]="o";
                    b8.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
        else{
            if (arr[8]=="e"){
                if (xTurn){
                    arr[8]="x";
                    b9.setText("X");
                    b9.setTextColor(Color.RED);
                    label.setText("Player: O");
                }
                else{
                    arr[8]="o";
                    b9.setText("O");
                    label.setText("Player: X");
                }
                res();

            }
        }
    }

    public void createNewGame(View view) {
        xTurn = true;
        arr = new String[]{"e","e","e","e","e","e","e","e","e"};
        win.setText("Winner: ");
        label.setText("Player: X");
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");
        b1.setTextColor(Color.WHITE);
        b2.setTextColor(Color.WHITE);
        b3.setTextColor(Color.WHITE);
        b4.setTextColor(Color.WHITE);
        b5.setTextColor(Color.WHITE);
        b6.setTextColor(Color.WHITE);
        b7.setTextColor(Color.WHITE);
        b8.setTextColor(Color.WHITE);
        b9.setTextColor(Color.WHITE);
    }
}