class Room
{
	float length,breadth;
	void getdate(float a,float b)
	{
		length=a;
		breadth=b;
	}
}
class RoomArea
{
	public static void main(String args[])
	{
		float area;
		Room rooml=new Room();
		rooml.getdate(14,10);
		area=rooml.length*rooml.breadth;
		System.out.println("\n Area=" +area);
	}
}