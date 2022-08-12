package com.java.project.demo;


//导包
import java.util.Scanner;

/**
 * @author HP
 * 键盘录入Demo
 */
public class ScannerDemo {

    //主入口
    public static  void main (String[] args){

        scannerTest(args);
    }

    private static void scannerTest(String[] args) {
        System.out.println("--进入scanner程序--开始--");
        //创建对象，
        Scanner sc = new Scanner(System.in);

        //接收数据
        int i=sc.nextInt();
        System.out.println(i);
        System.out.println("--退出scanner程序--结束--");

    }


}
