package boxorder;

/**
 * 
 * @author up788458, up719920, up784374
 */
public class TypeThreeBox extends SuperBox {

    // Constructors
    public TypeThreeBox() {
    }

    public TypeThreeBox(double w, double h, double l, int grd, boolean tops, int quant) {
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
        double colourCost = 0;

        switch (grade) { // Calculate initial costs of boxes by size and grade
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

        if (sealableTops) // Calculate additional cost of sealable box if chosen
        {
            topsCost = gradeCost * 0.08;
        }

        colourCost = gradeCost * 0.16;  // Calculate cost of having additional colours

        cost = (gradeCost + topsCost + colourCost) * quantity; // Calculate final cost
        return cost;
    }
}
