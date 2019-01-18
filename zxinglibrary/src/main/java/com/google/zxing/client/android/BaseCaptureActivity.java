package com.google.zxing.client.android;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.google.zxing.client.android.camera.CameraManager;

public abstract class BaseCaptureActivity extends Activity {

    public abstract ViewfinderView getViewfinderView();

    public abstract CameraManager getCameraManager();

    public abstract void handleDecode(Result obj, Bitmap barcode, float scaleFactor);

    public abstract void drawViewfinder();

    public abstract Handler getHandler();

    public abstract void restartPreviewAfterDelay(long l);
}
