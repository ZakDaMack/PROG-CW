package boxorder;

public abstract class SuperBox {
    double width, height, length;
    int grade;
    int numOfColours;
    boolean reinforcedCorners, reinforcedBottom;
    boolean sealableTops;
    double size;
    double cost;
    int quantity;
    
    // Constructors
    public SuperBox(){
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean corn,
            boolean bott, boolean tops, int quant){
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedCorners = corn;
        reinforcedBottom = bott;
        sealableTops = tops;
        quantity = quant;
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean tops, int quant){
        width = w;
        height = h;
        length = l;
        grade = grd;
        sealableTops = tops;
        quantity = quant;
    }
    
    public SuperBox(double w, double h, double l, int grd, boolean bott, boolean tops, int quant){
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedBottom = bott;
        sealableTops = tops;
        quantity = quant;
    }
   
    // Methods
    // Calculates total surface area of the box
    public double sizeCalculator() {
        double base = length * width;
        double side1 = length * height;
        double side2 = width * height;
        size = base + (side1 * 2) + (side2 * 2);
        return size;
    }
    
    public double getCost(){
        return cost;
    }
    
    // Calculates total cost of each box
    public abstract double costCalculator();
    
}
