package com.example.goldm.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    EditText numstudents;
    EditText Astudents;
    EditText Bstudents;
    EditText Cstudents;
    EditText Dstudents;
    EditText Fstudents;

    Button computebutton;


    //holding values in strings before calculations
    String astring;
    String bstring;
    String cstring;
    String dstring;
    String fstring;
    String numstring;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numstudents = (EditText) findViewById(R.id.edtotnumstud);
        Astudents = (EditText) findViewById(R.id.edAsStud);
        Bstudents = (EditText) findViewById(R.id.edBsStud);
        Cstudents = (EditText) findViewById(R.id.edCsStud);
        Dstudents = (EditText) findViewById(R.id.edDsStud);
        Fstudents = (EditText) findViewById(R.id.edFsStud);






        computebutton = (Button) findViewById(R.id.btncompute);
        computebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back();
            }
        });



    }



    public void back()
    {
        Intent intent = new Intent(this, results.class);
        astring = Astudents.getText().toString();
        bstring = Bstudents.getText().toString();
        cstring = Cstudents.getText().toString();
        dstring = Dstudents.getText().toString();
        fstring = Fstudents.getText().toString();
        numstring = numstudents.getText().toString();

        intent.putExtra("A", astring);
        intent.putExtra("B", bstring);
        intent.putExtra("C", cstring);
        intent.putExtra("D", dstring);
        intent.putExtra("F", fstring);
        intent.putExtra("num",numstring);

        startActivity(intent);
    }





}
