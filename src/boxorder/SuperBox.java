package boxorder;

/**
 *
 * @author up788458, up719920, up784374
 */
public abstract class SuperBox {

    protected double width, height, length;
    protected int grade;
    protected int numOfColours;
    protected boolean reinforcedCorners, reinforcedBottom;
    protected boolean sealableTops;
    protected double size;
    protected double cost;
    protected int quantity;

    // Constructors
    public SuperBox() {
    }

    public SuperBox(double w, double h, double l, int grd, boolean corn,
            boolean bott, boolean tops, int quant) {
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedCorners = corn;
        reinforcedBottom = bott;
        sealableTops = tops;
        quantity = quant;
        sizeCalculator();
        costCalculator();
    }

    public SuperBox(double w, double h, double l, int grd, boolean tops, int quant) {
        width = w;
        height = h;
        length = l;
        grade = grd;
        sealableTops = tops;
        quantity = quant;
        sizeCalculator();
        costCalculator();
    }

    public SuperBox(double w, double h, double l, int grd, boolean bott, boolean tops, int quant) {
        width = w;
        height = h;
        length = l;
        grade = grd;
        reinforcedBottom = bott;
        sealableTops = tops;
        quantity = quant;
        sizeCalculator();
        costCalculator();
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

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getGrade() {
        return grade;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getSize() {
        return size;
    }

    public boolean getCorners() {
        return reinforcedCorners;
    }

    public boolean getBottom() {
        return reinforcedBottom;
    }

    public boolean getTops() {
        return sealableTops;
    }

    public int getColours() {
        return numOfColours;
    }

    // Calculates total cost of each box
    public abstract double costCalculator();

}
