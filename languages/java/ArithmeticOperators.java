/**
 * Example 45 - Arithmetic Operators
 */
class ArithmeticOperators {
    int mul(int a,int b){
        int result0=a*b;
        System.out.println(result0);
        return result0;
    }
    int div(int a,int b)
    {
        int result1=a/b;
        System.out.println(result1);
        return result1;
    }
    int mod(int a,int b)
    {
       int modResult=a%b;
        System.out.println(modResult);
        return modResult;
    }
    int addsub(int a,int b){
        int result2= a+b;
        int result3=a-b;
        System.out.println(result2);
        System.out.println(result3);
        return 0;
    }

    public static void main(String[] args) {
        int max = 2147483647;
        int min = -2147483638;
     ArithematicOperators k=new ArithematicOperators();
        k.mul(10,13);
        k.div(10,13);
        k.mod(10,13);
        k.addsub(10,13);
       
    }
}
