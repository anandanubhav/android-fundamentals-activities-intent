package com.aa.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Here ----");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView secondTextView = findViewById(R.id.secondActivityTextView);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        StringBuilder msg = new StringBuilder();
        msg.append("Welcome - ");
        String name = b.getString(Constants.KEY_NAME, "DEFAULT_NAME");
        msg.append(name);
        secondTextView.setText(msg);
    }
}
