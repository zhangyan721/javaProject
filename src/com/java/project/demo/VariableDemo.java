package com.java.project.demo;

//变量

/**
 * 变量的注意事项：
 *  1、只能存一个值
 *  2、量名不允许重复定义
 *  3、一条语句可以定义多个变量
 *  4、变量在使用之前一定要进行赋值
 *  5、变量的作用域范围
 */

public class VariableDemo {

    //主入口
    public static  void main (String[] args){
         //变量的基本用法
        //定义变量,在进行输出
         variable1(args);

        //变量的其他用法:变量参与计算
        variable2(args);

        //变量的其他用法：修改变量记录的值
        variable3(args);

        //变量的其他用法：一条语句可以定义多个变量
        variable4(args);

        //变量的其他用法：变量在使用之前一定要进行赋值
        variable5(args);

        //变量的练习测试
        variableTest(args);

    }

    public static void variable1(String[] args){
        //定义变量
        //数据类型 变量名 = 数据值；
        //数据类型 限定了变量能存储的数据的类型
        // int (整数) double(小数)
        //变量名：就是存储空间的名字
        //作用：方便以后使用
        //数据值：真正存在变量中的数据
        //等号：赋值，把右边的数据赋值给左边的变量

        int a =10;
        System.out.println(a);
    }

    public static void variable2(String[] args){
        int a =10;
        int b = 20;
        System.out.println(a+b);
    }

    public static void variable3(String[] args){
        int a =10;
        a=30;
        System.out.println(a);
    }

    public static void variable4(String[] args){
        int a =10,d=30,e=40;
        System.out.println(a);
        System.out.println(d);
        System.out.println(e);
    }

    public static void variable5(String[] args){
        int a ;
        a=10;
        System.out.println(a);
    }

    public static void variableTest(String[] args){
        System.out.println("variableTest");
        //一开始没有乘客
        int count=0 ;
        System.out.println("开始："+count);
        //第一站：上来一位乘客
        count=count+1;
        System.out.println("第一站："+count);
        //第二站：上来两位乘客，下来一位乘客
        count=count+2-1;
        System.out.println("第二站："+count);
        //第三站：上来两位乘客，下来一位乘客
        count=count+2-1;
        System.out.println("第三站："+count);
        //第四站：下来一位乘客
        count=count-1;
        System.out.println("第四站："+count);
        //第五站：上来一位乘客
        count = count+1;
        //终点站：车上共有几位乘客？
        System.out.println("终点站："+count);
    }

}
