package boxorder;

public class TypeTwoBox extends SuperBox {
    
    public TypeTwoBox(){
    }
    
    public TypeTwoBox(double w, double h, double l, int grd, boolean tops){
        super(w, h, l, grd, tops);
    }
    
    
    public double sizeCalculator() {
        return super.sizeCalculator();
    }
    
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        double colourCost = 0;
        
        switch (grade) {
            case 2: gradeCost = size * 0.6;
                    break;
            case 3: gradeCost = size * 0.72;
                    break;
            case 4: gradeCost = size * 0.9;
                    break;
        }
      
        if(sealableTops)
            topsCost = gradeCost * 0.08;
        
        colourCost = gradeCost * 0.13;
        
        cost = gradeCost + topsCost + colourCost;
        return cost;            
    }
}
