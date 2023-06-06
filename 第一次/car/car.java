
public class car{
    public static void color(){
        System.out.println("The color is red!");
    }
    public void price(){
        System.out.println("The price is 100000!");
    }
    public static void model(){
        System.out.println("The model is qwerty!");
    }
    public static void main(String[] args) {
        car c = new car();
        car.color();
        car.model();
        
        car.color();
        c.price();
        car.model();
    }
}

class patrol extends car{
    public void horsepower(){
        System.out.println("The horsepower is 10000!");
    }
    public static void main(String[] args) {
        patrol p1= new patrol();
        p1.color();
        p1.price();
        p1.model();
        p1.horsepower();
    }
}

