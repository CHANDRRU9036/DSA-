package properties_oops.inheritance;

public class boxprise extends boxweight {
    double cost ;

    boxprise(){
        super();
        this.cost= -1;
         
    }
    boxprise(boxprise other){
        super(other);
        this.cost=other.cost;
    }


    boxprise(double l , double h , double w,double weight,double cost ){
        super(l,h,w,weight);
        this.cost=cost;
    }
}
