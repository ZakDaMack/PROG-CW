package boxorder;

public class TypeFiveBox extends SuperBox {
    
    public TypeFiveBox(){
    }
    
    public TypeFiveBox(double w, double h, double l, int grd, boolean corn,
            boolean bott, boolean tops){
        super(w, h, l, grd, corn, bott, tops);
    }
    
    
    public double sizeCalculator() {
        return super.sizeCalculator();
    }
    
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double bottCost = 0;
        double cornCost = 0;
        double colourCost = 0;
        
        switch (grade) {
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
        
        if(reinforcedCorners)
            cornCost = gradeCost * 0.1;
        
        colourCost = gradeCost * 0.16;
        
        cost = gradeCost + topsCost + bottCost + cornCost + colourCost;
        return cost;            
    }
}
