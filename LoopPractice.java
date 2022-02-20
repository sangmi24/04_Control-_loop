package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice12() {
		//정수 2개와 연산자(문자열로 입력 받고 입력된 연산자)에 따라 결과 출력
		//단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어 올때까지 무한 반복
		
		//  * 안되는 경우 = 1. 연산자가 나누기&& 두번째 정수가 0인 경우 =>"0으로 나눌 수 없습니다. 다시 입력해주세요."
		//              2. 없는 연산자 => "없는 연산자입니다. 다시 입력해주세요."
		//       두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.    
			
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
	  public void practice1() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("1이상의 숫자를 입력하세요 : ");
		  int num = sc.nextInt();
		  
		  if(num>0) {
		  for(int i=1; i<= num ; i++) {
			  System.out.print( i +" ");
		   }
		  }else {
			  System.out.print("잘못 입력하셨습니다.");
		  }
	  
	  }
	  public void practice2() {
		  
		  Scanner sc = new Scanner(System.in);
	 
		  while(true) {  //true가 아니면 반복이라서 while 써야함
			  System.out.print("1이상의 숫자를 입력하세요 : ");
			  int num = sc.nextInt();   
		  if(num>0) {
			  for(int i=1; i<=num ;i++ ) {
				  System.out.print(i +" ");
			  }
			 break;
		  } else {
			  System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.\n");
		     }
		  }		  
	  }
	    public void practice3() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("1이상의 숫자를 입력하세요:");
	    	int num = sc.nextInt();
	    	
	    	if(num>0) {
	    		for(int i=num; i>=1 ; i--) {
		    		System.out.print(i +" ");
		    	}	
	    	}else {
	    		System.out.print("잘못 입력하셨습니다.");
	    	}

	    }
	    public void practice4() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	
	    	while(true) {
	    		System.out.print("1이상의 숫자를 입력하세요: ");
    			int num = sc.nextInt(); 
    			
	    		if(num>0) {	
	    			for(int i=num; i>=1; i-- ) {   			
		    			System.out.print(i+ " ");
		    		}return;
	    		} 
	    		else {
	    			System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.\n");
	    		}	    		
	    	} 
	    }
	   public void practice5() {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("정수를 하나 입력하세요 : ");
		   int num = sc.nextInt();
		   
		   int sum =0;  //합을 0으로 초기화시킴
		   
		   
		   for(int i=1 ;i<=num; i++) {
			  sum += i;       //합을 반복문 바로 밑에 
			  System.out.print(i+" ");
			  
			  if(i==num) {
				  System.out.print("= ");
			  }else {
				  System.out.print("+ ");
			  }	  
		   }
		   System.out.println(sum);
	   
	   }
        public void practice6() {
        
        	Scanner sc = new Scanner(System.in);
        	System.out.print("첫 번째 숫자: ");
        	int num1 = sc.nextInt();
        	System.out.print("두 번째 숫자: ");
        	int num2 = sc.nextInt();
        	
        	if(num1>0 && num2>0) {
        		
        	if(num1<num2) {	
        		for(int i=num1; i<=num2; i++) {
        		System.out.print(i+ " ");       		
        	  }        	
        	 }else {
        		 for(int i=num2; i<=num1; i++) {
             		System.out.print(i+ " ");   
        	   }
        	 }
        	}	
        	else {
         		System.out.print("1이상의 숫자만을 입력해주세요.");
        	}
         
        }
	    public void practice7() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	while(true) {

	    		
	    		System.out.print("첫 번째 문자 : ");
	    		int num1 = sc.nextInt();
	    		System.out.print("두 번째 문자 : ");
	    		int num2 = sc.nextInt();
	    		
	    		if(num1>0&&num2>0) {
	    			
	    			if(num1<num2) {	    			
	    			for(int i=num1; i<=num2; i++) {	    				
	    				System.out.print(i +" ");    				
	    			} 	    			
	    		   } 
	    			else {
	    			for(int i=num2; i<=num1; i++) {	    				
		    		  System.out.print(i +" ");		    		 
		    		} 
	    		  } break;
	    		} 		
	    		else {
	    			System.out.print("1이상 숫자를 입력해주세요. \n");			
	    		} 		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	   
	   
	   
	   
	   
	   
	   
}
