class Nokia
{
private int mic;
private int cam;
void setValue()
{
	mic=4;
	cam=40;
}
void display() {
	System.out.println(mic);
	System.out.println(cam);
}
}

public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nokia n1 = new Nokia();
		n1.display();
		n1.setValue();
		n1.display();
	}

}
