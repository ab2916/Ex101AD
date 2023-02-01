package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * The type Main activity 2.
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"beak main activity");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        String str = menuItem.getTitle().toString();
        if(str.equals("beak main activity"))
        {
            finish();
        }
        return true;
    }
}