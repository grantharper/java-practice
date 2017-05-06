package com.objectoriented;

public interface Coder {

    public void code();
    
    default void complain(){
        System.out.println("This is such a pain...");
    }
    
}
