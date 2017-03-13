import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//кол-во точек
        Point[] arr=new Point[n];//массив для объектов

        for(int i=0;i<n;i++){//считываем все точки
            arr[i]=new Point(sc.nextDouble(),sc.nextDouble());

        }

        arr[0]=new Point(sc.nextDouble(),sc.nextDouble());
        arr[1]=new Point(sc.nextDouble(),sc.nextDouble());//считали 1-ые две точки
        double max=arr[0].Distanse(arr[1]);//max расстояние будет между двумя первыми

        for(int i=2;i<n-1;i++){
            for(int j=i+1;i<n;i++){//просчитываем всевозможные вариации с точками
                if(max<arr[i].Distanse(arr[j])){
                    max=arr[i].Distanse(arr[j]);//еслт нашли больше, то новый max
                }
            }
        }
        System.out.println(max);//вывод max
    }
}

