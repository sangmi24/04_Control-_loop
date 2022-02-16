package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {

	/*
	 * *continue ��
	 * �ݺ��� �ȿ��� ����ϴ� ����
	 * continue; �� ������ �Ǹ� �� �ڿ� � ������ �ִ��� �������� �ʰ�
	 * ���� ����� �ݺ������� �ö󰣴�. 
	 */
	
	public void method1() {
		
		//1���� 10������ ���� �� Ȧ������ ���
		// 1 3 5 7 9 
		
		//���1. i ���� �Ź� 2 �� ������Ű�鼭 ���
		for(int i = 1; i <=10; i+=2) { //5ȸ �ݺ�
			System.out.print(i + " ");
		}
		System.out.println();
		//���2. i ���� �Ź� 1�� ������Ű�� �ٷ� ����ϴ°��� �ƴ϶�
		//      ���ǰ˻縦 ���ؼ� Ȧ���� ��쿡�� ����ϰ��Ѵ�.
		for(int i = 1; i<=10; i++) {  //10ȸ �ݺ�
			if ((i % 2)==1) { //i �� Ȧ�� �� ��� 
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//���3. �ݺ��� �ȿ��� continue �� �̿��� ���
		for(int i=1; i<=10; i++) {
			
			if((i % 2)==0) {//i�� ¦�� �ϰ��
			     continue;  //���ʿ� �ִ� �ڵ���� �ǳʶٰ� ���� ������� �Ѿ�ڴ�. 
			}
			System.out.print(i + " ");
		}
	}
	 public void method2() {
		 //1���� 100������ �� �հ踦 ����
		 //��, 6�� ������� ���� ���
		 
		 int sum= 0;
		 
		 for(int i =1; i<=100; i++) {
			 //���� ������ 6�� ������� ���� üũ�ϰ� �´ٸ� �ǳʶٱ�
		 
			 if((i %6)==0) {
				 continue;
			 }   //else�� ���ص� ��
			   sum += i;  //���� ���ϴ� �� sum = sum +i;
		 }
		 System.out.println("���  : "+sum);  //sum : 4234
		 
		 /*
		  * ���࿡ continue;  �� for���ȿ� ���� ��쿡�� ���������� �̵�
		  *                   while�� �ȿ� ���� ��쿡�� ���ǽ����� �̵� 
		  */
	  }
	 public void method3() {
		// 2��~9�ܱ��� ����ϱ� �ϵ�
		// ��, 4�� ����ܸ� �ǳʶٰ� ����Ͻÿ�.
		 
		for(int j =2; j<=9; j++) { 
		 
//			//���1. 4�� ������� üũ�ϴ� ���
//			if((j % 4)==0) { //4�� �ƿ�
//			  continue;	
//			}
			//���2. 4�� ����� �ƴ��� üũ�ϴ� ���
			if((j % 4)!=0) {
			System.out.println("-----"+ j +"��-----");
			
		 for(int i=1; i<=9; i++) { //���� 2��
			 System.out.println(j+" * "+i+ " = " + (j*i));
		      }
			}
		  }
		}
		
	 //�ݺ��� �ǽ����� 12�� - ���� �κ� + ������ �Է½� "exit"�� ��� ����������
	 public void method4() {
		 /*
		  * ���� 2��, �����ڸ� �Է¹޾Ƽ� ���
		  * ��, �������ϰ�� �Ǵ� ��ⷯ ������ ��� 0���� �������� �Ұ�쿡�� �ٽ� �Է����ּ���.
		  * ��, ���� ��������� ������ ��쿡�� ���� �������Դϴ� ���
		  */
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("������(+, -, *, /, %) : ");
			String operator = sc.nextLine();  //exit ������ string �̾�� �Ѵ�. 
			                                  //char���ڷ� �������� ���� ����
			
			//���⿡�� �����ڸ� üũ�ϸ� ���ڸ� �Է¹ޱ� ���� �̸� ������ ��� �� ����!
			if(operator.equals("exit"))  {
			System.out.println("���α׷��� ���� �մϴ�.");
			break;
			}	
				
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();
            //� ������ ������ �Ұ��ΰ��� �켱 �Ǻ�
            switch(operator){
            case "+" : System.out.println(num1+"+"+num2+ "="+(num1+num2));break;
            case "-" : System.out.println(num1+"-"+num2+ "="+(num1-num2));break;
            case "*" : System.out.println(num1+"*"+num2+ "="+(num1*num2));break;
            case "/" :
            	if(num2==0) {
            		System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
            		continue;  //���� while�� �ö� 
            	} 
            	System.out.println(num1+"/"+num2+ "="+(num1/num2));break;
            case "%" :
            	if(num2==0) {
            		System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
            		continue; //���� while�� �ö�
            	} 
            	System.out.println(num1+"%"+num2+ "="+(num1%num2));break;
            default : System.out.println("���� �������Դϴ�.�ٽ� �Է����ּ���. ");
            }
            
		}
		 
	} 
		 
		 
   }
		 
		 
		 
		 

	
	
	
	
	
	
	

