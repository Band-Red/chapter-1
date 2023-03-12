//Recurtion
public class Focturail{                                             // [طريقة الضرب]برنامج فاكتوريال 
    public static void main(String[] args){
        int num;                                              //أكتب متغير وأضع له قيمة :الخطوة الأولى
        num=9;
        long Focturail=num*MultiNumbers(num);           //متغير ليتم تخزين الناتج فيه :الخطوة الثانية
        System.out.println(Focturail);              //أكتب شرط الطباعة لإظهار الناتج :الخطوة الثالثة
    }
    public static long MultiNumbers(int num){                            //أكتب ميثود :الخطوة الرابعة
        if(num>=1){
        return num* MultiNumbers(num-1);
        }
        else{
        return 1;
        }
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class AddNumber{                                                //[طريقة الجمع] برنامج فاكتوريال
    public static void main(String[] args){
        int number=4;                                           //أكتب متغير وأضع له قيمة :الخطوة الأولى
        int sum=addNumbers(number);                       //متغير ليتم تخزين الناتج فيه :الخطوة الثانية
        System.out.println(sum);                      //أكتب شرط الطباعة لإظهار الناتج :الخطوة الثالثة
        }
    public static int addNumbers(int number){                              //أنشىء ميثود :الخطوة الرابعة
        if(number!=0)                                     // :if الخطوةالخامسة أنشىءشرطين بإستخدام الشرط 
            return number+addNumbers(number-1);           //  إذا كانت الخمسه تساوي الصفر:الشرط الأول 
        else                                                 /*  هل الخمسه لاتساوي :الشرط الثاني  */
            return number;
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Fibonacci series
public class Fibonacci{
    public static long f(long n){
        if(n==0||n==1)
           return n;
        else
            return f(n-1)+f(n-2);
    }
    public static void main(String[] args){
        System.out.println(f(0));
        System.out.println(f(7));
        System.out.println(f(2));
        System.out.println(f(6));
        System.out.println(f(4));
        System.out.println(f(5));
    }
}