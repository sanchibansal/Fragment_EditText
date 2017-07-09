package com.example.sakshi.fragment_edittext;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;  //declaring a fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //calling fragment constructor
        fragment = new Fragment();
        //fragment manager handles transition between fragments
        //Returns the FragmentManager for interacting with fragments associated with this activity.
        FragmentManager fragmentManager=getFragmentManager();
        //begins transaction
        //performs edit operations on fragment associated with the fragment  manager
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        //committing transaction
        transaction.commit();



    }
}
