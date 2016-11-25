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
        double initCost = 0;
        
        switch (grade) {
            case 1: initCost = size * 0.5;
                    break;
            case 2: initCost = size * 0.6;
                    break;
            case 3: initCost = size * 0.72;
                    break;
        }
        
        if(sealableTops)
            initCost *= 1.08;
        
        cost = initCost;
        return cost;            
    }
}
