package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.os.SystemClock;


/**
* Send Keystrokes to the cordova webview
*/
public class SendKeystrokes extends CordovaPlugin {
  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      if (action.equals("sendKeystroke")) {
          int type = args.getInt(0);
          int key = args.getInt(1);
          int meta = args.getInt(2);
          this.sendKey(type, key, meta, callbackContext);
          return true;
      }
      return false;
  }

  private void sendKey(int type, int key, int meta, CallbackContext callbackContext) {
      final long eventTime = SystemClock.uptimeMillis();
      webView.getView().dispatchKeyEvent(new KeyEvent (eventTime, eventTime, type, key, 500, meta));
      callbackContext.success();
  }}
