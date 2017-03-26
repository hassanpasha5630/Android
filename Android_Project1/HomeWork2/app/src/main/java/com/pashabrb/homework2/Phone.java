package com.pashabrb.homework2;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.telephony.PhoneNumberUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone extends AppCompatActivity {
    boolean ButtonPressed = false ;
    boolean TextIsCorrect = false;

    public int value;
    public String matchedString ;
    public String UI ;

    public String assign(String something){
        return this.UI = something;

    }

    public boolean  isTextValid(String something) {
      return android.util.Patterns.PHONE.matcher(something).matches();
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

            Button Call = (Button) findViewById(R.id.Phone) ; // action listener for the button
            final TextView PhoneBox = (TextView) findViewById(R.id.PhoneNumber);
            final EditText PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
            final String Userinput = PhoneNumber.getText().toString();

            assign(Userinput);
            Log.i("HasssanPasha",UI);


        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pattern p1 = Pattern.compile("[0-9]{3}(-)[0-9]{4}");
                // p1 is pattern to detect this  =  xxx-yyyy
                Pattern p2 = Pattern.compile("\\([0-9]{3}\\)[0-9]{3}(-)[0-9]{4}");
                // p2 is pattern to detect this  =  (aaa)xxx-yyyy
                Pattern p3 = Pattern.compile("\\([0-9]{3}\\)\\s[0-9]{3}(-)[0-9]{4}");
                // p3 is pattern to detect this  =  (aaa) xxx-yyyy
                Matcher m = p1.matcher(PhoneNumber.getText().toString());
                Matcher m2 = p2.matcher(PhoneNumber.getText().toString());
                Matcher m3 = p3.matcher(PhoneNumber.getText().toString());


                // this find method will match our expression in whole srting and will tell us that weather
                // our expression is present in input or not.


                /*
                The code below checks to see if the statment has the proper format and if true it will be
                Put on the  main Act and Dialer
                 */


                matchedString = PhoneNumber.getText().toString();

                if(matchedString.length() > 8 && matchedString.length() < 13){

                    if(m.find()) {

                        matchedString = m.group(0);
                        Intent CallButton = new Intent(Intent.ACTION_DIAL);
                        CallButton.setData(Uri.parse("tel:" + matchedString));
                        startActivity(CallButton);


                        Intent textView = new Intent();
                        textView.putExtra("Number", "Number Matched to xxx-yyyy :" + matchedString);

                        setResult(1, textView);
                        finish();
                    }



                }

                if(matchedString.length() > 13){
                    if(m2.find()){
                        matchedString = m2.group(0);
                        Intent CallButton = new Intent(Intent.ACTION_DIAL);
                        CallButton.setData(Uri.parse("tel:" + matchedString));
                        startActivity(CallButton);



                        Intent textView = new Intent();
                        textView.putExtra("Number","Number Matched to (xxx)xxx-yyyy :"+matchedString);

                        setResult(1,textView);
                        finish();
                    }

                    if(m3.find()){
                        matchedString = m3.group(0);
                        Intent CallButton = new Intent(Intent.ACTION_DIAL);
                        CallButton.setData(Uri.parse("tel:" + matchedString));
                        startActivity(CallButton);



                        Intent textView = new Intent();
                        textView.putExtra("Number","Number Matched to (xxx) xxx-yyyy :"+matchedString);

                        setResult(1,textView);
                        finish();
                    }

                    if(m.find()){

                        matchedString = m.group(0);
                        Intent CallButton = new Intent(Intent.ACTION_DIAL);
                        CallButton.setData(Uri.parse("tel:" + matchedString));
                        startActivity(CallButton);



                        Intent textView = new Intent();
                        textView.putExtra("Number","Number Matched to xxx-yyyy :"+matchedString);

                        setResult(1,textView);
                        finish();




                    }

                }


                if (m.matches()) {


                    // this m.group will give us the string which will be found at very first place
                    // e.g  abacbab(xxx)ttt-yyyyasdbfka   it will match our pattern and
                    // give us the string (xxx)ttt-yyyyy from the whole string.
                    ;
                    // will open up the string on dirlar if found

                    Intent CallButton = new Intent(Intent.ACTION_DIAL);
                    CallButton.setData(Uri.parse("tel:" + matchedString));
                    startActivity(CallButton);

                    // The link below showed example how to use ExtraIntent Right / B4 getting a weird error
                    //Reference : "http://www.javatpoint.com/android-startactivityforresult-example"]

                    Intent textView = new Intent();
                    textView.putExtra("Number","Number Matched to xxx-yyyy :"+matchedString);

                    setResult(1,textView);
                    finish();

                } else if (m2.matches()) {



                    // will open up the string on dirlar if found
                    Intent CallButton = new Intent(Intent.ACTION_DIAL);
                    CallButton.setData(Uri.parse("tel:" + matchedString));
                    startActivity(CallButton);



                    Intent textView = new Intent();
                    textView.putExtra("Number","Number Matched to (xxx)xxx-yyyy :"+matchedString);

                    setResult(1,textView);
                    finish();


                } else if (m3.matches()) {



                    // will open up the string on dirlar if found
                    Intent CallButton = new Intent(Intent.ACTION_DIAL);
                    CallButton.setData(Uri.parse("tel:" + matchedString));
                    startActivity(CallButton);


                    Intent textView = new Intent();
                    textView.putExtra("Number","Number Matched to (xxx) xxx-yyyy :"+matchedString);

                    setResult(1,textView);
                    finish();

                }else
                {
                    Intent textView = new Intent();
                    textView.putExtra("Number","NUMBER NOT FOUND");

                    setResult(1,textView);
                    finish();
                }


            }
        });

        }
}





