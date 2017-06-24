package com.game.test;

import java.util.Scanner;
/*
 * @author ChenChiJun
 * 
 * 
 */
public class Game {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入三个互不相同且大小为2-9之间的个数:");
		Integer num1 = in.nextInt();
		Integer num2 = in.nextInt();
		Integer num3 = in.nextInt();
		// 判断输入的三个个数是否符合要求
		while(num1 <= 1||num1 >= 10 || num2 <= 1 || num2 >= 10 || num3 <= 1
				|| num3 >= 10 || num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("输入不符合要求，请重新输入:");
			num1=in.nextInt();
			num2=in.nextInt();
			num3=in.nextInt();
			
		}
		System.out.println("你输入的三个数为:"+num1+"--"+num2+"--"+num3);
		for (int i = 1; i <=100; i++) {
			Integer a=i/10;//获取到每个数据的十分位
			Integer b=i-a*10;//获取到每个数的个位数
			//采用逆向思维，先解决优先级最高的问题，再依次处理低优先级的问题，同级之间的优先级按自然顺序
			if(a==num1||b==num1){//先判断是否包含第一个特殊数字
				System.out.println("Fizz");
			}else if(i%num1==0 && i%num2==0 && i%num3==0){//判断当前数字能够同时满足这三个条件
				System.out.println("FizzBuzzWhizz");
			}else if(i%num1==0 && i%num2==0){//满足第二优先级
				System.out.println("FizzBuzz");
			}else if(i%num2==0 && i%num3==0){
				System.out.println("BuzzWhizz");
			}else if(i%num1==0 && i%num3==0){
				System.out.println("FizzWhizz");
			}else if(i%num1==0){//第三优先级
				System.out.println("Fizz");
			}else if(i%num2==0){
				System.out.println("Buzz");
			}else if(i%num3==0){
				System.out.println("Whizz");
			}else{//最低优先级，即题目的总体要求
				System.out.println(i);
			}
		}
		 
	}

}
