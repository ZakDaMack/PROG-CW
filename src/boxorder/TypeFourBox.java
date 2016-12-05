package boxorder;

/**
 * 
 * @author up788458, up719920, up784374
 */
public class TypeFourBox extends SuperBox {

    // Constructors
    public TypeFourBox() {
    }

    public TypeFourBox(double w, double h, double l, int grd, boolean bott,
            boolean tops, int quant) {
        super(w, h, l, grd, bott, tops, quant);
        sizeCalculator();
        costCalculator();
    }

    // Methods
    public double sizeCalculator() {
        return super.sizeCalculator();
    }

    // Calculates cost of boxes
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double bottCost = 0;
        double colourCost = 0;

        switch (grade) { // Calculates initial cost of box by surface area and grade
            case 2:
                gradeCost = size * 0.6;
                break;
            case 3:
                gradeCost = size * 0.72;
                break;
            case 4:
                gradeCost = size * 0.9;
                break;
            case 5:
                gradeCost = size * 1.4;
                break;
        }

        if (sealableTops) // Additional cost if sealable tops are selected
        {
            topsCost = gradeCost * 0.08;
        }

        if (reinforcedBottom) // Additional cost if reinforced bottom is selected 
        {
            bottCost = gradeCost * 0.14;
        }

        colourCost = gradeCost * 0.16; // Adds cost of adding colours to the box

        cost = (gradeCost + topsCost + bottCost + colourCost) * quantity; // Calculates final cost of boxes
        return cost;
    }
}
