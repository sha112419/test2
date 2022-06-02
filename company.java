package test2;

public class company {
	int salary() {
		return 3;
	}
	public static void main(String[] args) {
		company f;
		f= new tcs();
		System.out.println("fixed per annum:"+f.salary());
		f= new cts();
		System.out.println("fixed per annum:"+f.salary());
		f= new cogizant();
		System.out.println("fixed per annum:"+f.salary());
	}

}
