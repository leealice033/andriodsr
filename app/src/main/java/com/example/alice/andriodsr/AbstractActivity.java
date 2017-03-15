package com.example.alice.andriodsr;

import android.app.Activity;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.util.Log;

/**
 * Created by Alice on 2017/3/15.
 */

public class AbstractActivity extends Activity {
    private static final int REQUEST_CODE = 1234;
    private static final String TAG = "abstractActivity";
    public void gotoSpeechRecognize(){
        Log.e(TAG, "");
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        startActivityForResult(intent, REQUEST_CODE);
    }
}