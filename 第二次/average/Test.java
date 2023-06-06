import java.util.Scanner;

interface Averagable {
    public abstract double average(double[] value ,int n);//求数组前n个元素的平均值
    public abstract  double average(double[] value);//求数组元素的平均值
}
//实现接口与类之间的类
class AverageAll implements Averagable {

    @Override
    public double average(double[] value, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + value[i];
        }
        //求平均数
        return sum / n;
    }
    @Override
    public double average(double[] value) {
        double sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];
        }
        return sum / value.length;
    }
}

//实现接口与类之间的类
class AverageExceptMaxMin implements Averagable {
    public double averageExceptMaxMin(double[] value) {

        double max = value[0];
        double min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max)
                max = value[i];
            if (value[i] < min)
                min = value[i];
        }
        return (this.average(value) * value.length - min - max) / value.length;
    }

    @Override
    public double average(double[] value, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + value[i];
        }
        //求平均数
        return sum / n;
    }

    @Override
    public double average(double[] value) {
        double sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];
        }
        return sum / value.length;
    }
}
//测试类


public class Test {
    public static void main(String[] args) {
       
        double[] value = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextDouble();
        }
        AverageExceptMaxMin av = new AverageExceptMaxMin();
        System.out.println("去掉最大值和最小值后的平均值："+av.averageExceptMaxMin(value));
        AverageExceptMaxMin b = new AverageExceptMaxMin();
        System.out.println("所有元素的平均值："+b.average(value,5));
    }
}


