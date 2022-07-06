package WeeklyAssignments.Assignment25_06_2022;
//Put even and odd elements in two separate array
public class Assignment3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        System.out.print("Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
