package coreJavaRevise;

public class RemoveSpaceInString {
	public static void main(String[] args) {
		String s="nil ma ni  ku mar";
		String[] c=s.split(" ");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
	}

}
