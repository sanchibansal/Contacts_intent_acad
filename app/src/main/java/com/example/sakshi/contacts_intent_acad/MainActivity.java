package com.example.sakshi.contacts_intent_acad;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

        Button contacts;            //declaring component
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contacts=(Button)findViewById(R.id.contacts);       //associating button
        contacts.setOnClickListener(new View.OnClickListener() {        //on click listener
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);          //Creating intent for view action
                i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                startActivityForResult(i,1);            //start activity
            }
        });
    }
}
