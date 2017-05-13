package com.example;

public class StaticAndInstance {

    protected static String I_AM_STATIC = "Static";
    
    private String instanceString = "Instance";
    
    public static void main(String[] args) {
        System.out.println("Static and Instance examples...");
        
        //can't call an instance method or instance variable from a static context
        //getString();
        //instanceString = "something else";
        
        //can access the static variable of method from static context;
        I_AM_STATIC = "Static modified";
        getStaticString();
        
        StaticAndInstance instance = new StaticAndInstance();
        
        instance.instanceString = "Instance modified from instance context within static method";
        
        instance.I_AM_STATIC = "Static modified from instance context (bad practice)";
        
        instance.getString(); 
        
        instance.getString(1); //bad practice, but this is allowed (static access from instance)        
    }
    
    public void modifyStaticFromInstance(){
        I_AM_STATIC = "stupid idea";
    }
    
    //cannot have the same method name for methods with the same signature even though they are static versus instance
    //this makes sense because from the instance context, you could call both, and the compiler wouldn't know which one
    public static String getStaticString(){
        return "A static String";
    }
    
    //can have the same method name for static and instance because the signature is different
    public static String getString(int blah){
        return "a Static method with a different signature";
    }
    
    public String getString(){
        return "A local String";
    }
}

class StaticImports extends StaticAndInstance{
    
    //this is allowed because the static variable is accessible within this package, and thus this class file
    static {
        I_AM_STATIC = "really stupid idea";
        
        StaticAndInstance.I_AM_STATIC = "accessing the static variable from the parent class";
    }
    
    static String I_AM_STATIC = "my own static variable";
    
    static{
        System.out.println(I_AM_STATIC);
    }
}
