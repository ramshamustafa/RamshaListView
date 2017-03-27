package com.ramsha.ramshalistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mutahir.ramshalistview.R;


public class Details extends Activity{

    TextView textName;
    TextView textNumber;
    TextView textCircle;

    private String name;
    private String number;
    private String circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        textName =(TextView)findViewById(R.id.name1);
        textNumber =(TextView)findViewById(R.id.phone1);
        textCircle=(TextView)findViewById(R.id.shape1);

        Bundle intent=getIntent().getExtras();

        name=intent.getString("value2");
        number=intent.getString("value1");
        circle=intent.getString("value");


        textName.setText(name);
        textNumber.setText(number);
        textCircle.setText(circle);

        if(circle.charAt(0)=='A')
        {
            textCircle.setBackgroundResource(R.drawable.circle);
        }
        else if(circle.charAt(0)=='B')
        {
            textCircle.setBackgroundResource(R.drawable.circleb);
        }
        else if(circle.charAt(0)=='C')
        {
            textCircle.setBackgroundResource(R.drawable.circlec);
        }
        else if(circle.charAt(0)=='D')
        {
            textCircle.setBackgroundResource(R.drawable.circled);
        }
        else if(circle.charAt(0)=='E')
        {
            textCircle.setBackgroundResource(R.drawable.circlee);
        }
        else if(circle.charAt(0)=='F')
        {
            textCircle.setBackgroundResource(R.drawable.circlef);
        }
        else if(circle.charAt(0)=='G')
        {
            textCircle.setBackgroundResource(R.drawable.circleg);
        }
        else if(circle.charAt(0)=='H')
        {
            textCircle.setBackgroundResource(R.drawable.circleh);
        }
        else if(circle.charAt(0)=='I')
        {
            textCircle.setBackgroundResource(R.drawable.circlei);
        }
        else if(circle.charAt(0)=='J')
        {
            textCircle.setBackgroundResource(R.drawable.circlej);
        }
        else if(circle.charAt(0)=='K')
        {
            textCircle.setBackgroundResource(R.drawable.circlek);
        }
        else if(circle.charAt(0)=='L')
        {
            textCircle.setBackgroundResource(R.drawable.circlel);
        }
        else if(circle.charAt(0)=='M')
        {
            textCircle.setBackgroundResource(R.drawable.circlem);
        }
        else if(circle.charAt(0)=='N')
        {
            textCircle.setBackgroundResource(R.drawable.circlen);
        }
        else if(circle.charAt(0)=='O')
        {
            textCircle.setBackgroundResource(R.drawable.circleo);
        }
        else if(circle.charAt(0)=='P')
        {
            textCircle.setBackgroundResource(R.drawable.circlep);
        }
        else if(circle.charAt(0)=='Q')
        {
            textCircle.setBackgroundResource(R.drawable.circleq);
        }
        else if(circle.charAt(0)=='R')
        {
            textCircle.setBackgroundResource(R.drawable.circler);
        }
        else if(circle.charAt(0)=='S')
        {
            textCircle.setBackgroundResource(R.drawable.circles);
        }
        else if(circle.charAt(0)=='T')
        {
            textCircle.setBackgroundResource(R.drawable.circlet);
        }
        else if(circle.charAt(0)=='U')
        {
            textCircle.setBackgroundResource(R.drawable.circleu);
        }
        else if(circle.charAt(0)=='V')
        {
            textCircle.setBackgroundResource(R.drawable.circlev);
        }
        else if(circle.charAt(0)=='W')
        {
            textCircle.setBackgroundResource(R.drawable.circlew);
        }
        else if(circle.charAt(0)=='X')
        {
            textCircle.setBackgroundResource(R.drawable.circlex);
        }
        else if(circle.charAt(0)=='Y')
        {
            textCircle.setBackgroundResource(R.drawable.circley);
        }
        else if(circle.charAt(0)=='Z')
        {
            textCircle.setBackgroundResource(R.drawable.circlez);
        }

    }
}
