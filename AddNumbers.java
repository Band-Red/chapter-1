public class AddNumbers {
    public static void main(String[] args){
    int num=5;
    long sum = num +a(num);
    System.out.println(sum);
    }
    public static void a(int num){
        if(num==0){
            System.out.println(num);
        }
        else if(num!=0){
           System.out.println((num-1));
           a(num-1);
        }
        else{
           System.out.println(0);
        }
    }
}