package com.java.project.demo;


//1、导包
import java.util.Scanner;

/**
 * @author HP
 * 键盘录入Demo
 */
public class ScannerDemo {

    //主入口
    public static  void main (String[] args){
        //键盘录入测试一
        scannerTest(args);
        //键盘录入测试二
        scannerTest1(args);
    }

    private static void scannerTest1(String[] args) {
        System.out.println("--进入scanner程序--开始--");
        //2、创建对象，
        Scanner sc = new Scanner(System.in);

        //3、接收第一个数据
        System.out.println("--请输入第一个数--");
        int num1=sc.nextInt();
        //3、接收第二个数据
        System.out.println("--请输入第二个数--");
        int num2=sc.nextInt();
        System.out.println("计算的结果是:"+num1+num2);
        System.out.println("--退出scanner程序--结束--");
    }

    private static void scannerTest(String[] args) {
        System.out.println("--进入scanner程序--开始--");
        //2、创建对象，
        Scanner sc = new Scanner(System.in);

        //3、接收数据
        int i=sc.nextInt();
        System.out.println(i);
        System.out.println("--退出scanner程序--结束--");

    }


}
