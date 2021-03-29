package com.example.drtlem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnrToplama,lnrCikarma,lnrCarpma,lnrBolme,lnrDortislem;
    private ImageView imgShare;
    private RelativeLayout RlrRate;
    int kategori=1;
    int toplama=1;
    int cikarma=1;
    int carpma=1;
    int bolme=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        lnrToplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNextActivity();
            }
        });
        lnrCikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_cikarma.class);
                intent.putExtra("cikarma",cikarma);
                startActivity(intent);
            }
        });
        lnrCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_carpma.class);
                intent.putExtra("carpma",carpma);
                startActivity(intent);
            }
        });
        lnrBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_bolme.class);
                intent.putExtra("bolme",bolme);
                startActivity(intent);
            }
        });
        RlrRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.setsoft.semihtr13.englishforkids"));
                startActivity(intent);
            }
        });
    }


    public void startNextActivity(){
        Intent intent=new Intent(MainActivity.this,activity_toplama.class);
        intent.putExtra("kategori",kategori);
        startActivity(intent);
    }

    private void findView() {
        lnrToplama=findViewById(R.id.lnrToplama);
        lnrCikarma=findViewById(R.id.lnrCikarma);
        lnrCarpma=findViewById(R.id.lnrCarpma);
        lnrBolme=findViewById(R.id.lnrBolme);
        lnrDortislem=findViewById(R.id.lnrDortislem);
        RlrRate=findViewById(R.id.RlrRate);
    }
}