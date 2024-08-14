package com.codermadhav.lambdas;

@FunctionalInterface
interface MyLambda {
    //    void doPrint();
    int sum(int a, int b);
}

public class LambdaTest {
    public static void main(String[] args) {
//        MyLambda lambda = () -> System.out.println("Print Something......");
//        lambda.doPrint();

        MyLambda lambda = (a, b) -> a + b;
        System.out.println("SUM: "+lambda.sum(10, 20));
    }
}
