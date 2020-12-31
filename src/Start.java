import java.util.Scanner;

public class Start {
	
	 public static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        int userNumber;
	    do {   	        
	        int secret = getRandomNumber(0, 9);
	        
	        for(int i = 0; i < 3; i++) {
	        	  userNumber = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);
	        	  if(check(userNumber, secret)) {
	        		  break;
	        	  }
	        }
	        
      	  	userNumber = getNumberFromScanner("Повторить игру еще раз? 1 - да/ 0 - нет.", 0, 1);
	      	if(userNumber == 0) {
	      		System.out.println("До свидания!");
	      	} else {
	      		System.out.println("Повторяем игру!");
	      	}
	    } while (userNumber == 1);
      	  
	    }
	    
	    private static boolean check(int userNumber, int secret) {
			if(userNumber > secret) {
				System.out.println("Ваше число больше заданного.");
				return false;
			} else if(userNumber < secret) {
				System.out.println("Ваше число меньше заданного.");
				return false;
			} else {
				System.out.println("Вы победили!");
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
			  



