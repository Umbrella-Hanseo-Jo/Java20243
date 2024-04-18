package com.cookandroid.project6_3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();

        TabHost.TabSpec
                tabSpecDog=tabHost.newTabSpec("dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.dog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec
                tabSpecCow=tabHost.newTabSpec("cow").setIndicator("소");
        tabSpecCow.setContent(R.id.cow);
        tabHost.addTab(tabSpecCow);

        TabHost.TabSpec
                tabSpecTrex=tabHost.newTabSpec("trex").setIndicator("티라노");
        tabSpecTrex.setContent(R.id.trex);
        tabHost.addTab(tabSpecTrex);

        TabHost.TabSpec
                tabSpecPenguin=tabHost.newTabSpec("penguin").setIndicator("펭귄");
        tabSpecPenguin.setContent(R.id.penguin);
        tabHost.addTab(tabSpecPenguin);
    }
}