package com.example.demo18;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Handler handler = new Handler();
    public int Index;
    private int image[] = {R.drawable.m1,R.drawable.m2,R.drawable.m3};
    private Myrun myrun = new Myrun();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        handler.postDelayed(myrun,1000);
    }
    class Myrun implements Runnable
    {
        @Override
        public void run() {
            Index++;
            Index = Index%3;
            imageView.setImageResource(image[Index]);
            handler.postDelayed(myrun,1000);
        }
    }

}
