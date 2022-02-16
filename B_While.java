package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *while문
	 * 반복문의 일종으로 조건식의 결과가 true일 경우에만 반복을 진행하는 구조로 이루어져 있다.
	 * 
	 * [표현법]
	 * 
	 * 초기식;  // 순서1.  반복에 필요한 변수를 선언 및 초기화  (필수는 아님)
	 * 
	 * while(조건식)  {   //순서2. 조건검사 후 true라면 실행
	 * 
	 *       반복적으로 실행할 내용물;  // 순서3. 실행
	 * 
	 *       증감식;   //순서4. 증감연산  (필수는 아님)
	 *  }
	 *  => 조건식의 결과가 true 일 경우 해당 구문을 실행하고
	 *  => 다시 돌아와서 조건식의 결과가 true일 경우 해당 구문을 실행하고
	 *  ....
	 *  => 다시 돌아와서 조건식의 결과가 false라면 반복을 빠져나갈것!
	 *  (조건식에 true를 넣으면 무한반복 가능!) 
	 */
	  public void method1() {
		  
//		  for(int i = 0; i<5; i++) {
//			  System.out.println("안녕하세요");
//		  }// 안녕하세요 5번 찍힘
		  
		  //while문 버전으로 바꿔보자 
		    int i=0;   //for문의 초기식 부분
		    
		  while( i < 5 ) {  //for 문의 조건식 부분

             System.out.println("안녕하세요");
             
			  i++;  //for문의 증감식 부분
			  
		  }
		  
		  // 이 시점 기준으로 i의 값은? i = 5
		  System.out.println("i : "+ i);
		  
		  while(i >= 1 ) {
			  
			  System.out.println("i : "+ --i); 
			  //i--; 
			  
			  /*
			   * System.out.println 구문 안에다가 i--로 작성했을 경우에는
			   * 5 4 3 2 1 
			   * 
			   * System.out.println 구문 안에다가 --i 로 작성했을 경우에느
			   * 4 3 2 1 0
			   * 
			   * 으로 i 값이 변화한다. 
			   */
		  } 
		  //이 시점 기준으로 i의 값은 ? i=0
		  System.out.println("i : "+ i);

	  }
	    public void method2() {
	    	
	    	//1에서부터 10까지의 총 합계
	    	
	    	 int sum = 0; //0으로 초기화해야지 정확하게 나옴
	    	 
//	    	 for(int i =1 ; i <=10 ; i++) {
//	    		 
//	    		 sum += i ; // sum=sum+i;
//	    		 
//	    	 }
	    	 
	    	 //while문을 이용한 버전
	    	 
	    	 int i =1;  //초기식
	    	 
	    	 while(i <= 10) {   		 
	    		 sum += i ;  //	sum=sum+i;	 
	    		 i++;    	
	    	 }
	    	 System.out.println("sum : "+sum);  //55
	       }
	  
	  public void method3() {
		  
		  //1부터 랜덤값(1~100)까지의 총 합계  => 100개 임
		  
		  int random = (int)((Math.random()*100) + 1);   //100은 총갯수, 1은 시작수 
		  
		  System.out.println("random: "+random);
		  
		  int sum = 0; //대입! 필수임
		  
//		  for(int i =1 ; i<=random; i++) {
//			  
//			  sum += i;  //sum = sum+i;
//		  }
		  
		  int i = 1;   //초기식
		  
		  while(i <= random) {  //조건식
			  
			  sum += i ;  //실행할 구문
			  i++;       //증감식
			  
		  }	  
		  System.out.println("sum: "+sum);

	  }
	  
	  public void method4() {
		/*
	     * 아무 문자열이나 입력하세요 : ~~~
	     */
		 //문자열을 무한적으로 반복 하면서 매번 입력 받기
	     //만약 입력 받은 문자열이 "exit"라는 문자열이라면 종료
		  
		  Scanner sc = new Scanner(System.in);
		 
		  while(true) {  //for(;;) {  //무한반복임
			  
			  System.out.print("아무 문자열이나 입력하세요 : ");
			  String str = sc.nextLine();
			  
			  //입력 받은 "exit"와 일치하는지 체크 
			  if(str.equals("exit")) {
				  return;  //return을 만나면 종료함
			  }
		  }
	  }
	  
	  /*
	   * *do-while문
	   * 
	   * [ 표현법 ]
	   *  do {
	   *       실행할 코드;
	   *  } while(조건식);  
	   * 
	   * => 조건식의 결과가 true 일 경우 실행할 코드를 다시 실행
	   * => 조건식의 결과가 false 일 경우 반복문을 빠져나온다.
	   * 
	   * while문과 do-while문의 차이점은
	   * while문은 처음 수행할때 조건검사를 먼저 하고 true 여야지만 실행을 한다면
	   * do-while문은 일단 한번 실행을 하고나서 조건검사의 결과가 true이면 다시 돌아가서  실행
	   * 
	   * 즉, 조건이 맞지 않더라도 최소 1번은 실행이 되겠다. (조건식에서 false넣어도 1번 실행)
	   */
	  public void method5() {
		  
		  int i = 1;  //i가 0이면 무한반복임
		  
		  while (i==0) {   //false이기 때문에 호출 안됨  
			  
		      System.out.println("하이");
		  }
		  //조건이 애초에 false이기 때문에 아무것도 출력이 되지 않음
		  
		  
		  do {		  
			  System.out.println("하이");
		  } while(i==0); //false
		  //조건이 애초에 false이더라도 적어도 한번은 수행이 된다. 

	  }
	    
	  public void method6() {
		  
		  //1 2 3 4 5 
		  
		  //1. for 문 버전
		  for(int i=1; i<=5; i++) {
			  System.out.print(i+ " ");
		  }
		  System.out.println();
		  
		  //2. while문 버전
		  int i=1;
		  while(i<=5) {
			  System.out.print(i+ " ");
			  i++;
		  }
		  System.out.println();
		  
		  //3. do-while문 버전
		 int j = 1; 
		 do {
			System.out.print(j + " "); 
			j++;
		 } while (j <= 5);
		  
	  }
	  
	  
	  
	  
	  
	  

	
	
}
