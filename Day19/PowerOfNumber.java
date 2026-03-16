public class PowerOfNumber{
    static int power(int base, int exp){

        if(exp==0) 
            return 1;
        // using recursion......
        return base*power(base , exp-1);

    }

    public static void main(String[] args) {
        int result = power(5,3);
        System.out.println(result);
    }
}