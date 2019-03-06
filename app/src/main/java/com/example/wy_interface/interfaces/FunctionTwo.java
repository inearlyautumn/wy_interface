package com.example.wy_interface.interfaces;

public abstract class FunctionTwo<T> extends BaseFunction {

    public FunctionTwo(String functionName) {
        super(functionName);
    }

    public abstract T function();
}
