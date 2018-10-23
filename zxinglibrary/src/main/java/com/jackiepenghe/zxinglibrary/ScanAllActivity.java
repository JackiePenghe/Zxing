package com.jackiepenghe.zxinglibrary;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Menu;

import com.google.zxing.Result;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.result.ResultHandler;

/**
 * @author jackie
 */
public class ScanAllActivity extends CaptureActivity {

    @Override
    protected void handleDecodeInternally(Result rawResult, ResultHandler resultHandler, Bitmap barcode) {
        String formatType = rawResult.getBarcodeFormat().toString();
        Log.w("TEST", "formatType = " + formatType);
        String text = rawResult.getText();
        Log.w("TEST", "text = " + text);
        Intent intent = new Intent();
        intent.putExtra(FORMAT,formatType);
        intent.putExtra(TEXT,text);
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
