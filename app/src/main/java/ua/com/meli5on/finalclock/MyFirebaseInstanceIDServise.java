package ua.com.meli5on.finalclock;

import android.util.Log;


import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static com.crashlytics.android.answers.Answers.TAG;

/**
 * Created by Andrew on 29.11.2017.
 */

public class MyFirebaseInstanceIDServise extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh(){
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getId();
        sendTokenToServer(token);

    }
    private void sendTokenToServer(String token){
        Log.d(TAG, "Token: "+token);

    }
}
