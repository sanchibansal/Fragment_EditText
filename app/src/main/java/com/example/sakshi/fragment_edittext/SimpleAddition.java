package com.example.sakshi.fragment_edittext;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SimpleAddition extends Fragment {
    EditText editText;
    Button button;
    TextView  textView; //declaring editText, Buton and textView


    public SimpleAddition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        editText = (EditText)view.findViewById(R.id.Edittext);
        button = (Button)view.findViewById(R.id.button);
        textView = (TextView)view.findViewById(R.id.textView);  //associating components with their respective ids
        //on click listener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting text from the edit text
                String text = editText.getText().toString();
                //setting that text to the text view
                textView.setText(text);
            }
        });
        return view;


    }

}
