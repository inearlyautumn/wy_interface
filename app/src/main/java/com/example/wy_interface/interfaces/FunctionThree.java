package com.example.wy_interface.interfaces;

public abstract class FunctionThree<P> extends BaseFunction {
    public FunctionThree(String functionName) {
        super(functionName);
    }

    public abstract void function(P p);
}
