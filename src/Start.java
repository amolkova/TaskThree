import java.util.Scanner;

public class Start {
	
	 public static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        int userNumber;
	    do {   	        
	        int secret = getRandomNumber(0, 9);
	        
	        for(int i = 0; i < 3; i++) {
	        	  userNumber = getNumberFromScanner("������� ����� � �������� �� 0 �� 9", 0, 9);
	        	  if(check(userNumber, secret)) {
	        		  break;
	        	  }
	        }
	        
      	  	userNumber = getNumberFromScanner("��������� ���� ��� ���? 1 - ��/ 0 - ���.", 0, 1);
	      	if(userNumber == 0) {
	      		System.out.println("�� ��������!");
	      	} else {
	      		System.out.println("��������� ����!");
	      	}
	    } while (userNumber == 1);
      	  
	    }
	    
	    private static boolean check(int userNumber, int secret) {
			if(userNumber > secret) {
				System.out.println("���� ����� ������ ���������.");
				return false;
			} else if(userNumber < secret) {
				System.out.println("���� ����� ������ ���������.");
				return false;
			} else {
				System.out.println("�� ��������!");
				return true;
			}
	    }

		private static int getRandomNumber(int min ,int max) {
			int test = min + (int) (Math.random() * max);
			System.out.println(test);
	    	return test;

		}

		public static int getNumberFromScanner(String message, int min, int max) {
	        int x;
	        do {
	            System.out.println(message);
	            x = sc.nextInt();
	        } while (x < min || x > max);
	        return x;
	    }
	}
			  



