import java.util.Scanner;

interface fly{
    public abstract void speed();
    public abstract void height();
    //interface里只有方法声明，没有方法体
}
class plane implements fly{
    int speed_plane;
    int height_plane;

    public plane(int speed_plane,int height_plane){
        this.speed_plane=speed_plane;
        this.height_plane=height_plane;
    }
    @Override
    public void speed() {
        // TODO Auto-generated method stub
        System.out.println("speed is "+speed_plane);
    }
    @Override
    public void height() {
        // TODO Auto-generated method stub
        System.out.println("height is "+height_plane);
    }

}
class bird implements fly{
    int speed_bird;
    int height_bird;
    public bird(int speed_bird, int height_bird) {
        this.speed_bird = speed_bird;
        this.height_bird = height_bird;
    }
    @Override
    public void speed() {
        // TODO Auto-generated method stub
        System.out.println("speed is "+speed_bird);
        
    }
    @Override
    public void height() {
        // TODO Auto-generated method stub
        System.out.println("height is "+height_bird);
        
    }

}
class mai{
    public static void main(String[] args) {
        plane p=new plane(100,100);
        bird b=new bird(1000,1000);
        p.height();
        p.speed();
        b.height();
        b.speed();

    }
}



