package pashabrb.application1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    int REQUEST_CODE_ASK_PERMISSIONS = 123;
    public Button b1 ;
    public Button b2 ;

    private static final String Permission = "edu.uic.cs478.project3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

  


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();

        b1 = (Button) findViewById(R.id.Button1);
        b2 = (Button) findViewById(R.id.button2);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                int hasWriteContactsPermission = checkSelfPermission(Manifest.permission.project3);
                if (hasWriteContactsPermission != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[] {Manifest.permission.project3},
                            REQUEST_CODE_ASK_PERMISSIONS);
                    Toast.makeText(context,"Requesting Permission ",Toast.LENGTH_LONG).show();
                    return;
                }



                Intent i = new Intent();
                i.setAction("button_one");
                i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(i);
        

            }
        }) ;



        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                int hasWriteContactsPermission = checkSelfPermission(Manifest.permission.project3);
                if (hasWriteContactsPermission != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[] {Manifest.permission.project3},
                            REQUEST_CODE_ASK_PERMISSIONS);
                    Toast.makeText(context,"Requesting Permission ",Toast.LENGTH_LONG).show();
                    return;
                }



                    Intent i = new Intent();
                    i.setAction("button_two");
                    i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                     sendBroadcast(i);
                  




            }
        }) ;





    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);

        if(requestCode==100){
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"Permisson Accepted ",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Permisson Denied ",Toast.LENGTH_LONG).show();
            }

        }
    }
}
