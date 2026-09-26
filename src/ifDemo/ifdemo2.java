package ifDemo;

public class ifdemo2 {
    public static void main(String[] args) {
        double price = 1000;
        double discountPrice = 0;
        if(price>0){
            if(price<10) discountPrice = 0;
            if(price<50) discountPrice = 8;
        }
    }
}
