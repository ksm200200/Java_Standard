package chapter_07;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(4, 5, 6);
		System.out.println(p3.getLocation());
	}

}


class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);		//생성자의 첫 줄에 생성자를 호출하는 문장 필수                      
		this.z = z;
	}
	String getLocation() {
	  return "x: " + x + ", y: " + y + ", z: " + z;
	  }
}