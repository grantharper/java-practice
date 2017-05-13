package com.example;

public class NonPublicClassAccess {

    
    public static void main(String[] args) {
        System.out.println("NonPublic Class Access running");
        
        NonPublicA a;
        NonPublicB b;
        b = new NonPublicB();
        a = new NonPublicA();
        
        b.write();
        a.write();
        
    }
}
