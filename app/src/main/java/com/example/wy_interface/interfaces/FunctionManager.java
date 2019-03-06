package com.example.wy_interface.interfaces;

import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class FunctionManager {

    private static volatile FunctionManager instance;
    private Map<String, FunctionOne> mFunctionOne;
    private Map<String, FunctionTwo> mFunctionTwo;
    private Map<String, FunctionThree> mFunctionThree;
    private Map<String, FunctionFour> mFunctionFour;

    private FunctionManager() {
        mFunctionOne = new HashMap<>();
        mFunctionTwo = new HashMap<>();
        mFunctionThree = new HashMap<>();
        mFunctionFour = new HashMap<>();
    }

    public static FunctionManager getInstance() {
        if (instance == null) {
            instance = new FunctionManager();
        }
        return instance;
    }
    
    public void addFunction(FunctionOne function) {
        mFunctionOne.put(function.name, function);
    }

    public void addFunction(FunctionTwo function) {
        mFunctionTwo.put(function.name, function);
    }

    public void addFunction(FunctionThree function) {
        mFunctionThree.put(function.name, function);
    }

    public void addFunction(FunctionFour function) {
        mFunctionFour.put(function.name, function);
    }
    
    public void testOne(String functionName) {
        if (TextUtils.isEmpty(functionName)) {
            return;
        }
        if (mFunctionOne != null) {
            FunctionOne f = mFunctionOne.get(functionName);
            if (f != null) {
                f.function();
            } else {
                Log.i("错误", "没有对应的的方法" + functionName);
            }
        }
    }

    public <T> T testTwo(String functionName, Class<T> t) {
        if (TextUtils.isEmpty(functionName)) {
            return null;
        }
        if (mFunctionTwo != null) {
            FunctionTwo f = mFunctionTwo.get(functionName);
            if (f != null) {
                return t.cast(f.function());
            }
        }
        return null;
    }

    public <P> void testThree(String functionName, P p) {
        if (TextUtils.isEmpty(functionName)) {
            return;
        }
        if (mFunctionThree != null) {
            FunctionThree f = mFunctionThree.get(functionName);
            if (f != null) {
                f.function(p);
            } else {
                Log.i("错误", "没有对应的的方法" + functionName);
            }
        }
    }

    public <T, P> T testFour(String functionName, P p, Class<T> t) {
        if (TextUtils.isEmpty(functionName)) {
            return null;
        }
        if (mFunctionFour != null) {
            FunctionFour f = mFunctionFour.get(functionName);
            if (f != null) {
                return  t.cast(f.function(p));
            } else {
                Log.i("错误", "没有对应的的方法" + functionName);
            }
        }
        return null;
    }
}
