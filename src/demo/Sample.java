package demo;

public class Sample {
		public static void main(String[] args) {
			String s="there are 10 buses";
				String a[]=s.split(" ");
				
				for (int i = 0; i < a.length; i++) {
					String b=a[i];
					char ch=b.charAt(0);
					if(ch>='0'&& ch<='9') {
						int num=Integer.parseInt(a[i])+1000;
						System.out.println(num);
					}
				}
		}
}
