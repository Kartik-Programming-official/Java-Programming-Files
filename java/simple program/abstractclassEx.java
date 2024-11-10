abstract class shape{
	float dim1,dim2,redius;
	abstract float area();
}
class triangle extends shape{
	triangle(float d1,float d2){
		dim1=d1;
		dim2=d2;
	}
	float area(){
		System.out.println("\n Area of triangle is:-");
		return (dim1*dim2)/2;
	}
}
class rectangle extends shape{
	rectangle(float d1,float d2){
		dim1=d1;
		dim2=d2;
	}
	float area(){
		System.out.println("\n Area of rectangle is:-");
		return dim1*dim2;
	}
}
class circle extends shape{
	circle(float d1){
		redius=d1;
	}
	float area(){
		System.out.println("\n Area of circle is:-");
		return 3.14f*redius*redius;
	}
}
class abstractclassEx{
	public static void main(String[]args){
		triangle t= new triangle(4.3f,5.3f);
		rectangle r= new rectangle(2.4f,4.2f);
		circle c= new circle(10.5f);
		System.out.println(t.area());
		System.out.println(r.area());
		System.out.println(c.area());
	}
}