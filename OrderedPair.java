/*
 * Kang, Aaron
 * September 21st 2023
 * Problem Set 2B
 */

public class OrderedPair {
    private double X;
    private double Y;

    public OrderedPair() {
        X = 0;
        Y = 0;
    }
    
    public OrderedPair(double x, double y) {
        X = x;
        Y = y;
    }

    public String toString() {
        //before overriding the default toString() method, 
        //we get a memory location whereas after overriding the default toString()
        //method, we get the actual X and Y values printed out.
        return X + ", " + Y;
    }
    
    public double getX() {
        return X;   
    }
    
    public double getY() {
        return Y;
    }
}
