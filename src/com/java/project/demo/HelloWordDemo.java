package com.java.project.demo;

/**
 * @author HP
 */
public class HelloWordDemo {
    //单行注释;第一个java文件
    /*多行注释

    关键字：被java赋予了特定涵义的英文单词；

    关键字的特点：
        1、关键字的字母全部小写；
        2、常用的编辑器对关键字有特殊的颜色标记
     class关键字的作用：
        定义一个类，后面跟随类名
     */


    public static  void main(String[] args) {
        System.out.println("helloword");
        ValueDemo valueDemo = new ValueDemo();
        valueDemo.valueDemo(args);
        valueDemo.valueDemo1(args);
    }
}
