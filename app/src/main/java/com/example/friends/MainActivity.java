package com.example.friends;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ScrollView   scrollView;
    LinearLayout linearLayout;
    TextView     textView;
    EditText     editTextName;
    EditText     editTextNum;
    Button       button;

    ContactsManager contactsManager = new ContactsManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView   = findViewById(R.id.scroll);
        linearLayout = findViewById(R.id.linear);
        textView     = findViewById(R.id.text);
        editTextName = findViewById(R.id.edit_name);
        editTextNum  = findViewById(R.id.edit_num);
        button       = findViewById(R.id.button_enter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String num = editTextNum.getText().toString();

                contactsManager.createContact(name, num);
                linearLayout.addView(displayContact(name + " " + num));
            }
        });

    }
    private TextView displayContact(String text) {
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(text);
        return textView;
    }
}
