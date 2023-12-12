package demo;

public class Vovel {
	public static void main(String[] args) {
		String str="Rezwan@123#";
		String a=str.toLowerCase();
//		int vovel=0;
//		int consonants=0;
//		int num=0;
//		int special=0;
		
		String v="";
		String c="";
		String n="";
		String sp="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
//				vovel++;
				v=v+ch;
				
				
			}
			else if((ch!='a'||ch!='e' || ch!='i' || ch!='o'|| ch=='u')&&(ch>='a'&& ch<='z')) {
//				consonants++;
				c=c+ch;
				
			}
			else if(ch>='0'&& ch<='9') {
//				num++;
				n=n+ch;
				
			}
			else {
//				special++;
				sp=sp+ch;
		
			}
		
			
		}
//		System.out.println(vovel);
//		System.out.println(consonants);
//		System.out.println(num);
//		System.out.println(special);
		
		System.out.println(v);
		System.out.println(c);
		System.out.println(n);
		System.out.println(sp);
		
		
	}
}
