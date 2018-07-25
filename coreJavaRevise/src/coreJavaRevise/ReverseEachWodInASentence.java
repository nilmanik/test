package coreJavaRevise;

public class ReverseEachWodInASentence {
public static void reverse(String s){
	String[] c=s.split(" ");
	String reverse=" ";
	for(int i=s.length()-1;i>=0;i--){
		reverse=reverse+s.charAt(i);
	}
	System.out.println(reverse);
}
public static void main(String[] args) {
	reverse("hi how are you");
}
}
