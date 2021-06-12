package com.example.gridviewexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
GridView gridview;

    String[] web = {
            "Tollfree",
            "Paid",
            "Pending",
            "Attendance"

    } ;
    int[] imageId = {
            R.drawable.ic_note,
            R.drawable.ic_paid,
            R.drawable.ic_pending,
            R.drawable.ic_profile


    };
    GridView gridview1;
    String[] web1 = {
            "ATTENDANCE",
            "HOMEWORK",
            "CLASSTEST",
            "TRANSPORT",
            "EXAM",
            "ACTIVITES",
            "LIBRARY",
            "HOSTAL",
            "SPORT",
            "PAYMENT",
            "BUS TRACKING",
            "EVENT"

    } ;
    int[] imageId1 = {
            R.drawable.ic_profile,
            R.drawable.ic_homework,
            R.drawable.ic_classtest,
            R.drawable.ic_transport,
            R.drawable.ic_exam,
            R.drawable.ic_activity,
            R.drawable.ic_library,
            R.drawable.ic_hostal,
            R.drawable.ic_sports,
            R.drawable.ic_payment,
            R.drawable.ic_bustracking,
            R.drawable.ic_news


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        gridview=(GridView)findViewById(R.id.gridview1);
        gridview.setAdapter(adapter);

       CustomGrid1 adapter1 = new CustomGrid1(MainActivity.this, web1, imageId1);
        gridview1=(GridView)findViewById(R.id.gridview2);
        gridview1.setAdapter(adapter1);


        toolbar = findViewById(R.id.toolbar1);

        setSupportActionBar(toolbar);


        nav=findViewById(R.id.navmenu);
        drawerLayout=findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.menu_home:
                        Toast.makeText(getApplicationContext(),"Home panel is open",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_call:
                        Toast.makeText(getApplicationContext(),"Call panel is open",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_setting:
                        Toast.makeText(getApplicationContext(),"setting panel is open",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });

       /* grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }*/

}}

