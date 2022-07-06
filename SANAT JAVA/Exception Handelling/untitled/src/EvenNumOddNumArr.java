public class EvenNumOddNumArr {
    public static void main(String [] args){
        int a1[] = new int[100];
        int count = 0;
        for(int i = 1; i< a1.length; i++)
        {
            a1[i] = count;
            count++;
//            System.out.println(count);
            if(count%2 == 0){
                System.out.println("The even number is "+count);
            }
            else if(count%2 != 0)
                System.out.println("The odd numbers is " + count);
            else
                System.out.println("Your input strings are invalid");

        }
    }
}
