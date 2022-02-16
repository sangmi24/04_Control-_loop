package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * * for문
	 * 반복적으로 코드를 실행시켜주는 역할
	 * 단, 내가 반복할 횟수를 알고 있을 때 사용한다.
	 * 괄호 안에 반복을 지정하는 부분이 초기식, 조건식, 증감식으로 이루어져있음
	 * 
	 * [ 표현법 ]
	 * for (초기식; 조건식 ; 증감식) {
	 *     반복적으로 실행할 코드 ;
	 *  }
	 * 
	 * => 소괄호 ( )안에는 몇번 반복을 돌릴껀지 지정 
	 * => 중괄호 { }안에는 반복으로 뭘 돌릴껀지 지정 
	 * 
	 * - 초기식 : 반복문이 실행될 때 "초기에 단 한번만 실행되는 구문"
	 *          (반복문 안에서 사용할 변수를 선언 및 초기화 )
	 * - 조건식 : 반복문이 실행될 때 "해당 반복이 수행될 조건을 지정하는 구문 "
	 *          (초기식에서 지정한 변수를 가지고 주로 조건을 지정) 
	 *          => 조건식의 결과가 true : 반복 실행
	 *          => 조건식의 결과가 false : 반복을 종료 후 반복문을 빠져나옴
	 * - 증감식 : 반복문을 제어하는 변수값을 "증감시키는 구문"
	 *          (보통 초기식에서 지정한 변수를 가지고 증감식을 작성)  
	 * 
	 * for 문을 만나는 순간
	 * 초기식 -> 조건식 (조건 검사) -> true 일 경우 중괄호 안을 실행 -> 증감식
	 *      -> 조건식(조건 검사) ->  true 일 경우 중괄호 안을 실행 -> 증감식
	 *      -> 조건식 (조건검사) ->  true ....             -> 증감식
	 *      -> 조건식 (조건검사) -> false 일 경우 중괄호 안을 실행x , for 문 밖을 빠져나감
	 *      
	 * => 매번 조건식의 조건검사를 통해서 조건이 true 일경우에만 반복시키겠다.        
	 */
	public void method1 () {
		
		//"안녕하세요."라는 문구를 5번 연속해서 출력하고 싶다.
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		//for문을 이용한 버전
		//초기식 int 변수명(아무이름가능 ) = 값//변수생성 대입함 ; i는 (index) j 나 k
		//i 라는 변수에 담긴 값이 1에서부터 1씩 증가시키면서
		//5보다 작거나 같을 경우까지만 반복을 돌리겠다. 
		//i => 1,2,3,4,5  /6일 경우부터는 빠져 나감 
		
		for( int i = 1 ; i <=5  ; i++) {
		   System.out.println("안녕하세요.");
		}
		
		//for문을 이용하는 이유 : 반복적인 구문을 작성 할때 실수를 줄이기 위해서 
		//                  반복이 많이 늘어나면 번거로우니까
        
		
		//똑같이 5번 또 반복 (초기식, 조건식, 증감식을 다른 방법으로 표기)
		//i => 1,2,3,4,5 /  6(out)
		for( int i = 1 ; i<6  ; i++) {
			System.out.println("반갑습니다. ");
		}
		//반복 횟수는 같아도 초기식, 조건식, 증감식이 충분히 다를 수 있다. 
		
		//참고할 사항
		//1. 초기식에서 대입한 값이 (반복의 시작값) 1일 필요가 없음!
		// i 값이 11에서부터 16보다 작을 때까지 1씩 증가할동안 반복을 진행
		for (int i =11 ; i < 16 ; i++) { //i = 11,12,13,14,15 /16(out)
			System.out.println("어서오세요.");
		}
		
	   //2. 증감식에서 값의 증가값이 굳이 1일 필요가 없음! (== 증가 연산자을 쓸 필요도 없다)
	   // i 값이 1에서부터 10까지 매번 2씩 증가할 동안 반복 => 5번 반복
	   // i => 1, 3, 5, 7, 9 //11 (out)
		for (int i = 1 ; i<=10 ; i+=2) { 
			System.out.println("저리가세요.");
		}
	  //3. 증감식에서 감소도 가능하다. 
	  // i값이 10에서부터 6보다 크거나 같을때까지 매번 1씩 감소시키면서 반복
	  // i = 10,9,8,7,6 //5(out)
		for(int i =10; i>=6; i-=1) {
			System.out.println("하이.");
		}
		
	}
	 
	public void method2() {
		
		//제일 단순하게 반복되는 횟수를 지정하는 표현법
		//초기식 ; 조건식; 증감식
		//int i = 0 ; i < 반복시키고자하는 횟수 ; i++
		
		//예시 
		// int i =0; i<5 ; i++  => 0,1,2,3,4   (5회 )
		// int i =0; i<7 ; i++  => 0,1,2,3,4,5,6 (7회)
		
		for (int i=0; i <10 ;i++) {
			
			//System.out.println("고정된 문자열");
			// 고정적인 문자열 말고 매번 달라지는 출력 결과를 보고 싶다!
			//i : x
			//i : x
			//i : x
			//...
			//System.out.println("i : "+ i);
			
			//x번째 출력문
			//x번째 출력문
			
			//만약에 1번째 출력문 부터 보여지게 하고 싶다면 ?
			//해결방법1 ) 변수를 하나 만들어서 가공
			//int count = i +1 ;
			//System.out.println(count +"번째 출력문");
			
			//해결방법2) 현재 i에 1을 더한값을 곧바로 출력
			System.out.println((i+1) + "번째 출력문");

		}//=> 10번 반복될 것이다!
		
		//컴퓨터는 0부터 숫자를 세기 때문에 (index)시작점을 어느정도 맞춰줘야 한다.
		
	}
	public void method3() {
		//1 2 3 4 5 6 7 8 9 10이렇게 출력해보고 싶다.
		for (int i =0; i <10 ; i++) {
			
			//줄바꿈이 없는 출력문이 print을 활용할 수 있음
			//System.out.print( (i+1)+" "  );  //" "으로서 한칸씩 띄울수 있음
            System.out.printf("%d ", (i+1)); //한칸 띄울려면 ""에서 한칸 띔
		}
	}
	
	
	public void method4() {
		//1에서부터 10까지 모든 수를 더하는 거
		//누적 합 구하기
		
		//필수 => 변수 (한바퀴 돌때마다 변수에 누적해서 기록)
		int sum =0; //0으로 초기화 하는 이유: 누적시 정확한 값을 얻기 위해서 
		            //변수 선언 
		
		for (int i=1; i<=10; i++) {
		   sum = sum + i; //  sum += i;
		   
		   // 1+ 2+ 3+ 4+...+ 10 = 55 형태로 출력하고 싶다
		   
		   // 1+ 2+ 3+ 4+...+ 10 +
		   //System.out.print(i +" + ");
		   
		   System.out.print(i); 
		   
		   // i가 마지막 숫자가 되기 전까지는 " + "를 연이어서 출력
		   // i가 마지막 숫자가 되는 순간 " = "을 출력
		   //=> 선택적으로 결정(조건문)
		   
		   //마지막 숫자 : 10
		   if (i==10) {  //마지막 숫자와 일치한다면
             System.out.print(" = ");			   
		   }
		   else {
		   System.out.print(" + ");
		   }
		   
		}
		//이 시점에서
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 
		//이 구문이 완성됨 => 단, 줄바꿈된 상태는 아님
		
		System.out.println(sum); // 줄바꿈 됨
		
		System.out.println("sum : "+ sum ); //55
		
		//반복문 안에 충분히 조건문도 사용 가능하다!
	}
	public void method5() {
		
		//사용자로부터 양수 한개를 입력받아서
		//1부터 그 숫자까지 누적합을 구하고 싶다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		
		//0, -1 => 양수가 아님
		//우선적으로 양수인지 아닌지 먼저 판별
		if(num>0) { //양수일 경우
			//본격적으로 누적합 구하기
		int sum = 0; //누적합을 담을 변수 초기화
		 
		//i 값이 1에서 부터 x보다 작거나 같을때까지 1씩 증가시키면서 반복
		 for(int i=1 ; i <= num ;i++) {
			 
			 sum += i ;//sum = sum +i ;
			 
		 }
			System.out.println("총 합계 : "+sum);
			
		}
		else {//양수가 아닐경우
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	public void method6() {
		
		//1에서부터 매번 달라지는 랜덤값(1~10사이의 랜덤한 정수) 까지의 총 합계를 구해보고 싶다.
		// 난수 : 매번 임의로 발생되는 랜덤값
		
		/*
		 * *Math 클래스
		 * 수학 계산과 관련된 모든 상수, 메소드를 포함하고 있는 클래스
		 * 자바에서 이미 제공을 하고 있음
		 * 
		 * *Math 클래스의 특징
		 * 모든 변수랑 모든 메소드 앞에 static 이 붙어있음
		 * => 메소드 호출할 때 new를 이용해서 대변할 이름을 만들 필요 없이
		 *    바로 클래스명.메소드명() 호출하면 됨!
		 *    
		 * *Math 클래스 안에 정의되어 있는 random()메소드
		 * 매번 다른 랜덤값을 리턴해준다.(돌려준다.)
		 *  0.0 ~ 0.999999999.... 사이의 랜덤값 발생
		 *  0.0 <= 랜덤값 < 1.0
		 *  
		 *  [표현법]
		 *  Math.random();
		 *  
		 */
		
		//1. random 으로 난수 발생
		//2. 발생된 난수의 범위를 조정 (1~10) 사이로
		int random =(int)((Math.random() *10) + 1);
		//0.0 ~ 0.99999 => 10을 각각 곱합
		//0.0 ~ 9.99999 => 1을 각각 더함
		//1.0 ~ 10.9999 => 강제형변환 
		// 1  ~  10 
		
		//공식화 (외워야 함)
		//( Math.random() *몇개의 랜덤값 ) + 시작수 
		//예시) 만약 11~20 사이의 숫자중 랜덤값을 뽑고 싶다
		//( Math.random() *10 )+ 11
		
		System.out.println(random);
		
		//3. for 문
		int sum = 0; 
		for(int i =1 ; i <=random ; i++) {
			 sum += i;
		 }
		//4. 출력
		System.out.printf("1 부터 %d까지 총 합은 %d입니다.", random, sum);
	
	}
	/*
	 * 시험준비!
	 * 개념(서술형)=> 1. 프로그래밍 개요 pdf(자바특징5가지, 인식성 ) 컴파일과정 jvm  30분
	 *             2. 변수 , 연산자, 제어문 (필기)   
	 * 코딩 (코드 올리기)=> 이컬스 랜덤 차앳..코드 어떤 역할   30분
	 *                 여태 수업시간에 작성한  코드 (메소드들, 연산자들, 변수들, 조건문, 반복문)
	 *       
	 * 커트라인
	 * 과목당 40점 밑으로 넘어오면 과락
	 * 두 과목 평균 60점 이상 만 넘으면 합격                  
	 *                   
	 */
	
	  
	public void method7() {
		
		// 1에서 부터 10까지의 정수 중에서 홀수만 출력하겠다.
		
		// 1 3 5 7 9
		//for문 한개로 끝낸 버전=> 반복 5번
		//=> 이게 더 효율적임
		for (int i=1 ; i<10; i+=2) {
			
			System.out.print(i +" ");
		}
		System.out.println("");
		
		
		//for문 안에 if문을 포함시킨 버전=> 10번 
		for(int i=1; i<=10 ; i++) {
			//현재 i가 홀수인지 체크
			if ((i%2)==1) {
				System.out.print(i +" ");
			}	
			
		}

		
	}
	   public void method8() {
		//구구단 2단
		 /*
		  *  2*1= 2
		  *  2*2= 4
		  *  2*3= 6
		  *  ....
		  *  2*9= 18
		  *  2만 동일 뒤에만 달라짐 
		  */
		   System.out.println("-----2단-----");
		   
		   for (int i=1 ;i<10 ; i++) {
			   
			   System.out.println("2 * "+ i +" = "+ (2*i)  );
			   
		   } 
	   }
	    public void method9() {
	    	
	    	//사용자로부터 단수를 입력받아서 해당 단 출력
	    	System.out.println("----구구단 생성기----");
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("2 ~ 9 사이의 단수 입력 : ");
	    	int num = sc.nextInt();
	    	
	    	// 2~9 사이의 범위가 맞는지 체크
	    	if(num >=2 && num <=9) {
	    		for (int i=1; i<= 9; i++)
	    		 System.out.println( num +" * "+ i + " = "+ (num*i)  );
	    		
	    	}
	    	else {
	    		System.out.println("잘못 입력했습니다.");
	    	}
	   	
	    }
	
	    public void method10() {
	    	//2단에서부터 9단까지 모두 다 출력
	    	
	    	//9단 먼저 찍고 확장
	    	
	    	//규칙을 찾자!
	    	//9라는 단수 부분이 2,3,4,5,6,7,8,9 까지 =>1씩 증가하면서 바뀌면 
	    	//모든 구구단이 출력될거 같다. 
	    	
	    	for (int j=2 ; j <10 ; j++) { //반복 8번
	    		
	    		System.out.println("-----"+j+"단-----");
		    	
		    	for (int i =1 ; i<=9; i++) {  //반복9번
		    		System.out.println( j+" * "+i+" = "+(j * i));
		    	}
	    		
	    	}
	    	//총 반복 횟수: 겉의 for문 * 안쪽 for문 = 8*9= 72번
	    		
	    	
	    }
	    	public void method11() {
	    		
	    	//1 2 3 4 5
	    	//1 2 3 4 5
	    	//1 2 3 4 5
	    		
	    		for (int i =0 ; i< 3; i++ ) {
	    		
	    			//System.out.println("1 2 3 4 5");
	    	        for (int j=1 ; j<6 ; j++) {
	    	        System.out.print(j +" ");
	    	        
	    	        }//이 시점에서 System.out.print(j +" ");
	    	        //1 2 3 4 5 1 2 3 4 5 1 2 3 4 5	
	    	        System.out.println();	
	    			
	    		}
	
	    	
	    }
	    public void method12() {
	    	//*****
	    	//*****
	    	//*****
	    	//*****
	    	
	    	/*
	    	for(int i=0; i<4; i++) {
	    		
	    		//System.out.println("*****");
	    		
	    		for (int j=0; j<5; j++) {
	    	   System.out.print("*");
	    	 }//이 시점에서 System.out.print("*****");
	    		System.out.println();
	    	}
	    	*/
	    	
	    	//*****  => i = 5
	    	//*****  => i = 10
	    	//*****  => i = 15
	    	//*****  => i = 20
	    	//규칙 : 5의 배수 
	    	//(5의 배수 == 5로 나누었을때 나머지가 0인 경우)
	    	//애초에 반복을 20번 돌리겠다.
	    	for(int i=1; i<=20 ; i++) {
	    		
	    		System.out.print("*");
	    		
	    		if((i % 5) == 0) {
	    			System.out.println();
	    		}
	    	}
	    }
         
	    public void method13() {
	    	//1***
	    	//*2**
	    	//**3*
	    	//***4
	    	
	    	//크게 4바퀴 작게 4바퀴
	    	for (int i=1; i <=4; i++) { //크게 4바퀴
	    		
	    		for (int j=1; j<=4 ; j++) { //작게 4바퀴
	    			
	    			//System.out.print("*");
	    			if(i==j) {
	    				System.out.print(i);
	    			}
	    			else{
	    				System.out.print("*");
	    			}
			
	    		} //이 시점에서 System.out.print("****");
	    		System.out.println(); //개행
	    		
	    	  }
	    	/*
	    	 * for 문안에 for문을 겹쳐 쓸 경우 "중첩 for문"이라고도 부른다.
	    	 * if 문안에 if문을 겹쳐 쓸 경우 "중첩 if문"이라고도 부른다. 
	    	 */
	    	}
	    public void method14() {
	    	
	    	//문자열을 입력 받아
	    	//0번째 글자, 1번째 글자, 2번째 글자를 추출하는 프로그램
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("문자열 입력 : ");
	    	String str= sc.nextLine();
	    	//반복문 쓰기 전
	    	/*
	    	char ch1 = str.charAt(0);  System.out.println(str.charAt(0));
	    	char ch2 = str.charAt(1);
	    	char ch3 = str.charAt(2);
	    	*/
	    	
	    	//반복문 버전으로 바꿔보겠다.
	    	for (int i=0; i<3 ;i++) {
	    		char ch = str.charAt(i);
	    		System.out.println((i+1)+ " 번째 문자 : "+ch);
	    		
	    	}	    	
	    }
	    //반복문 실습문제 -12번 -"exit"문제
	    public void method15() {
	    	
	    	/*
	    	 * 아무 문자열이나 입력하세요 : ~~~
	    	 */
	    	//문자열을 무한적으로 반복 하면서 매번 입력 받기
	    	//만약 입력 받은 문자열이 "exit"라는 문자열이라면 종료
	    	
	    	Scanner sc = new Scanner(System.in);  //굳이 반복적으로 실행할 필요가 없음!
	    	
	    	for ( ; ;)  { //무한반복이 가능  ,항상true로 만든것 
	    		
	    		System.out.print("아무 문자열이나 입력하세요 : ");
		    	String str = sc.nextLine();
		    	
		    	if (str.equals("exit")) {  //만약에 str 의 값이 "exit" 과 동일하다면 
		    		  //종료 시키는 구문
                      //나를 호출했던 태초마을로 돌아가는 구문  return;
		    		return;   //break; 라는 구문도 가능하다. 단, 실행된 결과가 다르다!

	    	}	
	   }
			
	 }
	    
	    public void method16() {
	    	/*
	    	 * 사용자로부터 두 개의 값을 정수값을 입력받은 후에 
	    	 * 그 사이의 숫자를 모두 출력하는 프로그램
	    	 * (조건문 for 문)
	    	 * 정수 1입력 : 3
	    	 * 정수 2입력 : 8
	    	 * 3 4 5 6 7 8
	    	 */
	    	//1. 두 정수를 입력 받음
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("정수 1입력 : ");
	    	int num1 = sc.nextInt();
	    
	    	System.out.print("정수 2 입력 : ");
	    	int num2 = sc.nextInt();
	    	
	    	//2. 출력
	    	/*
	    	 * 우선적으로 우리가 파악해야 하는 경우의 수를 고려해야 함
	    	 * num1 <num2  : num1에서부터 num2까지 1씩 증가시키면서 출력
	    	 * num2 < num1 : num2에서부터 num1까지 1씩 증가시키면서 출력  또는
	    	 *               num1에서부터 num2까지 1씩  감소시키면서 출력
	    	 *               
	    	 * num1 == num2 : 정수1과 정수2의 값이 동일합니다. 출력
	    	 *               
	    	 */
	    	if(num1 <num2 ) {
	    		//num1에서부터 num2까지 1씩 증가시키면서 출력
	    		for (int i = num1; i<= num2; i++) { //i는 int i = num1;에서 생성됨
	    			System.out.print(i +" ");	
	    		}
	    	 }else if(num2 < num1) {
	    		//num2에서부터 num1까지 1씩 증가시키면서 출력  또는
		    	 
//	    		for (int i =num2 ; i<=num2 ; i++) {
//	    			System.out.print(i +" ");
//	    		}
	    		//num1에서부터 num2까지 1씩  감소시키면서 출력
	    		for (int i=num1; i>=num2; i--) {
	    			System.out.print(i +" ");    			
	    		}
	    		
	    	  }  else { //두 경우가 아닐때 
	    		System.out.print("정수1과 정수2가 동일합니다.");
	    	}
	
	    	
	    	
	    }
	    
	    
	    
	    
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    	
	    	
	    	
	
	
	

