package com.msr.eventbusdemo.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.msr.eventbusdemo.R;
import com.msr.eventbusdemo.fragments.BottomLeftFragment;
import com.msr.eventbusdemo.fragments.BottomRightFragment;
import com.msr.eventbusdemo.fragments.TopFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }

    private void initFragments() {
        FragmentManager manager = getSupportFragmentManager();//create an instance of fragment manager
        FragmentTransaction transaction = manager.beginTransaction();//create an instance of Fragment-transaction
        transaction.add(R.id.topContainer, new TopFragment(), "frag_top_tag");
        transaction.add(R.id.bottomLeftContainer, new BottomLeftFragment(), "frag_bottom_left_tag");
        transaction.add(R.id.bottomRightContainer, new BottomRightFragment(), "frag_bottom_right_tag");
        transaction.commit();
    }
}
