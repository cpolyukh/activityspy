package edu.washington.cpolyukh.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i(TAG, savedInstanceState.toString());
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onStart event fired");
    }

    @Override
    public void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onResume event fired");
    }

    @Override
    public void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onPause event fired");
    }

    @Override
    public void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onStop event fired");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(TAG, "We’re going down, Captain!");
    }
}