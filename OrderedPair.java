
public class OrderedPair
{
    double X,Y;

    OrderedPair(){
        X=0;
        Y=0;
    }

    OrderedPair(double a, double b){
        X=a;
        Y=b;
    }
    
    /* OrderedPair(double X, double Y){
      this.X=X;
        this.Y=Y;
        */

    public String toString(){
        return "("+X+","+Y+")";
    }

    public double getX(){
        return X;
    }
     public double getY(){
        return Y;
    }
}
