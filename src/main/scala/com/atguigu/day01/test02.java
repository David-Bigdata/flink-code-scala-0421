package com.atguigu.day01;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;

import java.util.Scanner;

/**
 * Author：xiaoxin
 * Date：2020/9/25
 * Desc：
 */
public class test02 {
    public static void main(String[] args) {
        System.out.println("描述岛上有牛第一年1只，幼牛3年成熟，一生一，请输入年份，求对应总数");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("输入错误请重新输入");
        } else if (x < 4) {
            System.out.println("第" + x + "年岛上的牛总数为" + 1 + "只");
            System.out.println("第" + x + "年岛上的成年牛数为" + 0 + "只");
        } else if (x < 7) {
            System.out.println("第" + x + "年岛上的牛总数为" + (x - 2) + "只");
            System.out.println("第" + x + "年岛上的成年牛数为" + 1 + "只");
        } else {
            int s = 4 + factorial(x-6);
            System.out.println("第" + x + "年岛上的牛总数为" + s + "只");
            System.out.println("第" + x + "年岛上的成年牛数为" + (x - 5) + "只");
        }


    }

    public static int factorial(int n)  {
        if(n == 1){
            return 1 ;
        }else {
            return n + factorial(n - 1);
        }
    }
}