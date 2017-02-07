package com.pashabrb.homework2;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

import java.net.URL;
import java.util.regex.Pattern;

// references : http://stackoverflow.com/questions/21836074/edittext-gettext-tostring-shows-error ( Error ) -- > Fixed
// PaternMatching :https://developer.android.com/reference/java/util/regex/Pattern.html

// Intent -- > ACTION_MAIN with category CATEGORY_HOME -- Launch the home screen.

public class window2 extends AppCompatActivity {

    public static final  String REGEXP = "yyy-zzzz";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window2);


       final Button clickmeHuman = (Button) findViewById(R.id.ClickmeHuman);
       final EditText clickmeHumanText = (EditText) findViewById(R.id.ClickmeHumanText);
            final String UserInput = clickmeHumanText.getText().toString();

       TextView mTV = (TextView)findViewById(R.id.textView2);
//        mTV.setText(getIntent().getStringExtra("mytext"));




        clickmeHuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                boolean Format1 = Pattern.matches(UserInput,"yyy-zzzz");
//                if(Format1){
//                    Intent phoneNumber = new Intent(Intent.ACTION_MAIN);
//                    PackageManager Phone = getPackageManager();
//                    phoneNumber = Phone.getLaunchIntentForPackage("com.Phone");
//                    phoneNumber.addCategory(Intent.CATEGORY_LAUNCHER);
//                    startActivity(phoneNumber);
//                }
//

             //   if(UserInput.contentEquals("yyy-zzzz")){
                PhoneNumberUtils.formatNumber(UserInput);
                if(PhoneNumberUtils.compare(UserInput,"yyy-zzzz")){
//                    Intent phoneNumber = new Intent(Intent.ACTION_MAIN);
//                    PackageManager Phone = getPackageManager();
//                    phoneNumber = Phone.getLaunchIntentForPackage("com.Phone");
//                    phoneNumber.addCategory(Intent.CATEGORY_LAUNCHER);
//                    startActivity(phoneNumber);

                    // testing
                    Intent intent = new Intent (window2.this, MainActivity.class); // this will call the second function
                    startActivity(intent);


                }



                //                     Intent Text = new Intent(v.getContext(),Phone.class);
//                     Text.putExtra("mytext",PhoneNumber.getText().toString());




//                     Intent Callbutton = new Intent(Phone.this, window2.class);
//                     startActivity(Callbutton);
            }




//                Intent CallButton = new Intent(Intent.ACTION_DIAL);
//                CallButton.setData(Uri.parse("tel:123456"));
//                startActivity(CallButton);



                // regular expression
                // and go through the whole string

        });


    }
}
