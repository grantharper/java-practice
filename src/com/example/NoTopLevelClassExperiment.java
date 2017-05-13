package com.example;


class NoTopLevelClassExperiment{
    
    public static void main(String[] args) {
        System.out.println("No top level class experiment is running because it has the same name as the file");
    }
}

class NonPublicMain{
    
    public static void main(String[] args) {
        System.out.println("Can execute a main method from a non-public class");
    }
    
}
class NonPublicA {
    static{
        System.out.println("Non-public A class is being created");
    }
    
    void write(){
        System.out.println("A is writing");
    }
}

class NonPublicB {
    static{
        System.out.println("Non-public B class is being created");
    }
    
    public void write(){
        System.out.println("B is writing");
    }
}
