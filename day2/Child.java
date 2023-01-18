package week3.day2;

public class Child extends Parent{
public void house6() {
	System.out.println("child has one house");
}
public static void main(String[] args) {
	Child obj=new Child();

	obj.apartment();
	obj.villa();
	obj.singlehouse();
	obj.house4();
	obj.house5();
	obj.house6();
}
}
