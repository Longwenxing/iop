package com.icss;

//删除的快捷键：ctrl+d
//向上、下移动：alt+上、下
public class Demo3 {

	public static void main(String[] args) {
//		//数据类型 变量；
//		int a;//a这个变量中只能存放整数
//		a=10;
//		//数据类型变量=值；
//		int b =10;//b这个变量存放的是整数 10
//		
//		//一次声明多个变量
//		int c,d,e;
//		c=10;
		//注意：不允许这样写d=10,e=10
		//数据类型变量1=值，变量2=值...;
		int f=9,g=8;//一次声明多个变量，同时初始化。
		int a =10;
		int b =a;
		System.out.print("a:"+a);
		System.out.print("b:"+b);
		int c =5;System.out.print("c:"+c);//5
		c=a+10;//覆盖
		System.out.print("a:"+a);
		System.out.print("c:"+c);
		

	}

}
