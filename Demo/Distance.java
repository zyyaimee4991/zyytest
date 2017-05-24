public class Distance{
	public double getDistance(Point p1,Point p2){
		double x1=p1.getX();
		double x2=p2.getX();
		
		double y1=p1.getY();
		double y2=p2.getY();
		
		double Distance=Math.hypot(x1 - x2, y1 - y2);
		return Distance;
	}
	}