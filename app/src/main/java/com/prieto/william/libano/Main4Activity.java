package com.prieto.william.libano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    RadioButton Rbtomasa;
    RadioButton Rbcoco;
    RadioButton Rbpalo;

    RadioGroup rggrupob1;

    ImageView ib1;
    ImageView ib2;
    ImageView ib3;

    TextView desb1;
    TextView desb2;
    TextView desb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Rbtomasa= (RadioButton)findViewById(R.id.Rbtomasa);
        Rbcoco= (RadioButton)findViewById(R.id.Rbcoco);
        Rbpalo = (RadioButton)findViewById(R.id.Rbpalo);

        rggrupob1 = (RadioGroup)findViewById(R.id.rggrupob1);

        ib1= (ImageView)findViewById(R.id.ib1);
        ib2= (ImageView)findViewById(R.id.ib2);
        ib3= (ImageView)findViewById(R.id.ib3);

        desb1=(TextView)findViewById(R.id.desb1);
        desb2=(TextView)findViewById(R.id.desb2);
        desb3=(TextView)findViewById(R.id.desb3);


        View.OnClickListener list=new View.OnClickListener() {
            @Override
            public void onClick(View vi) {

                switch(vi.getId()) {

                    case R.id.Rbtomasa:
                        desb1.setVisibility(View.VISIBLE);
                        ib1.setVisibility(View.VISIBLE);

                        desb2.setVisibility(View.INVISIBLE);
                        desb3.setVisibility(View.INVISIBLE);
                        ib2.setVisibility(View.INVISIBLE);
                        ib3.setVisibility(View.INVISIBLE);

                        break;
                    case R.id.Rbcoco:
                        desb2.setVisibility(View.VISIBLE);
                        ib2.setVisibility(View.VISIBLE);

                        desb1.setVisibility(View.INVISIBLE);
                        desb3.setVisibility(View.INVISIBLE);
                        ib1.setVisibility(View.INVISIBLE);
                        ib3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.Rbpalo:
                        desb3.setVisibility(View.VISIBLE);
                        ib3.setVisibility(View.VISIBLE);

                        desb1.setVisibility(View.INVISIBLE);
                        desb2.setVisibility(View.INVISIBLE);
                        ib2.setVisibility(View.INVISIBLE);
                        ib1.setVisibility(View.INVISIBLE);
                        break;

                }
            }
        };
        Rbtomasa.setOnClickListener(list);
        Rbcoco.setOnClickListener(list);
        Rbpalo.setOnClickListener(list);




    }

}
