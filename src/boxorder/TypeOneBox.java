package boxorder;

public class TypeOneBox extends SuperBox {
    
    public TypeOneBox(){
    }
    
    public TypeOneBox(double w, double h, double l, int grd, boolean tops){
        super(w, h, l, grd, tops);
    }
    
    
    public double sizeCalculator() {
        return super.sizeCalculator();
    }
    
    public double costCalculator() {
        double gradeCost = 0;
        double topsCost = 0;
        
        switch (grade) {
            case 1: gradeCost = size * 0.5;
                    break;
            case 2: gradeCost = size * 0.6;
                    break;
            case 3: gradeCost = size * 0.72;
                    break;
        }
        
        if(sealableTops)
            topsCost = gradeCost * 0.08;
        
        cost = topsCost + gradeCost;
        return cost;            
    }
}
