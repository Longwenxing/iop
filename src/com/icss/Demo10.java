package com.icss;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个员工的编号  基本工资  资金");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=b+c;
		System.out.println("工资总和为："+sum);
		System.out.println("请输入第二个员工的编号  基本工资  资金");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int sum1=b1+c1;
		System.out.println("工资总和为："+sum1);
		System.out.println("请输入第三个员工的编号  基本工资  资金");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		int sum2=b2+c2;
		System.out.println("工资总和为："+sum2);
		System.out.println("所有员工的工资总和"+(sum+sum1+sum2));
	}

}
