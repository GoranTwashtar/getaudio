package com.twashtar.getaudio;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.util.Log;
import android.media.AudioManager;

public class GetAudioPlugin extends CordovaPlugin {
	
	public boolean getAudioMode(String mode) {
	    Context context = webView.getContext();
	    AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
	    switch (audioManager.getRingerMode()) {
		case AudioManager.RINGER_MODE_SILENT:
		    audioManager.setSpeakerphoneOn(false);
    		    audioManager.setRouting(AudioManager.MODE_IN_CALL,AudioManager.ROUTE_EARPIECE,AudioManager.ROUTE_ALL);
    		    break;
		case AudioManager.RINGER_MODE_VIBRATE:
		    audioManager.setSpeakerphoneOn(false);
    		    audioManager.setRouting(AudioManager.MODE_IN_CALL,AudioManager.ROUTE_EARPIECE,AudioManager.ROUTE_ALL);
    		    break;
	    }
	    return true;
	}
}
