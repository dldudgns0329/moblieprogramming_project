package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {

    private EditText mEditDate;

    private EditText mEditTitle;
    private EditText mEditSubject;
    private EditText mEditDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        mEditDate = (EditText)findViewById(R.id.textDate);

        mEditTitle = (EditText)findViewById(R.id.textTitle);
        mEditSubject = (EditText)findViewById(R.id.textSubject);
        mEditDescription = (EditText)findViewById(R.id.textDescription);
    }

    public void mOnClick2(View v) {
        String date = mEditDate.getText().toString();

        String title = mEditTitle.getText().toString();
        String subject = mEditSubject.getText().toString();
        String description = mEditDescription.getText().toString();


        switch (v.getId()) {
            case R.id.btnConfirm:
                HomeCollection.date_collection_arr=new ArrayList<HomeCollection>();
                HomeCollection.date_collection_arr.add( new HomeCollection(date ,title,subject,description));
                Toast.makeText(this, "New Event Added", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
