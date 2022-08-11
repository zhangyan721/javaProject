package com.java.project.demo;

public class ValueDemo {

    //主入口
    public static  void main(String[] args) {
        System.out.println("helloword");
        ValueDemo valueDemo = new ValueDemo();
        valueDemo.valueDemo(args);
        valueDemo.valueDemo1(args);
    }

    public  void   valueDemo(String[] args) {
        //整数
        System.out.println(666);

        //小数、
        System.out.println(4.17);
        System.out.println(-4.17);

        //字符串
        System.out.println("张三这种");

        //字符串
        System.out.println('男');
        System.out.println('女');

        //boolean类型
        System.out.println(true);
        System.out.println(false);

        //空类型:null 不能直接打印
        System.out.println("null");

        //换行
        System.out.println("\n");
    }

    //制表符的基本用法
    public  void valueDemo1(String[] args) {

        System.out.println("name:"+"\t"+"张三");
        System.out.println("age:"+"\t"+"13");

    }



}
