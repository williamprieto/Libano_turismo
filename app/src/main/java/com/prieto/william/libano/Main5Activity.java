package com.prieto.william.libano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    RadioButton Rbnevado;
    RadioButton Rbfinca;
    RadioButton Rbcatedral;

    RadioGroup rggrupot1;

    ImageView it1;
    ImageView it2;
    ImageView it3;

    TextView dest1;
    TextView dest2;
    TextView dest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        Rbnevado= (RadioButton)findViewById(R.id.Rbnevado);
        Rbfinca= (RadioButton)findViewById(R.id.Rbfinca);
        Rbcatedral = (RadioButton)findViewById(R.id.Rbcatedral);

        rggrupot1 = (RadioGroup)findViewById(R.id.rggrupot1);

        it1= (ImageView)findViewById(R.id.it1);
        it2= (ImageView)findViewById(R.id.it2);
        it3= (ImageView)findViewById(R.id.it3);

        dest1=(TextView)findViewById(R.id.dest1);
        dest2=(TextView)findViewById(R.id.dest2);
        dest3=(TextView)findViewById(R.id.dest3);


        View.OnClickListener list=new View.OnClickListener() {
            @Override
            public void onClick(View vi) {

                switch(vi.getId()) {

                    case R.id.Rbnevado:
                        dest1.setVisibility(View.VISIBLE);
                        it1.setVisibility(View.VISIBLE);

                        dest2.setVisibility(View.INVISIBLE);
                        dest3.setVisibility(View.INVISIBLE);
                        it2.setVisibility(View.INVISIBLE);
                        it3.setVisibility(View.INVISIBLE);

                        break;
                    case R.id.Rbfinca:
                        dest2.setVisibility(View.VISIBLE);
                        it2.setVisibility(View.VISIBLE);

                        dest1.setVisibility(View.INVISIBLE);
                        dest3.setVisibility(View.INVISIBLE);
                        it1.setVisibility(View.INVISIBLE);
                        it3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.Rbcatedral:
                        dest3.setVisibility(View.VISIBLE);
                        it3.setVisibility(View.VISIBLE);

                        dest1.setVisibility(View.INVISIBLE);
                        dest2.setVisibility(View.INVISIBLE);
                        it2.setVisibility(View.INVISIBLE);
                        it1.setVisibility(View.INVISIBLE);
                        break;

                }
            }
        };
        Rbnevado.setOnClickListener(list);
        Rbfinca.setOnClickListener(list);
        Rbcatedral.setOnClickListener(list);




    }

}
