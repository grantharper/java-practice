package com.example;

import static com.example.StaticAndInstance.I_AM_STATIC;

public class StaticImportExample {

    static{
        I_AM_STATIC = "Modifying this via a static import";
    }
    
}
