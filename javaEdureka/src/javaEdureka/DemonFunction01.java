package javaEdureka;

public class DemonFunction01 {

	public static void main(String[] args) {
		System.out.println("Area of a rectangles:"+RectangleArea(20,10));
		System.out.println("parametter of a rectangles:"+Rectangleparameter(20,10));
		System.out.println("Area of a rectangles:"+RectangleArea(40,10));
		System.out.println("parametter of a rectangles:"+Rectangleparameter(15,10));

	}
	
  public static int RectangleArea (int lenght,int breath)
  {
	return lenght * breath;
	  }
  public static int Rectangleparameter (int lenght,int breath)
  {
	return 2 *(lenght + breath);
	  
  }
}
