package com.stone.launchmode;


import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * desc     :
 * author   : stone
 * homepage : http://stone86.top
 * email    : aa86799@163.com
 * time     : 2018/6/13 17 44
 */
public class FifthActivity extends AppCompatActivity {
    private static final String TAG = "stone->FifthActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "taskId=" + getTaskId());
    }
}
