class SwapTwoNumber{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
       // int c = 0;

        System.out.println("Before Swapping a:"+a);
        System.out.println("Before Swapping b:"+b);

        //swap two number using 3rd variable 
        // c = a;
        // a = b;
        // b = c;

        //swap two number without 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);


    }
}
