package thursday_lab_27_july;

import java.util.Scanner;

public class Variables {
int num,i,j,size,digit,n,num1,num2,temp;
int[]num3;
static int ans;
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	
		public int[] accept()
		{
		System.out.println("enter the size");
		size=sc.nextInt();
		System.out.println("enter "+size+" numbers");
		num3=new int[size];
		
			for(i=0;i<size;i++)
			{
				num3[i]=sc.nextInt();
			}
			return num3;
		}
		
		
		public void array() {
			num3=accept();
		}
		public void print() {
			for(i=0;i<num3.length;i++) {
				System.out.print("\t"+num3[i]);
			}
			System.out.println("\n");
		}
	
	
	public void pal() {
		n=num;
		num=sc.nextInt();
	}
	
	 public void var() {
	    System.out.println("enter two number");
	    System.out.println("a=");
		num1=sc.nextInt();
		System.out.println("b=");
		num2=sc.nextInt();	
		}

}
