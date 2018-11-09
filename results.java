package com.example.goldm.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class results extends AppCompatActivity {


    TextView textviewA, textviewB, textviewC, textviewD, textviewF, textviewnum;
    String astring, bstring, cstring, dstring, fstring, numstring;
    Button buttonresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        textviewA = (TextView) findViewById(R.id.tva);
        textviewB = (TextView) findViewById(R.id.tvb);
        textviewC = (TextView) findViewById(R.id.tvc);
        textviewD = (TextView) findViewById(R.id.tvd);
        textviewF = (TextView) findViewById(R.id.tvf);
        textviewnum = (TextView) findViewById(R.id.num);

        buttonresult = (Button) findViewById(R.id.button1);
        buttonresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graph();
            }
        });


        String num = getIntent().getStringExtra("num");
        double numdub = Integer.parseInt(num);

        String AA = getIntent().getStringExtra("A");
        double adouble = Integer.parseInt(AA);
        double aperct = (adouble / numdub) * (100);

        String BB = getIntent().getStringExtra("B");
        double bdouble = Integer.parseInt(BB);
        double bperct = (bdouble / numdub) * (100) ;

        String CC = getIntent().getStringExtra("C");
        double cdouble = Integer.parseInt(CC);
        double cperct = (cdouble / numdub) * (100);

        String DD = getIntent().getStringExtra("D");
        double ddouble = Integer.parseInt(DD);
        double dperct = (ddouble / numdub) * (100);

        String FF = getIntent().getStringExtra("F");
        double fdouble = Integer.parseInt(FF);
        double fperct = (fdouble / numdub) * (100);


        textviewA.setText("As: "+aperct+"%");
        textviewB.setText("Bs: "+bperct+"%");
        textviewC.setText("Cs: "+cperct+"%");
        textviewD.setText("Ds: "+dperct+"%");
        textviewF.setText("Fs: "+fperct+"%");


        String astring = String.valueOf(aperct);

    }

    public void graph()
    {
        Intent intent = new Intent(this, graph.class);
        astring = textviewA.getText().toString();
        bstring = textviewB.getText().toString();
        cstring = textviewC.getText().toString();
        dstring = textviewD.getText().toString();
        fstring = textviewF.getText().toString();
        numstring = textviewnum.getText().toString();

        intent.putExtra("A",astring);
        intent.putExtra("B", bstring);
        intent.putExtra("C", cstring);
        intent.putExtra("D", dstring);
        intent.putExtra("F", fstring);
        intent.putExtra("num",numstring);

        startActivity(intent);
    }
}
