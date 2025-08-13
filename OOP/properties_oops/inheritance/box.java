package properties_oops.inheritance;

public class box {
    double l;
    double h;
    double w;

    box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;

    }

    box (double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }

    box(double L, double H , double W){
        this.l=L;
        this.h=L;
        this.w=W;
    }

    box(box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }



    
    
}



