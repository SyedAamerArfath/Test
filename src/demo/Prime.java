//package demo;
//
//public class Sample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int c=0;
//		for (int i = 2; i <50; i++) {
//			int num=i,count=0;
//			for (int j = 2; j <num; j++) {
//				if(num%j==0) {
//					count++;
//					break;
//				}
//			}
//			if(count==0) {
//				System.out.println(num);
//				c++;
//			}
//		}
//
//	}
//
//}
package demo;

public class Prime {

    public static void main(String[] args) {
        int c = 0;
        for (int i = 2; c < 50; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                c++;
            }
        }
    }

}

