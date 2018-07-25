package coreJavaRevise;

public class FindDuplicateCharacterInAString {
	public static void main(String[] args) {
		String s="hello how are you";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			int count=0;
			int count1=1;
			for(int j=0;j<=i-1;j++){
				if(c[i]==c[j]){
					count++;
				}
			}
			if(count==0){
				//System.out.println(c[i]+" is "+count);
				for(int k=i+1;k<c.length;k++){
					if(c[i]==c[k]){
					count1++;
				}
			}
			
			if(count1>1){
				System.out.println(c[i]+" is "+count1 +" times");
			}
		}
	}
	}}

