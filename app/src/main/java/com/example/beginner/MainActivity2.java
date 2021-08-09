package com.example.beginner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();

        webView=findViewById(R.id.webview);

        int position=getIntent().getIntExtra("story_key",0);
        if(position==0){
            webView.loadUrl("file:///android_asset/Disaster.html");
        }
        else if(position==1){
            webView.loadUrl("file:///android_asset/Disaster management.html");
        }
        else if(position==2){
            webView.loadUrl("file:///android_asset/Earthquake.html");
        }
        else if(position==3){
            webView.loadUrl("file:///android_asset/flood.html");
        }
        else if(position==4){
            webView.loadUrl("file:///android_asset/Cyclone.html");
        }
        else if(position==5){
            webView.loadUrl("file:///android_asset/Landslides.html");
        }
        else if(position==6){
            webView.loadUrl("file:///android_asset/Volcano.html");
        }
        else if(position==7){
            webView.loadUrl("file:///android_asset/Tornado.html");
        }
        else if(position==8){
            webView.loadUrl("file:///android_asset/Tsunami.html");
        }
        else if(position==9){
            webView.loadUrl("file:///android_asset/Drought.html");
        }
        else if(position==10){
            webView.loadUrl("file:///android_asset/Nuclear accidents.html");
        }
        else if(position==11){
            webView.loadUrl("file:///android_asset/Chemical and biological disasters.html");
        }
        else if(position==12){
            webView.loadUrl("file:///android_asset/Survival Skills  and Precautions.html");
        }
        else if(position==13){
            webView.loadUrl("file:///android_asset/Emergency mode of communication.html");
        }
        else if(position==14){
            webView.loadUrl("file:///android_asset/Disaster Management Team.html");
        }
        else if(position==15){
            webView.loadUrl("file:///android_asset/Disaster Preparedness.html");
        }
        else if(position==16){
            webView.loadUrl("file:///android_asset/Number.html");
        }
    }
}