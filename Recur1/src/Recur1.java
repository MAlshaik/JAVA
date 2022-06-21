public class Recur2 {
    public static void main(String[] args) {

    }
    public static int fun1(int x){
        if(x<1)
            return x;
        else
            return x + fun1(x-3);
    }

    public static int fun2(int x, int y){
        if(x<=1)
            return  y;
        else
            return fun2(x-1,y-1)+y;
    }

    public static int fun3(int x){
        if(x<1)
            return x;
        else
            return x + fun3(x-2);
    }

    public static int fun4(int x){
        if(x<1)
            return 1;
        else
            return x+fun4(x-1)+fun4(x-2);
    }
}
