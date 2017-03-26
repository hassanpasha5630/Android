package pashabrb.application3_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.LayoutInflater;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.support.v4.app.Fragment;



public class BaseB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_b);

        mlb_fragment mlbf = new mlb_fragment();
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().add(R.id.activity_base_b, mlbf).addToBackStack("main_mlb").commit();
           
        }

    }

    @Override
    public void onBackPressed(){
        if (getSupportFragmentManager().getBackStackEntryCount() == 1){

            firstF f = new firstF();
            web_view_fragment w = new web_view_fragment();

            Log.i("MainActivity", "popping backstack");
            getFragmentManager().popBackStack("main_mlb", android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
           

          Intent i = new Intent(this,BaseB.class);
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
        m.inflate(R.menu.menu,men);
        return super.onCreateOptionsMenu(men);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {




        switch (item.getItemId()) {

            case R.id.BaseBall:
                Toast.makeText(BaseB.this,"Already on BaseBall",
                        Toast.LENGTH_LONG).show();
                        return true;


            case R.id.BasketBall:
                Intent i = new Intent(BaseB.this,BB.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
