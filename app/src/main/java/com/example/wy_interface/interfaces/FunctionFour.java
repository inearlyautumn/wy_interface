package com.example.wy_interface.interfaces;

public abstract class FunctionFour<T,P> extends BaseFunction {
    public FunctionFour(String functionName) {
        super(functionName);
    }

    public abstract T function(P p);

}
