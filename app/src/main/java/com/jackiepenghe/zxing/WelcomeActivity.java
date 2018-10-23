package com.jackiepenghe.zxing;

import android.content.Intent;
import com.jackiepenghe.baselibrary.BaseWelcomeActivity;

/**
 * @author jackie
 */
public class WelcomeActivity extends BaseWelcomeActivity {
    /**
     * 当动画执行完成后调用这个函数
     */
    @Override
    protected void doAfterAnimation() {
        Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * 设置ImageView的图片资源
     *
     * @return 图片资源ID
     */
    @Override
    protected int setImageViewSource() {
        return 0;
    }
}
