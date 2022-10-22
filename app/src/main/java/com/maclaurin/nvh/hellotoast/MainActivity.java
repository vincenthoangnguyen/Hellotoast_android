package com.maclaurin.nvh.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mCount= 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
//        toast.show();
        Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
     mCount ++;
     if(mShowCount != null){
         mShowCount.setText(Integer.toString(mCount));
     }
    }

    public void countDown(View view) {
        mCount --;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
