package edu.isu.cs.cs2263.hw02;

public class App {


    public static void main(String[] args){
        String s = "This is a very long test string with different words";
        PushbackTokenizerImpl pushbackToken = new PushbackTokenizerImpl(s);

        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        pushbackToken.pushback();
        pushbackToken.pushback();
        pushbackToken.pushback();
        pushbackToken.pushback();
        pushbackToken.pushback();
        pushbackToken.pushback();
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
        System.out.println(pushbackToken.nextToken());
    }

}
