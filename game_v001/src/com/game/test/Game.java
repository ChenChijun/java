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
		System.out.println("����������������ͬ�Ҵ�СΪ2-9֮��ĸ���:");
		Integer num1 = in.nextInt();
		Integer num2 = in.nextInt();
		Integer num3 = in.nextInt();
		// �ж���������������Ƿ����Ҫ��
		while(num1 <= 1||num1 >= 10 || num2 <= 1 || num2 >= 10 || num3 <= 1
				|| num3 >= 10 || num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("���벻����Ҫ������������:");
			num1=in.nextInt();
			num2=in.nextInt();
			num3=in.nextInt();
			
		}
		System.out.println("�������������Ϊ:"+num1+"--"+num2+"--"+num3);
		for (int i = 1; i <=100; i++) {
			Integer a=i/10;//��ȡ��ÿ�����ݵ�ʮ��λ
			Integer b=i-a*10;//��ȡ��ÿ�����ĸ�λ��
			if(a==num1||b==num1){//���ж�
				System.out.println("Fizz");
			}else if(i%num1==0 && i%num2==0 && i%num3==0){
				System.out.println("FizzBuzzWhizz");
			}else if(i%num1==0 && i%num2==0){
				System.out.println("FizzBuzz");
			}else if(i%num2==0 && i%num3==0){
				System.out.println("BuzzWhizz");
			}else if(i%num1==0 && i%num3==0){
				System.out.println("FizzWhizz");
			}else if(i%num1==0){
				System.out.println("Fizz");
			}else if(i%num2==0){
				System.out.println("Buzz");
			}else if(i%num3==0){
				System.out.println("Whizz");
			}else{
				System.out.println(i);
			}
		}
		 
	}

}
