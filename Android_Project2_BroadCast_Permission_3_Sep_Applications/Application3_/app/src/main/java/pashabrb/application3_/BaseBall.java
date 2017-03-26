package pashabrb.application3_;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BaseBall extends BroadcastReceiver {
    public BaseBall() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
     

        Intent i = new Intent(context, BaseB.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);


    }
}
