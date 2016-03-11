package kr.ac.sungkyul.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

import kr.ac.sungkyul.myapplication.calculator.CalculatorActivity;
import kr.ac.sungkyul.myapplication.navigation.CustomNavigationActivity;
import kr.ac.sungkyul.myapplication.star.MakeStarActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIntentCal = (Button) findViewById(R.id.btnIntentCal);
        btnIntentCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
            }
        });

        Button btnIntentStar = (Button) findViewById(R.id.btnIntentStar);
        btnIntentStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MakeStarActivity.class));
            }
        });

        Button btnNav = (Button)findViewById(R.id.btnIntentNav);
        btnNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomNavigationActivity.class));
            }
        });

    }
}
