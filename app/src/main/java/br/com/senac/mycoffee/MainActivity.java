package br.com.senac.mycoffee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    CoffeeFragment coffeeFragment = new CoffeeFragment();
    TeaFragment teaFragment = new TeaFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    DonutsFragment donutsFragment = new DonutsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, coffeeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.coffeePage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, coffeeFragment).commit();
                        return true;
                    case R.id.teaPage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, teaFragment).commit();
                        return true;
                    case R.id.muffinPage:Page:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, muffinFragment).commit();
                        return true;
                    case R.id.donutsPage:Page:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, donutsFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}