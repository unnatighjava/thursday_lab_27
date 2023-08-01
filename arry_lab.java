package thursday_lab_27_july;

public class arry_lab extends Variables {
	
	
	public static void main(String[]args)
	{
		
		arry_lab obj=new arry_lab();
		obj.greater();
		obj.smaller();
		obj.accending();
		obj.deccending();
		
	}
	public void array() {
		num3=accept();
	}

	public void greater()
	{
		array();
		 int grt=num3[0];
		for(i=0;i<num3.length;i++) {
			if(grt <num3[i])
			{
				grt=num3[i];
			}
			
		}
		System.out.println("the greater number is:"+grt);
	
	}
	public void smaller()
	{
		
		
		 int smt=num3[0];
		for(i=0;i<num3.length;i++) {
			if(smt >num3[i])
			{
				smt=num3[i];
			}
			
		}
		System.out.println("the smaller number is:"+smt);
	
	}
	
	public void accending(){
		 int acc=num3[0];
			for(i=0;i<num3.length;i++) {
				for(j=i+1;j<num3.length;j++) {
					if(num3[i]<num3[j]) {
						temp=num3[i];
						num3[i]=num3[j];
						num3[j]=temp;
					}
				}
			}
			System.out.println("the accending order is:");
			print();
	}
	public void deccending(){
		 int acc=num3[0];
			for(i=0;i<num3.length;i++) {
				for(j=i+1;j<num3.length;j++) {
					if(num3[i]>num3[j]) {
						temp=num3[i];
						num3[i]=num3[j];
						num3[j]=temp;
					}
				}
			}
			System.out.println("the deccending order is:");
			print();
	}
	
	
	
}
