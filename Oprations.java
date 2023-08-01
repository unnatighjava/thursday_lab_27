package thursday_lab_27_july;

import java.util.Scanner;

public class Oprations {
	static int choice,repeat;
	int input;
	static char char1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1:pallindrom\n2:sawap\n3:array");
		System.out.println("-----select one option which you wanted to perform------");
		choice=sc.nextInt();
		
			palindrom_lab obj=new palindrom_lab();
			 swap_lab obj1=new  swap_lab();
			 arry_lab obj3=new arry_lab();
				
			switch(choice) {
			case 1:{
				System.out.println("****performing palindrom****");
				obj.palindrom();
			}
				break;
			case 2:
				System.out.println("****perfoming swaping****");
				 obj1.swap1();
				 obj1.swap2();
				break;
			case 3:
				System.out.println("****perfoming diifrent opration using array****");
				obj3.greater();
				obj3.smaller();
				obj3.accending();
				obj3.deccending();
				break;
				default:
					System.out.println("selct right option from 1,2,3......");
					break;
				
			}
			
					System.out.println("\n\nDo you want to order any other item...(y / n):");
					repeat = sc.next().charAt(0);
			
			
			
			
			
			
		
		}while(repeat == 'Y' || repeat == 'y');
		System.out.println("*********************the End***************************** ");
		
		}
	
	
}

