package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * *break문
	 * break문을 만나는 순간 "현재 내 위치로부터 가장 가까운 반복문 한 겹"을 
	 * 빠져나가게끔 해주는 구문
	 * 즉, 해당 그 break문이 속해있는 반복문 한 겹을 빠져나가겠다.
	 * 
	 * [ 표현법 ]
	 * break;
	 * 
	 * 주의할점: switch문에서의 break; 랑은 모양새는 같지만 다른 개념
	 *         switch문에서의 break; 는 단순히 해당 switch 영역을 빠져나가는 용도일뿐         
	 */
	  
	public void method1() {
		
		//매번 반복적으로 새로이 발생되는 랜덤값 출력 (1~100) 출력
		//단, 그 랜덤값이 홀수일 경우에는 반복문을 빠져나가게끔 => break;
		
		while(true) { //무한반복
			
			int random =(int)((Math.random()*100)+1); //int넣기전에는 실수형이라서 int넣어주는 것
			
			System.out.println("random: "+ random);
			
			//우선적으로 랜덤값을 출력하기 이전에 홀수인지 먼저 체크
			if((random % 2)==1) { //홀수라면
				
				//return;  //이 구문이 실행된 시점으로 본다면 이미 반복이 끝났을 것
				break;
				
				/*
				 * return; 과 break; 의 차이점
				 * 
				 * =>반복문 안에서 return; 을 만나는 순간
				 *    현재 내 메소드를 호출했었던 곳으로 돌아감
				 * => 반복문 안에서 break; 를 만나는 순간
				 *    현재 내가 있는 반복문을 빠져나가는 시점으로 나감
				 * 
				 * 
				 */
			}
			  System.out.println("random : "+ random );
			
		}
		//이 시점은 while 의 반복이 끝났을 시점
		System.out.println("끝났지롱" );
 	
		//만약에 return; 으로 반복을 빠져나가게 된다면
		//또는 반복문을 종료시키는 구문이 아예 존재하지 않는다면 
		//이 시점에서  Unreachable code 라는 오류 발생
		//=> Unreachable code : 도달할 수 없는 코드
		
	}
	 public void method2() {
		
	    	/*
	    	 * 아무 문자열이나 입력하세요 : ~~~
	    	 */
	    	//문자열을 무한적으로 반복 하면서 매번 입력 받기
		    //그 문자열의 길이를 출력하고, 
	    	//만약 입력 받은 문자열이 "exit"라는 문자열이라면 종료
		 
		 //break문을 이용한 버전
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 
			 System.out.print("문자열 입력 : ");
			 String str= sc.nextLine();
			
			 if(str.equals("exit")) {
				 //return;
				 break;
			 }
			 else { //문자열이 "exit" 가 아닌경우
				 
				 //그 문자열의 길이를 구해서 출력
				 //자바에서 제공하는 문자열의 길이를 알려주는 메소드
				 // 문자열.length(); 
				 System.out.println(str+ " 의 길이 : "+ str.length());
				 
			 }
		  } //break는 여기로 빠져나옴
		   System.out.println("프로그램이 종료됩니다.");

	 }
	    public void method3() {
	    	// 매번 반복적으로 사용자에게 양수를 입력받아 1~사용자가 입력한 양수 까지 출력
	    	//=> 무한반복임 
	    	//단 , 정상적으로 양수를 입력했을 경우 잘 출력후 무한반복을 빠져나올것
	    	//아닐경우, 다시입력하라고 출력할것
	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	while(true) {  //무한반복
	    		System.out.print("양수 입력 : ");
	    		int num = sc.nextInt();
	    		 
	    		//우선적으로 양수인지 체크
	    	  if( num> 0 ) {  //잘 입력했을 경우=> 1~사용자가 입력한수까지 출력
	    		  for(int i =1 ; i<=num ;i++) { //for가 반복문이라서 사용함
	    			  System.out.print(i + " ");
	    			 
	    		  }  // 이 시점에서 브레이크를 걸어야 출력이 끝난 후 빠져나옴
	    		   break;  //현재 이 break; 가 포함된 while(true)로부터 빠져나옴
	    		  
	    	    }else { //양수가 아닌경우
	    		  System.out.println("양수가 아닙니다. 다시 입력해주세요.");
	    	  }
	    		  
	    	}
	    	
	    	
	    	
	    	
	    }
	 
	 
	 
	
	
}
