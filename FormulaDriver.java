import java.util.Scanner;

public class FormulaDriver{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //================QUADRATIC ROOT
        System.out.println("a:");
        double a=input.nextDouble();
        System.out.println("b:");
        double b=input.nextDouble();
        System.out.println("c:");
        double c=input.nextDouble();

        OrderedPair roots= findQuadraticRoots(a,b,c);
        System.out.println("The solotions for 1x^2+5x+6 are"+roots);

        //====================SLOPE
        System.out.print("x1:");
        double x1 = input.nextDouble();
        System.out.print("y1:");
        double y1 = input.nextDouble();
        System.out.print("x2:");
        double x2 = input.nextDouble();
        System.out.print("y2:");
        double y2 = input.nextDouble();
        OrderedPair output1 = new OrderedPair(x1, y1);
        OrderedPair output2 = new OrderedPair(x2, y2);
        double slope = findSlope(output1,output2);
        System.out.println("A line between"+output1+"and"+ output2+"has a slope of"+ slope);
        //===========================MIDPOINT
        System.out.print("x1: ");
        x1= input.nextDouble();
        System.out.print("y1: ");
        y1= input.nextDouble();
        System.out.print("x2: ");
        x2= input.nextDouble();
        System.out.print("y2: ");
        y2= input.nextDouble();
        OrderedPair p1 = new OrderedPair(x1, y1);
        OrderedPair p2 = new OrderedPair(x2, y2);
        System.out.println("the midpoint between"+p1+"and"+p2+"is"+findMidpoint(p1,p2));
        //=====================ARITHMETIC SERIES
        int k= input.nextInt();
        System.out.print("Starts with:");
        double a1 = input.nextDouble();
        System.out.print("Increases by:");
        double d = input.nextDouble();;
        double sum = findArithmetic(a, d, k);
        System.out.println("the sum of the first"+k+"terms of an arithmetic series that starts with"+a+"and increase by"+d+"is"+sum);

        //======================GEOMETRIC SERIES
        System.out.print("Number of terms:");
        k = input.nextInt();
        System.out.print("Starting number:");
        a = input.nextDouble();
        System.out.print("Rate of growth:");
        double r = input.nextDouble();
        double result =findGeometricSeriesSum(a, r, k);
        System.out.println("The sum of the first"+k+"terms of a finite"+" geometric series that starts with"+a+"and increases"+" by a rate of " + r + " is " + result + ".");
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have?");
        int n = input.nextInt();
        System.out.println("Rolling a"+n+"-sided die... you got a"+rollDie(n)+"!");
    }

    public static OrderedPair findQuadraticRoots(double a, double b,double c){
        double answer1=(-b+Math.sqrt(Math.pow(2,b)-4*a*c))/(2*a);
        double answer2=(-b-Math.sqrt(Math.pow(2,b)-4*a*c))/(2*a);
        OrderedPair answer =new OrderedPair(answer1, answer2);
        return answer;

    }

    public static double findSlope(OrderedPair output1,OrderedPair output2) {
        return (output2.getY()-output1.getY())/(output2.getX()-output1.getX());
    }

    public static OrderedPair findMidpoint (OrderedPair A,OrderedPair B) {
        double newX= (A.getX()+B.getX())/2;
        double newY= (A.getY()+B.getY())/2;
        OrderedPair answer=new OrderedPair(newX, newY);
        return answer;
    }

    public static double findArithmetic (double A,double D,int K) {
        return (K/2.0)*(2*A+D*(K-1));
    }

    public static double findGeometricSeriesSum (double a, double r, int k) {
        return a*(1-Math.pow(r,k))/(1-r);
    }

    public static int rollDie (int sides) {
        return (int)(Math.random()*sides)+1;
    }
}
