package com.icss;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�������һ��Ա���ı��  ��������  �ʽ�");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=b+c;
		System.out.println("�����ܺ�Ϊ��"+sum);
		System.out.println("������ڶ���Ա���ı��  ��������  �ʽ�");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int sum1=b1+c1;
		System.out.println("�����ܺ�Ϊ��"+sum1);
		System.out.println("�����������Ա���ı��  ��������  �ʽ�");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		int sum2=b2+c2;
		System.out.println("�����ܺ�Ϊ��"+sum2);
		System.out.println("����Ա���Ĺ����ܺ�"+(sum+sum1+sum2));
	}

}
