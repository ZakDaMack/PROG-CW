package boxorder;


/**
 * 
 * @author up788458, up719920, up784374
 */
public class TypeTwoBox extends SuperBox {

    // Constructors
    public TypeTwoBox() {
    }

    public TypeTwoBox(double w, double h, double l, int grd, boolean tops, int quant) {
        super(w, h, l, grd, tops, quant);
        sizeCalculator();
        costCalculator();
    }

    // Methods
    public double sizeCalculator() {
        return super.sizeCalculator();
    }

    // Calculate total cost of boxes
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double colourCost = 0;

        switch (grade) { // Calculate initial cost of box
            case 2:
                gradeCost = size * 0.6;
                break;
            case 3:
                gradeCost = size * 0.72;
                break;
            case 4:
                gradeCost = size * 0.9;
                break;
        }

        if (sealableTops) // Calculate added cost of sealable tops if chosen
        {
            topsCost = gradeCost * 0.08;
        }

        colourCost = gradeCost * 0.13; // Calcualte added cost of adding colours to the box

        cost = (gradeCost + topsCost + colourCost) * quantity; // Calculate total cost
        return cost;
    }
}
