abstract public class car{
    public abstract String run();
}
class bike extends car{
    public String run(){
        return "自行车在跑";
    }
}
class vehicle extends car{
    public String run(){
        return "汽车在跑";
    }
}
class mai{
    public static void main(String[] args) {
        car bike1=new bike();
        car vehicle1=new vehicle();
        System.out.println(bike1.run());
        System.out.println(vehicle1.run());
    }
}
