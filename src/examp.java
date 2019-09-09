import java.util.*;

public class examp {
	
	public static double distanceBetweenTwoPoint(double x1 , double y1 , double x2 , double y2){
        double distance =Math.pow((((x1 - x2) * (x1 - x2))  + ((y1 - y2) *  (y1 - y2))) , 0.5);
        return distance;
    }
	public static void main(String[] args) {
		
	
	System.out.println("Enter r2's center x-, y-coordinates, width, and height");
	Scanner scanner1 = new Scanner(System.in);
	double  x1 = scanner1.nextDouble();
	double y1 = scanner1.nextDouble();
	double width1 =  scanner1.nextDouble();
	 double height1 =  scanner1.nextDouble();
  double  x2 = scanner1.nextDouble();
  double y2 = scanner1.nextDouble();
  double width2 =  scanner1.nextDouble();
  double height2 =  scanner1.nextDouble();
  double twoPoint = distanceBetweenTwoPoint(x1,y1,x2,y2);

  boolean horizontalInside = (twoPoint + (width2 / 2)) <= (width1 / 2) ;
  boolean verticalInside = (twoPoint + (height2 / 2)) <= (height1 / 2) ;
  boolean horizontalOutside = twoPoint >= ((width2 / 2) + (width1 / 2));
  boolean verticalOutside = twoPoint >= ((height2 / 2) + (height1 / 2));

  if(horizontalInside && verticalInside){
      System.out.println("R2 is inside of R1 ");
  }else if (horizontalOutside || verticalOutside){
      System.out.println("R2 is not in R1 ");
  }else System.out.println("R2 overlaps R1");
}}
