package ArraysExamples;

public class MissingNoUsingSum {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,6,7,9};

int n = a[a.length-1];
int sum = n*(n+1)/2;
int sum1=0;

for(int i=0;i<a.length;i++) {
	
	sum1 = sum1+ a[i];
	
}

System.out.println("Missig Number is "+(sum-sum1));

	}

}
