package pashabrb.application3_;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Basketball extends BroadcastReceiver {
    public Basketball() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
      
        Intent i = new Intent(context, BB.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);

    }
}
