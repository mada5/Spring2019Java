import java.util.Scanner;

public class example {

		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.print("Enter r1-x coordinate:");
			double r1x=input.nextDouble();
			
			System.out.print("Enter r1-y coordinate:");
			double r1y=input.nextDouble();
			
			System.out.print("Enter width1:");
			double width1=input.nextDouble();
			
			System.out.print("Enter height1:");
			double height1=input.nextDouble();
			
			System.out.print("Enter r2-x coordinate:");
			double r2x=input.nextDouble();
			
			System.out.print("Enter r2-y coordinate:");
			double r2y=input.nextDouble();
			
			System.out.print("Enter width2:");
			double width2=input.nextDouble();
			
			System.out.print("Enter height2:");
			double height2=input.nextDouble();
			
			double maxDistance1x = Math.abs((width1/2)-(width2/2));
			double maxDistance1y = Math.abs((height1/2)-(height2/2));
			double maxDistance2x = Math.abs((width1/2)+(width2/2));
			double maxDistance2y = Math.abs((height1/2)+(height2/2));
			double realDistanceX = Math.abs(r1x-r2x);
			double realDistanceY = Math.abs(r1y-r2y);
			
			
			System.out.println(maxDistance1x+" "+maxDistance1y+" "+maxDistance2x+" "+maxDistance2y+" "+realDistanceX+" "+realDistanceY);
			if(realDistanceX<=maxDistance1x && realDistanceY<=maxDistance1y && height1>=height2 && width1>=width2) {
				System.out.println("r2 is inside r1");
				}
			else if(realDistanceX > maxDistance2x || realDistanceY > maxDistance2y) {
				System.out.println("r2 does not overlap r1");
				}
			else {
				System.out.println("r2 overlaps r1");
			}
				
			}
			
			
			
		

		private static double Mathpow(double d, int i) {
			// TODO Auto-generated method stub
			return 0;
		}
}
