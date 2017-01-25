package edu.washington.clgan.lifecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int playerACount = 20;
    public int playerBCount = 20;
    public int playerCCount = 20;
    public int playerDCount = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        TextView textview;
        switch (v.getId()) {
            case R.id.button:
                textview = (TextView)findViewById(R.id.textView10);
                textview.setText(Integer.toString(++playerACount));
                break;
            case R.id.button2:
                textview = (TextView)findViewById(R.id.textView10);
                textview.setText(Integer.toString(--playerACount));
                if(playerACount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player A LOSES!");
                }
                break;
            case R.id.button3:
                textview = (TextView)findViewById(R.id.textView10);
                playerACount = playerACount + 5;
                textview.setText(Integer.toString(playerACount));
                break;
            case R.id.button4:
                textview = (TextView)findViewById(R.id.textView10);
                playerACount = playerACount - 5;
                textview.setText(Integer.toString(playerACount));
                if(playerACount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player A LOSES!");
                }
                break;
            case R.id.button6:
                textview = (TextView)findViewById(R.id.textView11);
                textview.setText(Integer.toString(++playerBCount));
                break;
            case R.id.button5:
                textview = (TextView)findViewById(R.id.textView11);
                textview.setText(Integer.toString(--playerBCount));
                if(playerBCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player B LOSES!");
                }
                break;
            case R.id.button7:
                textview = (TextView)findViewById(R.id.textView11);
                playerBCount = playerBCount + 5;
                textview.setText(Integer.toString(playerBCount));
                break;
            case R.id.button8:
                textview = (TextView)findViewById(R.id.textView11);
                playerBCount = playerBCount - 5;
                textview.setText(Integer.toString(playerBCount));
                if(playerBCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player B LOSES!");
                }
                break;
            case R.id.button9:
                textview = (TextView)findViewById(R.id.textView12);
                textview.setText(Integer.toString(++playerCCount));
                break;
            case R.id.button10:
                textview = (TextView)findViewById(R.id.textView12);
                textview.setText(Integer.toString(--playerCCount));
                if(playerCCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player C LOSES!");
                }
                break;
            case R.id.button11:
                textview = (TextView)findViewById(R.id.textView12);
                playerCCount = playerCCount + 5;
                textview.setText(Integer.toString(playerCCount));
                break;
            case R.id.button12:
                textview = (TextView)findViewById(R.id.textView12);
                playerCCount = playerCCount - 5;
                textview.setText(Integer.toString(playerCCount));
                if(playerCCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player C LOSES!");
                }
                break;
            case R.id.button14:
                textview = (TextView)findViewById(R.id.textView13);
                textview.setText(Integer.toString(++playerDCount));
                break;
            case R.id.button13:
                textview = (TextView)findViewById(R.id.textView13);
                textview.setText(Integer.toString(--playerDCount));
                if(playerDCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player D LOSES!");
                }
                break;
            case R.id.button16:
                textview = (TextView)findViewById(R.id.textView13);
                playerDCount = playerDCount + 5;
                textview.setText(Integer.toString(playerDCount));
                break;
            case R.id.button15:
                textview = (TextView)findViewById(R.id.textView13);
                playerDCount = playerDCount - 5;
                textview.setText(Integer.toString(playerDCount));
                if(playerDCount <= 0){
                    textview = (TextView)findViewById(R.id.textView7);
                    textview.setText("Player D LOSES!");
                }
                break;

        }
    }
}
