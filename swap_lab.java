package thursday_lab_27_july;

public class swap_lab extends Variables {
	public void swap1() {
		System.out.println(" swapping without variable");
		var();
	
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(" ----------Result-----------");
		System.out.println("a="+num1+"\t"+"b="+num2);
	}
	public  void swap2() {
		System.out.println("swapping with new variable");
		var();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("-----------Result----------");
		System.out.println("a="+num1+"\t\t"+"b="+num2);
	}
	public static void main(String[] args) {
		 swap_lab obj=new  swap_lab();
		 obj.swap1();
		 obj.swap2();
	
	}

}
