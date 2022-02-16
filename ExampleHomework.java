package com.kh.practice.example;

import java.util.Scanner;

public class ExampleHomework {

	public void method1() {
		//사용자 입력받아서 그 문자열만큼 반복 index번째 하나씩 추출
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		//반복 for문, 문자열만큼 반복
		for(int i = 0 ; i < str.length() ; i++) { //.length 는 문자열 길이
			
			System.out.println(i +"번째 문자 :" + str.charAt(i) );
			
	    }
	}
	public void practice5() {
		//아이디,비번 정해두고 로그인 기능
		//성공시, 아이디가 틀렸을시, 비밀번호가 틀렸을시 -> 출력
		
		Scanner sc = new Scanner(System.in); //스캐너
		System.out.print("아이디: "); //입력유도
		String inputid = sc.nextLine();
		System.out.print("비밀번호: ");
		String inputpass = sc.nextLine();
		//아이디, 비번 정하기
		String id ="boram";
		String pass = "1234";
		//경우의 수: 성공시, 아이디가 틀렸을시, 비밀번호틀렸을시, 모두 틀렸을시 
		if(inputid.equals(id)&&inputpass.equals(pass)) {
			System.out.println("로그인 성공");
		}else if (inputpass.equals(pass)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(inputid.equals(id)){ 
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
		

	}
	public void practice12() {	
		//정수 2개와 연산자(문자열로 입력 받고 입력된 연산자)에 따라 결과 출력
		//단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어 올때까지 무한 반복
		
		//  * 안되는 경우 = 1. 연산자가 나누기&& 두번째 정수가 0인 경우 =>"0으로 나눌 수 없습니다. 다시 입력해주세요."
		//              2. 없는 연산자 => "없는 연산자입니다. 다시 입력해주세요."
		//       두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.    
			
		Scanner sc = new Scanner(System.in); //스캐너
		//반복 해야 함 (exit가 들어오면 출력하고 종료.)
		for(int i=0; i<1 ;i++)  {
			
		System.out.print("연산자(+, -, *, /, % ) : ");//입력유도
		String oper= sc.nextLine(); //변수 생성 
		//연산자 입력에 exit가 들어오면 종료되야 하니까 i--는 안함
		if(oper.equals("exit")){
			System.out.println("프로그램을 종료합니다.") ;	
		  break;	
		} else {
		
		System.out.print("정수1 : "); //정수 입력 유도
		int num1 = sc.nextInt(); //변수 생성
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
        sc.nextLine();
        
		//연산자 케이스
		switch(oper){	 
		case "+" :
		System.out.printf("%d + %d = %d",num1,num2,num1+num2  ) ;
		i--;
		break;		
		case "-":
		 System.out.printf("%d - %d = %d",num1,num2,num1-num2 ) ;
		 i--;
		 break;		 	
		case "*":
		System.out.printf("%d * %d = %d",num1,num2,num1*num2 ) ;
		i--;
		break;	
		case "/":
		 if(num2==0) { //안되는 경우1. 연산자가 나누기&& 두번째 정수가 0인 경우
	     System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
		 i--;
		 }else
		System.out.printf("%d / %d = %d",num1,num2,num1/num2 ) ;
		i--;
		 break; 	
		case "%":
		System.out.printf("%d / %d = %d",num1,num2,num1%num2 ) ;	
		i--;
		break;	 
		default : //안되는 경우2. 없는 연산자 
			System.out.println("없는 연산자입니다. 다시 입력해주세요. ") ;	
			i--;
		   }	
		System.out.println("") ;	
	  }	
		System.out.println("") ;	
	}
			
			
  }
		
		
}
	

