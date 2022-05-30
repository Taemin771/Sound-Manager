package com.example.introactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageButton btnTimeset,btnVolume;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        btnTimeset = findViewById(R.id.btn_Timeset);
        btnVolume = findViewById(R.id.btn_volume);

        btnTimeset.setOnClickListener(new View.OnClickListener() { //버튼 : 시간설정 Intent 필요
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(MainActivity.this,"timesetActivity".class);
                //startActivity(intent)
            }
        });
        btnVolume.setOnClickListener(new View.OnClickListener() { // 버튼 : 볼륨설정 Intent 필요
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,"VolumesetActivity".class);
                //startActivity(intent) /
            }
        });
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case  R.id.nav_home: //SoundManager home 으로 돌아가기

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

//Paste your privacy policy link

                 //  case  R.id.nav_drawer1:                            // 알람설정 클릭시 이동 intent

                //     Intent browserIntent  = new Intent();
                //     startActivity(browserIntent);
//
//
//                    case  R.id.nav_drawer2:{                          // 소리설정 클릭시 이동 intent
//
//                        Intent browserIntent  = new Intent();
//                        startActivity(browserIntent);
//
//                    }

                    //       break;
                    /*case  R.id.nav_share:{  // 공유 메뉴 - 안씀

                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBody =  "http://play.google.com/store/apps/detail?id=" + getPackageName();
                        String shareSub = "Try now";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));

                    }
                    break;*/
                }
                return false;
            }
        });
    }
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }

}

