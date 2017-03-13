public class Point{
    //поля координат точки
    private double x;
    private double y;

    //сетеры
    void setX(double x){
        this.x=x;
    }
    void setY(double y){
        this.y=y;
    }
    //гетеры
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    //конструктор от координат Х и У
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    //конструктор по умолчанию (Х=0 У=0)
    Point(){
        this.x=0;
        this.y=0;
    }


    @Override
    public String toString()
    {
        return x+"|"+y;
    }

    double Distanse(Point a){
        return Math.sqrt((a.getX()-this.x)*(a.getX()-this.x)+(a.getY()-this.y)*(a.getY()-this.y));
    }
}

