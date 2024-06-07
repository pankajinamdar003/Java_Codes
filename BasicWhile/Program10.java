class Demo{
	public static void main(String[] args){
	int x=100;
	System.out.println("The range of number divisible by 4 and 5 is :");
	while(x>=24){
		if(x%4==0 && x%5==0){
			System.out.println(x);
		}
		x--;
	}
	
	}

}
