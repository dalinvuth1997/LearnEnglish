package kh.rupp.mestudy.learnenglish;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Start();
                Finish();
            }
        },2000);


    }
    private void Start(){
        Intent intent = new Intent(this,StartActivity.class);
        startActivity(intent);

    }
    private void Finish(){
        finish();
    }





}
