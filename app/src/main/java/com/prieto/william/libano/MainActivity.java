package com.prieto.william.libano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button bhotel;
    Button bturismo;
    ImageButton bares;
    ImageButton demog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bhotel= (Button)findViewById(R.id.bhotel);
        bturismo= (Button)findViewById(R.id.bturismo);
        bares=(ImageButton)findViewById(R.id.ibbares);
        demog=(ImageButton)findViewById(R.id.ibdemo);

//-------------------BARES MAIN 4 -----------------------------
        bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
//-------------------HOTELES MAIN 3-----------------------------
        bhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
//-------------------TURISMO MAIN 5-----------------------------
        bturismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);
            }
        });
//-------------------DEMOGRAFIA MAIN6 -----------------------------
        demog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);
            }
        });






    }

    //---------------BOTON DE MENU MAIN 2-------------------------
    //creacion el menú configurar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);//recurso
        return super.onCreateOptionsMenu(menu);
    }
    //dandolo la funcionalidad al menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.mConfigurar){
            // Toast.makeText(this, "Presionó configurar",Toast.LENGTH_SHORT).show();
            //EL INTENT PERMITE COMPARTIR INFORMACION ENTRE ACTIVIDADES
            Intent intent = new Intent(this,Main2Activity.class);

            //startActivity(intent);
            startActivityForResult(intent, 1234);
        }

        return super.onOptionsItemSelected(item);
    }
}
