package boxorder;

public abstract class SuperBox {
    double width;
    double height;
    double length;
    int grade;
    int numOfColours;
    boolean reinforcedCorners;
    boolean reinforcedBottom;
    boolean sealableTops;
    double size;
    double cost;
    
    
    public SuperBox(){
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean corn,
            boolean bott, boolean tops ){
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedCorners = corn;
        reinforcedBottom = bott;
        sealableTops = tops;
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean tops ){
        width = w;
        height = h;
        length = l;
        grade = grd;
        sealableTops = tops;
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean bott, boolean tops ){
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedBottom = bott;
        sealableTops = tops;
    }
   
    
    public double sizeCalculator() {
        double base = length * width;
        double side1 = length * height;
        double side2 = width * height;
        size = base + (side1 * 2) + (side2 * 2);
        return size;
    }
    
    public abstract double costCalculator();
    
}
