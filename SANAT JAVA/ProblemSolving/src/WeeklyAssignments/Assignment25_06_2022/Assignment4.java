package WeeklyAssignments.Assignment25_06_2022;
//Find the sum of positive numbers in array
public class Assignment4 {
    public static void main(String[] args) {
        int sum =0;
        int arr[]={2,3,4,5,7,9,1,11,13,-1,-45,-5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
