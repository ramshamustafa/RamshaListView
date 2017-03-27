package com.ramsha.ramshalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mutahir.ramshalistview.R;


public class CustomView extends ArrayAdapter<String> {


    TextView text;
    TextView text1;
TextView shapeText;
   static String[] phoneNo;


    public CustomView(Context context, String[] name) {

        super(context, R.layout.customlayout, name);
        phoneNo= MainActivity.phoneNo;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater1= LayoutInflater.from(getContext());
        View custom=inflater1.inflate(R.layout.customlayout,parent,false);

        String Position=getItem(position);

        text=(TextView)custom.findViewById(R.id.names);
        text1=(TextView)custom.findViewById(R.id.phNo) ;
        text.setText(Position);

       text1.setText(phoneNo[position]);

        shapeText=(TextView)custom.findViewById(R.id.shape1);
        String[] get=text.getText().toString().split(" ");
        String add="";
        for(String s:get)
            add+=""+s.charAt(0);
        shapeText.setText(add);
        if(add.charAt(0)=='A')
        {
            shapeText.setBackgroundResource(R.drawable.circle);
        }
        else if(add.charAt(0)=='B')
        {
            shapeText.setBackgroundResource(R.drawable.circleb);
        }
        else if(add.charAt(0)=='C')
        {
            shapeText.setBackgroundResource(R.drawable.circlec);
        }
        else if(add.charAt(0)=='D')
        {
            shapeText.setBackgroundResource(R.drawable.circled);
        }
        else if(add.charAt(0)=='E')
        {
            shapeText.setBackgroundResource(R.drawable.circlee);
        }
        else if(add.charAt(0)=='F')
        {
            shapeText.setBackgroundResource(R.drawable.circlef);
        }
        else if(add.charAt(0)=='G')
        {
            shapeText.setBackgroundResource(R.drawable.circleg);
        }
        else if(add.charAt(0)=='H')
        {
            shapeText.setBackgroundResource(R.drawable.circleh);
        }
        else if(add.charAt(0)=='I')
        {
            shapeText.setBackgroundResource(R.drawable.circlei);
        }
        else if(add.charAt(0)=='J')
        {
            shapeText.setBackgroundResource(R.drawable.circlej);
        }
        else if(add.charAt(0)=='K')
        {
            shapeText.setBackgroundResource(R.drawable.circlek);
        }
        else if(add.charAt(0)=='L')
        {
            shapeText.setBackgroundResource(R.drawable.circlel);
        }
        else if(add.charAt(0)=='M')
        {
            shapeText.setBackgroundResource(R.drawable.circlem);
        }
        else if(add.charAt(0)=='N')
        {
            shapeText.setBackgroundResource(R.drawable.circlen);
        }
        else if(add.charAt(0)=='O')
        {
            shapeText.setBackgroundResource(R.drawable.circleo);
        }
        else if(add.charAt(0)=='P')
        {
            shapeText.setBackgroundResource(R.drawable.circlep);
        }
        else if(add.charAt(0)=='Q')
        {
            shapeText.setBackgroundResource(R.drawable.circleq);
        }
        else if(add.charAt(0)=='R')
        {
            shapeText.setBackgroundResource(R.drawable.circler);
        }
        else if(add.charAt(0)=='S')
        {
            shapeText.setBackgroundResource(R.drawable.circles);
        }
        else if(add.charAt(0)=='T')
        {
            shapeText.setBackgroundResource(R.drawable.circlet);
        }
        else if(add.charAt(0)=='U')
        {
            shapeText.setBackgroundResource(R.drawable.circleu);
        }
        else if(add.charAt(0)=='V')
        {
            shapeText.setBackgroundResource(R.drawable.circlev);
        }
        else if(add.charAt(0)=='W')
        {
            shapeText.setBackgroundResource(R.drawable.circlew);
        }
        else if(add.charAt(0)=='X')
        {
            shapeText.setBackgroundResource(R.drawable.circlex);
        }
        else if(add.charAt(0)=='Y')
        {
            shapeText.setBackgroundResource(R.drawable.circle);
        }
        else if(add.charAt(0)=='Z')
        {
            shapeText.setBackgroundResource(R.drawable.circlez);
        }
        return custom;
    }
}
