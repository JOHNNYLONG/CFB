/*
 * Ҫ��
 * ��ӡ��99�˷���
 *
 * ���꣺
 * �û�����һ�����֣���ӡ����Ӧ���ֵ������˷���
 *
 * 1*1=1
 * 1*2=2 2*2=4
 * 1*3=3 2*3=6 3*3=9
 * 1*4=4 2*4=8 3*4=12 4*4=16
 * 1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
 * ..................................
 *
 * ������
 * �������������������ǿ���ÿһ�д�ӡ���ĸ���
 * ������������
 * ÿһ������ĸ����������ڵ�����
 * forѭ����������
 * ��Ƕһ��forѭ����������
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
		System.out.println("������һ�������ó˷���(>0)��");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");// \t���Ʊ��
			}
			System.out.println();// ÿһ�н�������
		}
	}
}
