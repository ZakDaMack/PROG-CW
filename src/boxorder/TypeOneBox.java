package boxorder;

public class TypeOneBox extends SuperBox {

    // Constructors
    public TypeOneBox() {
    }

    public TypeOneBox(double w, double h, double l, int grd, boolean tops, int quant) {
        super(w, h, l, grd, tops, quant);
        sizeCalculator();
        costCalculator();
    }

    // Methods
    public double sizeCalculator() {
        return super.sizeCalculator();
    }

    // Calculate cost of boxes
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;

        switch (grade) {   // Calculate initial cost of box by grade and size
            case 1:
                gradeCost = size * 0.5;
                break;
            case 2:
                gradeCost = size * 0.6;
                break;
            case 3:
                gradeCost = size * 0.72;
                break;
        }

        if (sealableTops) // Adds the cost of sealable tops if the option is taken
        {
            topsCost = gradeCost * 0.08;
        }

        cost = (topsCost + gradeCost) * quantity; // Calculates total cost
        return cost;
    }
}
