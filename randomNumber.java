package Java;

import java.util.Scanner;


public class randomNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] easy = {"0","1","2","3","4","5","6","7","8","9"};
		String[] medium = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] hard ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		 String senha="";
		
		 int repeat;
		 
		 int l , d;
		 
		 System.out.println("Password generator");
		 System.out.println("");
		 
		do {
			
			//Here the length of the generated password is chosen
			 System.out.println("How long is the password?"); //Tamanho da senha
			 l = sc.nextInt();
			 
			 //Here it is chosen the difficulty of the password that will be generated
			 System.out.println("How difficult is the password?"); //Dificuldade da senha
			 System.out.println("[1] - Easy");
			 System.out.println("[2] - Medium");
			 System.out.println("[3] - Hard");
			 d = sc.nextInt();
			 
			 switch (d) {
			 
			 case 1://Easy difficulty password contains only numbers
				 
				 	for (int x=0; x<l; x++){
				     int j = (int) (Math.random()*easy.length); //dificuldade fácil, senha somente com números
				     senha += easy[j];
				 	}
				 	break;
			
			 case 2://Medium difficulty password contains numbers and lowercase letters
				 
					 for (int x=0; x<l; x++){
					     int j = (int) (Math.random()*medium.length); //dificuldade média, senha podendo conter números e letras minúsculas
					     senha += medium[j];
					 	}
				 	break;
			
			 case 3://High difficulty password contains upper and lower case numbers and letters
				 	
					 for (int x=0; x<l; x++){
					     int j = (int) (Math.random()*hard.length); //dificuldade difícil, senha podendo conter números, letras minúsculas e letras maiúsculas
					     senha += hard[j];
					 	}
					 //repeat = "N";
				 	break;
				 	
			 default: //The default is triggered if any incorrect information has been entered
				 
				 	 senha = "ERROR , please make sure you filled it out correctly";//Erro caso alguma informação errada tenha sido inserida
			 }
			 
			 System.out.println("The generated password is: "+senha);//A senha gerada
			 
			 System.out.println("");
			 
			 System.out.println("Would you like to generate a new password?");
			 System.out.println("[1] - Yes");
			 System.out.println("[2] - No");
			 
			 repeat = sc.nextInt();
			 
			 System.out.println("******************************");
			 
		}while(repeat == 1);
		 
		 sc.close();
		 
	}

}
