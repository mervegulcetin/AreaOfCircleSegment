import java.util.Scanner;

public class AreaOfCircleSegment {

    public static void main(String[] args) {
        int r;
        double PI=3.14;
        double angle;
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the radius of circle: ");
        r=scan.nextInt();

        System.out.print("Please enter the angle of segment: ");
        angle=scan.nextDouble();

        double area=(PI*r*r)*angle/360;

        System.out.println("Area of segment: "+area);
    }
}
