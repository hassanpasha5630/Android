package com.pashabrb.homework2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;

import static android.R.attr.data;

// references : https://developer.android.com/reference/android/content/Intent.html
// Stack OverFlow : The methon they used caused my program to crash --> IDK Maybe the over they did not have OnPause()
// Git Hub :  https://github.com/hassanpasha5630 -- > Working as of 1/31/2017


public class MainActivity extends AppCompatActivity {

    /*
     Note : What is an Intent ? An Intent is an Abstract description of an operation to be performed. It will be used by any start Activity to lauch the activity
     Not sure but I will be using the Action_View to /ACTION_VIEW tel:123 -- Display the phone dialer with the
     given number filled in. Note how the VIEW action does what is considered the most reasonable thing for a particular URI

     */
    static boolean checking =false;
//    TextView Infor = (TextView) findViewById(R.id.ResultText);
    TextView Infor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Creating Buttons that will be displayed on the main activaty

        final Button Button1 = (Button) findViewById(R.id.Button1); // Button one will open child activity
        final Button Button2 = (Button) findViewById(R.id.button2); // Button 2 wil check for website if true than open

         Infor = (TextView) findViewById(R.id.Number);



        // listeners for the first button
        // Note to self : MainActivity.this means that you are in this activity and will be going to windows ( which is the second main activity
          Button1.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                  Intent intent = new Intent (MainActivity.this, Phone.class); // this will call the second function
                  //startActivity(intent);
                startActivityForResult(intent,1);
              }
      });


        /*
        Note another way to execute would be
         if ( true ) {
           run activity
         }else {
            false
         }
         */


        // this is the action listen for the second button
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checking = true ;
                String URL = "https://developer.android.com/index.html " ; //" https://github.com/hassanpasha5630" // creating this as a variable , beacuse it will it eaiser to change if needed
                Uri Prase = Uri.parse(URL) ; // Just to make life eaiser for myself if needed to change
                Intent link = new Intent(Intent.ACTION_VIEW, Prase);
                // Note : " A uri object is ususally used to tell a ContentProvider what we want to access by reference.It is an immutable
                // one-to-one mapping to a resource or data. The method Uri.Pasrse creates a nre Uri Object from a properly formated String
                startActivity(link);

                // this is will pause the the activty if true

                if(checking == true) {

                    onPause(); // This shouldnt matter but from my understanding this should protect the activity from messing up once we change applications
                } else {

                    checking = false;
                    onResume();

                }
            }
});







    }


    @Override
    public void onActivityResult(int requestCode , int resultCode , Intent data){
        //
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 1){
            String information =data.getStringExtra("Number");
            Infor.setText(information);

            //  }
        }

    }






}