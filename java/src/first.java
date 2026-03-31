class example{
	int x; // instance (object) member variable (non - static)
	int y;
	void fun1() {  // instance (object) member function (non - static)
		System.out.println("hello");
	}
	void fun2() {
		System.out.println("world!");
	}
}
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e1 = new example();
		example e2 = new example();
		e1.fun1();
		e1.fun2();
		e1.x=5;
		e1.y=52;
		
		System.out.println(e1.x);
		System.out.println(e1.y);		
		
		e2.x=72;
		e2.y=48;
		
		System.out.println(e2.x);
		System.out.println(e2.y);		
	}

}
