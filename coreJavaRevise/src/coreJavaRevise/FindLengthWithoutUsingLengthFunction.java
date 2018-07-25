package coreJavaRevise;

public class FindLengthWithoutUsingLengthFunction {
public static void main(String[] args) {
	String s="nilmani k";
	int count=0;
	while(true){
		try {
			s.charAt(count);
		} catch (Exception e) {
			System.out.println("length of the string is "+count);
			System.exit(0);
		}
		count++;
	}
}
}
