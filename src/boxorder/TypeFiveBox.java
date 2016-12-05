package boxorder;

/**
 * 
 * @author up788458, up719920, up784374
 */
public class TypeFiveBox extends SuperBox {

    // Constructors
    public TypeFiveBox() {
    }

    public TypeFiveBox(double w, double h, double l, int grd, boolean corn,
            boolean bott, boolean tops, int quant) {
        super(w, h, l, grd, corn, bott, tops, quant);
        sizeCalculator();
        costCalculator();
    }

    // Methods
    public double sizeCalculator() {
        return super.sizeCalculator();
    }

    // Calculates total cost of boxes
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double bottCost = 0;
        double cornCost = 0;
        double colourCost = 0;

        switch (grade) { // Calculates initial cost of card by surface area and grade
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

        if (sealableTops) // Adds cost if sealable tops are selected
        {
            topsCost = gradeCost * 0.08;
        }

        if (reinforcedBottom) // Adds cost if reinforced bottom is selected
        {
            bottCost = gradeCost * 0.14;
        }

        if (reinforcedCorners) // Adds cost if reinforces corners are selected
        {
            cornCost = gradeCost * 0.1;
        }

        colourCost = gradeCost * 0.16; // Adds cost of having colours on the box

        cost = (gradeCost + topsCost + bottCost + cornCost + colourCost) * quantity; // Calculates final cost
        return cost;
    }
}
