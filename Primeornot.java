package Programs;
//a no.is prime if it has exactly two factors 1 and itself
public class Primeornot {
public static void main(String []args) {
	int num=4;
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
		count++;
		}
		}
	if(count==2) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	}
	
}

