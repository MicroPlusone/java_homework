import java.util.Scanner;

class point{
    public static int xcoor=0;
    public static int ycoor=0;
    int xcoor(int x){
        xcoor=x;
        return xcoor;
    }
    int ycoor(int y){
        ycoor=y;
        return ycoor;
    }

}
class color extends point{
    public static int red=0;
    public static int green=0;
    public static int blue=0;
    int red(int r){
        red=r;
        return red;
    }
    int green(int g){
        green=g;
        return green;
    }
    int blue(int b){
        blue=b;
        return blue;
    }
}
public class pixel extends color{

    public static void main(String[] args) {
        int temp=0;
        pixel p=new pixel();
        Scanner sc=new Scanner(System.in);
        

        while(true){
            System.out.println(" ");
            System.out.println("What do you want to do?");
            System.out.println("1:input or change x-coor");
            System.out.println("2:input or change y-coor");
            System.out.println("3:input or change red-color");
            System.out.println("4:input or change green-color");
            System.out.println("5:input or change blue-color");
            System.out.println("6:Watch the referance");
            int x=0;
            x=sc.nextInt();
            switch(x){
            
                case 1:
                    System.out.println("Please input the x-coordinate:");
                    temp=sc.nextInt();
                    p.xcoor(temp);
                    break;
                case 2:
                    System.out.println("Please input the y-coordinate:");
                    temp=sc.nextInt();
                    p.ycoor(temp);
                    break;
                case 3:
                    while(true){
                        System.out.println("Please input the red number:(0~255)");
                        temp=sc.nextInt();
                        if (temp>=0&&temp<=255){
                            p.red(temp);
                            break;
                        }else{
                            System.out.println("Re-input!");
                            continue;
                        }
                    }
                    break;
                case 4:
                    while(true){
                        System.out.println("Please input the green number:(0~255)");
                        temp=sc.nextInt();
                        if (temp>=0 && temp<=255){
                            p.green(temp);
                            break;
                        }else{
                            System.out.println("Re-input!");
                            continue;
                        }
                    }
                    break;
                case 5:
                    while(true){
                        System.out.println("Please input the blue number:(0~255)");
                        temp=sc.nextInt();
                        if (temp>=0 && temp<=255){
                            p.blue(temp);
                            break;
                        }else{
                            System.out.println("Re-input!");
                            continue;
                        }
                    }
                    break;
                case 6:
                        System.out.println("The x-coordinate is "+xcoor);
                        System.out.println("The y-coordinate is "+ycoor);
                        System.out.println("The R-color is "+red);
                        System.out.println("The G-color is "+green);
                        System.out.println("The B-color is "+blue);
                    break;
                default:
                System.out.println("Re-input pleasae!");
                break;
            }
        }
    }
}