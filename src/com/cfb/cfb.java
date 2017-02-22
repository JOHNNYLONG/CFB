/*
 * 要求：
 * 打印出99乘法表
 *
 * 引申：
 * 用户输入一个数字，打印出对应数字的完整乘法表
 *
 * 1*1=1
 * 1*2=2 2*2=4
 * 1*3=3 2*3=6 3*3=9
 * 1*4=4 2*4=8 3*4=12 4*4=16
 * 1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
 * ..................................
 *
 * 分析：
 * 被乘数控制列数，就是控制每一行打印出的个数
 * 乘数控制行数
 * 每一行输出的个数就是所在的行数
 * for循环控制行数
 * 内嵌一个for循环控制列数
 *
 * */
package com.cfb;

import java.util.Scanner;

public class cfb {
	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("请输入一个整数得乘法表(>0)：");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");// \t是制表符
			}
			System.out.println();// 每一行结束换行
		}
	}
}
