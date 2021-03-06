package gunjika.varshney.gla.attendanceapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.widget.Toast;

public class WifiDirectBroadcastRecevier extends BroadcastReceiver {
    private WifiP2pManager mManager;
    private WifiP2pManager.Channel mChannel;
    private Wifi_activity mActivity;
    public WifiDirectBroadcastRecevier(WifiP2pManager mManager,WifiP2pManager.Channel mChannel,Wifi_activity mActivity)
    {
        this.mManager=mManager;
        this.mChannel=mChannel;
        this.mActivity=mActivity;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action))
        {
            int state=intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE,-1);
            if (state==WifiP2pManager.WIFI_P2P_STATE_ENABLED)
            {
                Toast.makeText(context, "wifi is on", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(context, "wifi is off", Toast.LENGTH_SHORT).show();
            }
        }
        else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action))
        {

        }
        else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action))
        {

        }
        else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action))
        {

        }

    }
}
