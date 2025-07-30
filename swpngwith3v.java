package Programs;

public class swpngwith3v {

	public static void main(String[] args) {
		int x=10,y=15;
		System.out.println("before swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		//swapping
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
