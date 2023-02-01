package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Ll.
     */
    LinearLayout LL;
    /**
     * The Abd 1.
     */
    AlertDialog.Builder abd1;
    /**
     * The Abd 2.
     */
    AlertDialog.Builder abd2;
    /**
     * The Abd 3.
     */
    AlertDialog.Builder abd3;
    /**
     * The Abd 4.
     */
    AlertDialog.Builder abd4;
    /**
     * The Abd 5.
     */
    AlertDialog.Builder abd5;
    /**
     * The Rnd.
     */
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abd1 = new AlertDialog.Builder(this);
        abd2 = new AlertDialog.Builder(this);
        abd3 = new AlertDialog.Builder(this);
        abd4 = new AlertDialog.Builder(this);
        abd5 = new AlertDialog.Builder(this);
        LL = findViewById( R.id.Ll);
    }

    /**
     * On click btn 1.
     *
     * @param view the view
     */
    public void onClickBTN1(View view) {
        abd1.setTitle("First btn just Text");
        abd1.setMessage("It's not working!!!!");
        AlertDialog ad = abd1.create();
        ad.show();
    }

    /**
     * On click btn 2.
     *
     * @param view the view
     */
    public void onClickBTN2(View view) {
        abd2.setTitle("Second btn, again just Text");
        abd2.setMessage("It's not working!!!!");
        abd2.setIcon(R.drawable.bambanogat);
        AlertDialog ad = abd2.create();
        ad.show();
    }

    /**
     * On click btn 3.
     *
     * @param view the view
     */
    public void onClickBTN3(View view) {
        abd3.setTitle("guess btn number, again just Text");
        abd3.setMessage("It's not working!!!!");
        abd3.setIcon(R.drawable.bambanogat);
        abd3.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad = abd3.create();
        ad.show();
    }

    /**
     * On click btn 4.
     *
     * @param view the view
     */
    public void onClickBTN4(View view) {
        abd4.setTitle("guess btn number, again just Text");
        abd4.setMessage("It's not working!!!!");
        abd4.setIcon(R.drawable.bambanogat);
        abd4.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abd4.setPositiveButton("Change background color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int RED  = 0 ;
                int GREEN = 0;
                int BLUE = 0;
                RED = rnd.nextInt(254);
                GREEN = rnd.nextInt(254);
                BLUE = rnd.nextInt(254);
                LL.setBackgroundColor(Color.rgb(RED,GREEN,BLUE));
            }
        });
        AlertDialog ad = abd4.create();
        ad.show();
    }

    /**
     * On click btn 5.
     *
     * @param view the view
     */
    public void onClickBTN5(View view) {
        abd5.setTitle("guess btn number, again just Text");
        abd5.setMessage("It's not working!!!!");
        abd5.setIcon(R.drawable.bambanogat);
        abd5.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abd5.setPositiveButton("Change beckground color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int RED  = 0 ;
                int GREEN = 0;
                int BLUE = 0;
                RED = rnd.nextInt(254);
                GREEN = rnd.nextInt(254);
                BLUE = rnd.nextInt(254);
                LL.setBackgroundColor(Color.rgb(RED,GREEN,BLUE));
            }
        });
        abd5.setNeutralButton("Change beckground color to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LL.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = abd5.create();
        ad.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 100, "Credits");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str = menuItem.getTitle().toString();

        if (str.equals("Credits")) {
            Intent si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;
    }
}