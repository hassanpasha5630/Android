package pashabrb.application3_;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BB extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb);
        firstF f = new firstF();
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.activity_bb, f).addToBackStack("main").commit();
        }



    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


    }


    @Override
    public void onBackPressed(){
        if (getSupportFragmentManager().getBackStackEntryCount() == 1){

            firstF f = new firstF();
            web_view_fragment w = new web_view_fragment();

            Log.i("MainActivity", "popping backstack");

            Intent i = new Intent(this,BB.class);
            startActivity(i);

        }
        else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu men) {

        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu, men);
        return super.onCreateOptionsMenu(men);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
     


        switch (item.getItemId()) {

            case R.id.BasketBall:
                Toast.makeText(BB.this, "Already on Basketball",
                        Toast.LENGTH_LONG).show();
                return true;

            case R.id.BaseBall:
                Intent i = new Intent(BB.this, BaseB.class);
                startActivity(i);
                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }





}