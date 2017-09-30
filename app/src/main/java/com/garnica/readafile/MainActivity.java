package com.garnica.readafile;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;



public class MainActivity extends Activity {

    DateTime today = new DateTime();
    int month = today.getMonth();
    int dayOfMonth = today.getDay();

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        InputStream inputStream = null;
        switch (month){
            case 1:
                inputStream = getResources().openRawResource(R.raw.january);
                break;

            case 2:
                inputStream = getResources().openRawResource(R.raw.february);
                break;

            case 3:
                inputStream = getResources().openRawResource(R.raw.march);
                break;

            case 4:
                inputStream = getResources().openRawResource(R.raw.april);
                break;

            case 5:
                inputStream = getResources().openRawResource(R.raw.may);
                break;

            case 6:
                inputStream = getResources().openRawResource(R.raw.june);
                break;

            case 7:
                inputStream = getResources().openRawResource(R.raw.july);
                break;

            case 8:
                inputStream = getResources().openRawResource(R.raw.august);
                break;

            case 9:
                inputStream = getResources().openRawResource(R.raw.september);
                break;

            case 10:
                inputStream = getResources().openRawResource(R.raw.october);
                break;

            case 11:
                inputStream = getResources().openRawResource(R.raw.november);
                break;

            case 12:
                inputStream = getResources().openRawResource(R.raw.december);
                break;

        }


        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        TextView TodayDate = (TextView) findViewById(R.id.DateView);
        TextView Challenge = (TextView) findViewById(R.id.ChallengeView);

        if (inputStream != null){                   //reads file line by line if true

            try{
                String line = reader.readLine();
                TodayDate.setText(line + " " + dayOfMonth);

                for( int i = 0; i < dayOfMonth; i ++){
                    line = reader.readLine();
                }

                Challenge.setText(line);
                inputStream.close();

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }




}
