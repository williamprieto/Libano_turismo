package com.prieto.william.libano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    RadioButton Rbpantagora;
    RadioButton Rbcontinental;
    RadioButton Rbcalle;

    RadioGroup rggrupoh1;

    ImageView ih1;
    ImageView ih2;
    ImageView ih3;

    TextView desh1;
    TextView desh2;
    TextView desh3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Rbpantagora= (RadioButton)findViewById(R.id.Rbpantagora);
        Rbcontinental= (RadioButton)findViewById(R.id.Rbcontinental);
        Rbcalle = (RadioButton)findViewById(R.id.Rbcalle);

        rggrupoh1 = (RadioGroup)findViewById(R.id.rggrupoh1);

        ih1= (ImageView)findViewById(R.id.ih1);
        ih2= (ImageView)findViewById(R.id.ih2);
        ih3= (ImageView)findViewById(R.id.ih3);

        desh1=(TextView)findViewById(R.id.desh1);
        desh2=(TextView)findViewById(R.id.desh2);
        desh3=(TextView)findViewById(R.id.desh3);


        View.OnClickListener list=new View.OnClickListener() {
            @Override
            public void onClick(View vi) {

                switch(vi.getId()) {

                    case R.id.Rbpantagora:
                        desh1.setVisibility(View.VISIBLE);
                        ih1.setVisibility(View.VISIBLE);

                        desh2.setVisibility(View.INVISIBLE);
                        desh3.setVisibility(View.INVISIBLE);
                        ih2.setVisibility(View.INVISIBLE);
                        ih3.setVisibility(View.INVISIBLE);

                        break;
                    case R.id.Rbcontinental:
                        desh2.setVisibility(View.VISIBLE);
                        ih2.setVisibility(View.VISIBLE);

                        desh1.setVisibility(View.INVISIBLE);
                        desh3.setVisibility(View.INVISIBLE);
                        ih1.setVisibility(View.INVISIBLE);
                        ih3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.Rbcalle:
                        desh3.setVisibility(View.VISIBLE);
                        ih3.setVisibility(View.VISIBLE);

                        desh1.setVisibility(View.INVISIBLE);
                        desh2.setVisibility(View.INVISIBLE);
                        ih2.setVisibility(View.INVISIBLE);
                        ih1.setVisibility(View.INVISIBLE);
                        break;

                }
            }
        };
        Rbpantagora.setOnClickListener(list);
        Rbcontinental.setOnClickListener(list);
        Rbcalle.setOnClickListener(list);




    }




}
