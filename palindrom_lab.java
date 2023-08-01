package thursday_lab_27_july;

public class palindrom_lab extends arry_lab{

	public static void main(String[] args) {
		palindrom_lab obj=new palindrom_lab();
		obj.palindrom();
		}
	public void palindrom() {
		System.out.println("enter the number");
		
		pal();
		n=num;
		while(num>0) {
		digit=num%10;
		ans=digit+ans*10;
		num=num/10;
		}
		if(n==ans)
		{
			System.out.println(n+"is the a palindrom number");
		}
		else
		{
			System.out.println(n+"is not a palindrom number");	
		}
	}
	
}
