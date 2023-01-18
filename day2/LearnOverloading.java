package week3.day2;

public class LearnOverloading
 {
	
		public void sub(int num1,int num2) {
			System.out.println(num1-num2);
		}
		public void sub(int num1,float num2) {
			System.out.println(num1-num2);
			
		}public void mul(int num1,double num2) {
			System.out.println(num1*num2);}
		
			public void div(int num1,long num2) {
				System.out.println(num1/num2);
			}
		
public static void main(String[] args) {
			LearnOverloading obj=new LearnOverloading();
			obj.sub(15, 5);
			obj.sub(4, 0.2f);
			obj.mul(30, 10);
			obj.div(100, 10);
			
		}
	}


