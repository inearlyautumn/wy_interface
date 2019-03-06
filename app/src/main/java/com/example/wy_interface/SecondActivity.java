package com.example.wy_interface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wy_interface.interfaces.FunctionManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.tvSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = FunctionManager.getInstance().testFour("FunctionFour",
                        new User("参数用户", "参数密码"), User.class);
                Log.i("SecondActivity", "== " + user.toString());
            }
        });
    }
}
