import java.util.Scanner;

class NonPrime_1 {
    static int a,b;
    public void getData(){
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = s.nextInt();
        System.out.println("Enter second number : ");
        b = s.nextInt();
        System.out.println("--");
    }
    public static void NonPrime (){
        boolean temp;
        int sum=0;
        for (int i=a;i<=b;i++){
            temp=false;
            for(int j=2; j<=(i/2);j++){
                if(i%j==0){
                    temp=true;
                }
            }
            if(temp==true){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("SUM:"+sum);

    }
    public static void main(String[] args) {
        NonPrime_1 obj =new NonPrime_1();
        obj.getData();
        NonPrime();
    }
       
}
 