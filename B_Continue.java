package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {

	/*
	 * *continue 문
	 * 반복문 안에서 사용하는 구문
	 * continue; 를 만나게 되면 그 뒤에 어떤 구문이 있더라도 실행하지 않고
	 * 가장 가까운 반복문으로 올라간다. 
	 */
	
	public void method1() {
		
		//1부터 10까지의 숫자 중 홀수만을 출력
		// 1 3 5 7 9 
		
		//방법1. i 값을 매번 2 씩 증가시키면서 출력
		for(int i = 1; i <=10; i+=2) { //5회 반복
			System.out.print(i + " ");
		}
		System.out.println();
		//방법2. i 값을 매번 1씩 증가시키되 바로 출력하는것이 아니라
		//      조건검사를 통해서 홀수일 경우에만 출력하게한다.
		for(int i = 1; i<=10; i++) {  //10회 반복
			if ((i % 2)==1) { //i 가 홀수 일 경우 
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//방법3. 반복문 안에서 continue 를 이용한 방법
		for(int i=1; i<=10; i++) {
			
			if((i % 2)==0) {//i가 짝수 일경우
			     continue;  //뒷쪽에 있는 코드들은 건너뛰고 다음 등감식으로 넘어가겠다. 
			}
			System.out.print(i + " ");
		}
	}
	 public void method2() {
		 //1부터 100까지의 총 합계를 구함
		 //단, 6의 배수값은 빼고 계산
		 
		 int sum= 0;
		 
		 for(int i =1; i<=100; i++) {
			 //덧셈 이전에 6의 배수인지 먼저 체크하고 맞다면 건너뛰기
		 
			 if((i %6)==0) {
				 continue;
			 }   //else를 안해도 됨
			   sum += i;  //총합 구하는 식 sum = sum +i;
		 }
		 System.out.println("결과  : "+sum);  //sum : 4234
		 
		 /*
		  * 만약에 continue;  가 for문안에 있을 경우에는 증감식으로 이동
		  *                   while문 안에 있을 경우에는 조건식으로 이동 
		  */
	  }
	 public void method3() {
		// 2단~9단까지 출력하긴 하되
		// 단, 4의 배수단만 건너뛰고 출력하시오.
		 
		for(int j =2; j<=9; j++) { 
		 
//			//방법1. 4의 배수인지 체크하는 방법
//			if((j % 4)==0) { //4단 아웃
//			  continue;	
//			}
			//방법2. 4의 배수가 아닌지 체크하는 방법
			if((j % 4)!=0) {
			System.out.println("-----"+ j +"단-----");
			
		 for(int i=1; i<=9; i++) { //안쪽 2단
			 System.out.println(j+" * "+i+ " = " + (j*i));
		      }
			}
		  }
		}
		
	 //반복문 실습문제 12번 - 계산기 부분 + 연산자 입력시 "exit"일 경우 빠져나가기
	 public void method4() {
		 /*
		  * 정수 2개, 연산자를 입력받아서 계산
		  * 단, 나눗셈일경우 또는 모듈러 연산일 경우 0으로 나눌려고 할경우에는 다시 입력해주세요.
		  * 단, 없는 산술연산자 종류일 경우에는 없는 연산자입니다 출력
		  */
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String operator = sc.nextLine();  //exit 때문에 string 이어야 한다. 
			                                  //char문자로 받을려면 오류 나옴
			
			//여기에서 연산자를 체크하면 숫자를 입력받기 전에 미리 문구를 띄울 수 있음!
			if(operator.equals("exit"))  {
			System.out.println("프로그램을 종료 합니다.");
			break;
			}	
				
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();
            //어떤 종류의 연산을 할것인가를 우선 판별
            switch(operator){
            case "+" : System.out.println(num1+"+"+num2+ "="+(num1+num2));break;
            case "-" : System.out.println(num1+"-"+num2+ "="+(num1-num2));break;
            case "*" : System.out.println(num1+"*"+num2+ "="+(num1*num2));break;
            case "/" :
            	if(num2==0) {
            		System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
            		continue;  //위로 while로 올라감 
            	} 
            	System.out.println(num1+"/"+num2+ "="+(num1/num2));break;
            case "%" :
            	if(num2==0) {
            		System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
            		continue; //위로 while로 올라감
            	} 
            	System.out.println(num1+"%"+num2+ "="+(num1%num2));break;
            default : System.out.println("없는 연산자입니다.다시 입력해주세요. ");
            }
            
		}
		 
	} 
		 
		 
   }
		 
		 
		 
		 

	
	
	
	
	
	
	

