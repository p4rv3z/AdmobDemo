package vip.parvez.admobdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bannerAd(View view) {
        Intent intent = new Intent(this, Banner.class);
        startActivity(intent);
    }

    public void interstitialAd(View view) {
        Intent intent = new Intent(this, Interstitial.class);
        startActivity(intent);
    }
}
