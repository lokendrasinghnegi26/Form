package com.lokendrasingh.form;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2;
    ToggleButton toggle;
    CheckBox ch1, ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle= findViewById(R.id.toggleButton);
        ch1= findViewById(R.id.english);
        ch2= findViewById(R.id.hindi);
        text1=findViewById(R.id.user_id);
        text2= findViewById(R.id.number);
        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ch1.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Checked English",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Unchecked English",Toast.LENGTH_SHORT).show();
                }
            }
        });
        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ch2.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Checked Hindi",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Unchecked Hindi",Toast.LENGTH_SHORT).show();
                }
            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggle.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Turned ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Turned Off",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onAlert(View view) {
        AlertDialog.Builder myAlert= new AlertDialog.Builder(this);     //to create alert dialog we created a object of AlertDialog.Builder
        myAlert.setTitle("Exit");
        myAlert.setMessage("Are you sure?");
        myAlert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        myAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();

            }
        });
        myAlert.show();
    }

    public void onProgress(View view) {
    }
}