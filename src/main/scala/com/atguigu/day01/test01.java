package com.atguigu.day01;

import java.util.Scanner;

/**
 * Author：xiaoxin
 * Date：2020/9/25
 * Desc：
 */
public class test01 {
    public static void main(String[] args) {
        double y ;
        System.out.println("描述岛上有牛第一年1只，第二年2只，一生一，请输入年份，求对应总数");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int x = sc.nextInt();
        for (int i = 0; i < x ; i++) {
            y=Math.pow(2,i);
            int m = (int)y;
            System.out.println("第"+ (i+1) +"年岛上的总数为" + m + "只");
        }
    }
}
