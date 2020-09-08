package org.example;

import com.example.grpc.Test;

public class ExampleClass {

    public static void main(String[] args){
        Test grpcTest = Test.newBuilder()
                .setStr("Hello, world!")
                .build();

        System.out.println(grpcTest);
    }

}
