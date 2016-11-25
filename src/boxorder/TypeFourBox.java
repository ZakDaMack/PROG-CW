package boxorder;

public class TypeFourBox extends SuperBox {
    
    public TypeFourBox(){
    }
    
    public TypeFourBox(double w, double h, double l, int grd, boolean bott,
            boolean tops){
        super(w, h, l, grd, bott, tops);
    }
    
    
    public double sizeCalculator() {
        return super.sizeCalculator();
    }
    
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double bottCost = 0;
        double colourCost = 0;
        
        switch (grade) {
            case 2: gradeCost = size * 0.6;
                    break;
            case 3: gradeCost = size * 0.72;
                    break;
            case 4: gradeCost = size * 0.9;
                    break;
            case 5: gradeCost = size * 1.4;
                    break;
        }
      
        if(sealableTops)
            topsCost = gradeCost * 0.08;
        
        if(reinforcedBottom)
            bottCost = gradeCost * 0.14;
        
        colourCost = gradeCost * 0.16;
        
        cost = gradeCost + topsCost + bottCost + colourCost;
        return cost;            
    }
}
