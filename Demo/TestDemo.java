public class TestDemo{
	public static void main(String[] args){
		Point p1=new Point(3,4);
		
		Point p2=new Point(8,10);
		
		
		Distance dis=new Distance();
		double Distance=dis.getDistance(p1,p2);
		System.out.println(Distance);
	}
}
		