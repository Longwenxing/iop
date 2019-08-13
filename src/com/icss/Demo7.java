package com.icss;

public class Demo7 {

	public static void main(String[] args) {
		System.out.println(3+2);
		System.out.println(3-2);
		System.out.println(3*2);
		System.out.println(3/2);
		System.out.println(3%2);
		
		int value=12345;
		System.out.println("个位数是：" +value%10);
		System.out.println("十位数是："+value/10%10);
		System.out.println("百位数是："+value/100%10);
		System.out.println("千位数是："+value/1000%10);
		System.out.println("万位数是："+value/10000);
		

	}

}
