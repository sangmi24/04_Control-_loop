package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice12() {
		//���� 2���� ������(���ڿ��� �Է� �ް� �Էµ� ������)�� ���� ��� ���
		//��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ��� �ö����� ���� �ݺ�
		
		//  * �ȵǴ� ��� = 1. �����ڰ� ������&& �ι�° ������ 0�� ��� =>"0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."
		//              2. ���� ������ => "���� �������Դϴ�. �ٽ� �Է����ּ���."
		//       �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.    
			
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
	  public void practice1() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		  int num = sc.nextInt();
		  
		  if(num>0) {
		  for(int i=1; i<= num ; i++) {
			  System.out.print( i +" ");
		   }
		  }else {
			  System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		  }
	  
	  }
	  public void practice2() {
		  
		  Scanner sc = new Scanner(System.in);
	 
		  while(true) {  //true�� �ƴϸ� �ݺ��̶� while �����
			  System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			  int num = sc.nextInt();   
		  if(num>0) {
			  for(int i=1; i<=num ;i++ ) {
				  System.out.print(i +" ");
			  }
			 break;
		  } else {
			  System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
		     }
		  }		  
	  }
	    public void practice3() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
	    	int num = sc.nextInt();
	    	
	    	if(num>0) {
	    		for(int i=num; i>=1 ; i--) {
		    		System.out.print(i +" ");
		    	}	
	    	}else {
	    		System.out.print("�߸� �Է��ϼ̽��ϴ�.");
	    	}

	    }
	    public void practice4() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	
	    	while(true) {
	    		System.out.print("1�̻��� ���ڸ� �Է��ϼ���: ");
    			int num = sc.nextInt(); 
    			
	    		if(num>0) {	
	    			for(int i=num; i>=1; i-- ) {   			
		    			System.out.print(i+ " ");
		    		}return;
	    		} 
	    		else {
	    			System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
	    		}	    		
	    	} 
	    }
	   public void practice5() {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("������ �ϳ� �Է��ϼ��� : ");
		   int num = sc.nextInt();
		   
		   int sum =0;  //���� 0���� �ʱ�ȭ��Ŵ
		   
		   
		   for(int i=1 ;i<=num; i++) {
			  sum += i;       //���� �ݺ��� �ٷ� �ؿ� 
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
        	System.out.print("ù ��° ����: ");
        	int num1 = sc.nextInt();
        	System.out.print("�� ��° ����: ");
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
         		System.out.print("1�̻��� ���ڸ��� �Է����ּ���.");
        	}
         
        }
	    public void practice7() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	while(true) {

	    		
	    		System.out.print("ù ��° ���� : ");
	    		int num1 = sc.nextInt();
	    		System.out.print("�� ��° ���� : ");
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
	    			System.out.print("1�̻� ���ڸ� �Է����ּ���. \n");			
	    		} 		
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	   
	   
	   
	   
	   
	   
	   
}
