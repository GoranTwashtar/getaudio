package com.twashtar.getaudio;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;

public class GetAudioPlugin extends CordovaPlugin {
	
	public boolean getAudioMode(String mode) {
	    Context context = webView.getContext();
	    AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
	    switch (audioManager.getRingerMode()) {
		case AudioManager.RINGER_MODE_SILENT:
    		    Log.i("MyApp","Silent mode");
    		    break;
		case AudioManager.RINGER_MODE_VIBRATE:
    		    Log.i("MyApp","Vibrate mode");
    		    break;
		case AudioManager.RINGER_MODE_NORMAL:
    		    Log.i("MyApp","Normal mode");
    		    break;
	    }
	    return false;
	}

}
