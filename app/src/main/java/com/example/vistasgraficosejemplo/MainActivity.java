package com.example.vistasgraficosejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    miPropiaVista miPropiaVista;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] data={7,5,12,8,4,6,7,9,7,8,9,9,4,5};
        int[] color={Color.argb(255,205,115,114),
                     Color.argb(255,79,129,188),
                     Color.argb(255,192,80,78),
                     Color.argb(255,155,187,88),
                     Color.argb(255,128,100,161),
                     Color.argb(255,74,172,197),
                     Color.argb(255,247,150,71),
                     Color.argb(255,44,77,118),
                     Color.argb(255,119,43,43),
                     Color.argb(255,97,117,48),
                     Color.argb(255,75,59,98),
                     Color.argb(255,39,106,123),
                     Color.argb(255,182,87,7),
                     Color.argb(255,114,154,205),
        };
        linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        linearLayout.addView(new miPropiaVista(this,14,data,color));
    }
}