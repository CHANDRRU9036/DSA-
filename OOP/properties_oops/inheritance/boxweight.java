package properties_oops.inheritance;


public class boxweight extends box {
    double weight ;

    public boxweight(){
        this.weight=-2;
    }

    public boxweight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight=weight;
    }
    
    public boxweight(boxweight other ){
        this.weight= other.weight;
    }
    
}
