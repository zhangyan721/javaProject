package com.java.project.demo;

//数据类型

/**
 * 8种常见数据类型：
 *  数据类型  关键字        取值范围                                                    占用内存
 * 整数：
 *             byte:     -128~127                                                     1
 *             short:    -32768~32767                                                 2
 *             int(默认):-2147483684~2147483647(10位数)                                4
 *             long:     -9223372036854775808~9223372036854775807(19位)                8
 *
 * 浮点数：
 *              float:    -3.401298e-38 到 3.402823e+38                                4
 *              double(默认):-4.9000000e-324 到 1.797693e+308                             8
 *
 * 字符：
 *              char:      0~65535                                                     2
 *
 * 布尔：
 *              boolean:   true，false                                                  1
 *
 *
 */

public class VariableDemo2 {

    //主入口
    public static  void main (String[] args){
        //常见数据类型
        VariableTest1(args);
        VariableTest2(args);

        //标识符
        VariableTest3(args);
    }


    public  static void VariableTest1(String[] args){
        //byte
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long 类型的变量在数据值的后面需要加一个L作为后缀
        //L可以是大写，也可以是小写；建议：使用大写。
        long n = 9999999999L;
        System.out.println(n);

        //float
        //注意点：定义float类型的变量的时候数据值也需要加一个F作为后缀
        float f =10.1F;
        System.out.println(f);
        // double
        double d=20.2;
        System.out.println(d);
        // char
        char c = '张';
        System.out.println(c);
        //boolean
        //true false
        boolean bl = true;
        System.out.println(bl);

        /**
         * 小结：
         * java 中的数据类型分为：基本数据类型，引用数据类型
         * 基本数据类型分为4类8种
         *
         * byte的取值范围：-128~127
         * 整数和小数取值范围的大小关系：
         *      double>float>long>int>short>byte
         *
         * long类型变量：需要加入L标识（大小写都可以）
         * float类型变量：需要加入F标识（大小写都可以）
         */
    }

    public  static void VariableTest2(String[] args){
        //姓名
        String name="黑马谢广坤";
        //年龄
        int age = 18;
        //性别
        char gender = '男';
        //身高
        double height = 180.1;
        //是否单身
        boolean isDs = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(isDs);

    }

    public  static void VariableTest3(String[] args){
        /**
         * 标识符命名规则：
         *      1、由数字、字母、下划线（_）和美元符（$）组成
         *      2、不能已数字开头
         *      3、不能是关键字
         *      4、区分大小写
         */
    }




}
