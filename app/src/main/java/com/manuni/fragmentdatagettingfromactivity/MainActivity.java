package com.manuni.fragmentdatagettingfromactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view) {
        DataShowingFragment dataShowingFragment = new DataShowingFragment();
        Bundle bundleMessage = new Bundle();
        bundleMessage.putString("key","Data from MainActivity");
        dataShowingFragment.setArguments(bundleMessage);
        getSupportFragmentManager().beginTransaction().add(R.id.container,dataShowingFragment).commit();
    }
}