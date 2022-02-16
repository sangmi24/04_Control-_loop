package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *while��
	 * �ݺ����� �������� ���ǽ��� ����� true�� ��쿡�� �ݺ��� �����ϴ� ������ �̷���� �ִ�.
	 * 
	 * [ǥ����]
	 * 
	 * �ʱ��;  // ����1.  �ݺ��� �ʿ��� ������ ���� �� �ʱ�ȭ  (�ʼ��� �ƴ�)
	 * 
	 * while(���ǽ�)  {   //����2. ���ǰ˻� �� true��� ����
	 * 
	 *       �ݺ������� ������ ���빰;  // ����3. ����
	 * 
	 *       ������;   //����4. ��������  (�ʼ��� �ƴ�)
	 *  }
	 *  => ���ǽ��� ����� true �� ��� �ش� ������ �����ϰ�
	 *  => �ٽ� ���ƿͼ� ���ǽ��� ����� true�� ��� �ش� ������ �����ϰ�
	 *  ....
	 *  => �ٽ� ���ƿͼ� ���ǽ��� ����� false��� �ݺ��� ����������!
	 *  (���ǽĿ� true�� ������ ���ѹݺ� ����!) 
	 */
	  public void method1() {
		  
//		  for(int i = 0; i<5; i++) {
//			  System.out.println("�ȳ��ϼ���");
//		  }// �ȳ��ϼ��� 5�� ����
		  
		  //while�� �������� �ٲ㺸�� 
		    int i=0;   //for���� �ʱ�� �κ�
		    
		  while( i < 5 ) {  //for ���� ���ǽ� �κ�

             System.out.println("�ȳ��ϼ���");
             
			  i++;  //for���� ������ �κ�
			  
		  }
		  
		  // �� ���� �������� i�� ����? i = 5
		  System.out.println("i : "+ i);
		  
		  while(i >= 1 ) {
			  
			  System.out.println("i : "+ --i); 
			  //i--; 
			  
			  /*
			   * System.out.println ���� �ȿ��ٰ� i--�� �ۼ����� ��쿡��
			   * 5 4 3 2 1 
			   * 
			   * System.out.println ���� �ȿ��ٰ� --i �� �ۼ����� ��쿡��
			   * 4 3 2 1 0
			   * 
			   * ���� i ���� ��ȭ�Ѵ�. 
			   */
		  } 
		  //�� ���� �������� i�� ���� ? i=0
		  System.out.println("i : "+ i);

	  }
	    public void method2() {
	    	
	    	//1�������� 10������ �� �հ�
	    	
	    	 int sum = 0; //0���� �ʱ�ȭ�ؾ��� ��Ȯ�ϰ� ����
	    	 
//	    	 for(int i =1 ; i <=10 ; i++) {
//	    		 
//	    		 sum += i ; // sum=sum+i;
//	    		 
//	    	 }
	    	 
	    	 //while���� �̿��� ����
	    	 
	    	 int i =1;  //�ʱ��
	    	 
	    	 while(i <= 10) {   		 
	    		 sum += i ;  //	sum=sum+i;	 
	    		 i++;    	
	    	 }
	    	 System.out.println("sum : "+sum);  //55
	       }
	  
	  public void method3() {
		  
		  //1���� ������(1~100)������ �� �հ�  => 100�� ��
		  
		  int random = (int)((Math.random()*100) + 1);   //100�� �Ѱ���, 1�� ���ۼ� 
		  
		  System.out.println("random: "+random);
		  
		  int sum = 0; //����! �ʼ���
		  
//		  for(int i =1 ; i<=random; i++) {
//			  
//			  sum += i;  //sum = sum+i;
//		  }
		  
		  int i = 1;   //�ʱ��
		  
		  while(i <= random) {  //���ǽ�
			  
			  sum += i ;  //������ ����
			  i++;       //������
			  
		  }	  
		  System.out.println("sum: "+sum);

	  }
	  
	  public void method4() {
		/*
	     * �ƹ� ���ڿ��̳� �Է��ϼ��� : ~~~
	     */
		 //���ڿ��� ���������� �ݺ� �ϸ鼭 �Ź� �Է� �ޱ�
	     //���� �Է� ���� ���ڿ��� "exit"��� ���ڿ��̶�� ����
		  
		  Scanner sc = new Scanner(System.in);
		 
		  while(true) {  //for(;;) {  //���ѹݺ���
			  
			  System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ��� : ");
			  String str = sc.nextLine();
			  
			  //�Է� ���� "exit"�� ��ġ�ϴ��� üũ 
			  if(str.equals("exit")) {
				  return;  //return�� ������ ������
			  }
		  }
	  }
	  
	  /*
	   * *do-while��
	   * 
	   * [ ǥ���� ]
	   *  do {
	   *       ������ �ڵ�;
	   *  } while(���ǽ�);  
	   * 
	   * => ���ǽ��� ����� true �� ��� ������ �ڵ带 �ٽ� ����
	   * => ���ǽ��� ����� false �� ��� �ݺ����� �������´�.
	   * 
	   * while���� do-while���� ��������
	   * while���� ó�� �����Ҷ� ���ǰ˻縦 ���� �ϰ� true �������� ������ �Ѵٸ�
	   * do-while���� �ϴ� �ѹ� ������ �ϰ��� ���ǰ˻��� ����� true�̸� �ٽ� ���ư���  ����
	   * 
	   * ��, ������ ���� �ʴ��� �ּ� 1���� ������ �ǰڴ�. (���ǽĿ��� false�־ 1�� ����)
	   */
	  public void method5() {
		  
		  int i = 1;  //i�� 0�̸� ���ѹݺ���
		  
		  while (i==0) {   //false�̱� ������ ȣ�� �ȵ�  
			  
		      System.out.println("����");
		  }
		  //������ ���ʿ� false�̱� ������ �ƹ��͵� ����� ���� ����
		  
		  
		  do {		  
			  System.out.println("����");
		  } while(i==0); //false
		  //������ ���ʿ� false�̴��� ��� �ѹ��� ������ �ȴ�. 

	  }
	    
	  public void method6() {
		  
		  //1 2 3 4 5 
		  
		  //1. for �� ����
		  for(int i=1; i<=5; i++) {
			  System.out.print(i+ " ");
		  }
		  System.out.println();
		  
		  //2. while�� ����
		  int i=1;
		  while(i<=5) {
			  System.out.print(i+ " ");
			  i++;
		  }
		  System.out.println();
		  
		  //3. do-while�� ����
		 int j = 1; 
		 do {
			System.out.print(j + " "); 
			j++;
		 } while (j <= 5);
		  
	  }
	  
	  
	  
	  
	  
	  

	
	
}
