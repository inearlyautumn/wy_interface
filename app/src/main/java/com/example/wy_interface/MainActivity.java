package com.example.wy_interface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.wy_interface.interfaces.FunctionFour;
import com.example.wy_interface.interfaces.FunctionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FunctionManager.getInstance().addFunction(new FunctionFour<User, User>("FunctionFour") {
            @Override
            public User function(User pUser) {
                Log.i("MainActivity", "== " + pUser.toString());
                User user = new User("55555", "55555");
                return user;
            }
        });


        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivity(intent);
    }
}
