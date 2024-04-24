package com.example.arthumano_Consultores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    public FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

         if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new PrincipalFragment()).commit();
            navigationView.setCheckedItem(R.id.home);
         }

    } // Final onCreate method

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PrincipalFragment()).commit();
                break;
            case R.id.mujeres:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MujeresFragment()).commit();
                break;
            case R.id.niños:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CalendarioFragment()).commit();
                break;
            case R.id.prendas:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new LiderazgoFragment()).commit();
                break;
            case R.id.entretenimiento:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CalidezFragment()).commit();
                break;
            case R.id.maletas:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProteccionFragment()).commit();
                break;
            case R.id.vasos:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new VentasFragment()).commit();
                break;



        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}