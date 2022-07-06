package WeeklyAssignments.Assignment25_06_2022;
//Find secnd largest number in array
public class Assignment1 {
    public static void main(String[] args) {
        int arr[] = {4,6,7,8,9,10,12,14,15,17,18,45,5,3,2,60};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]= temp;
               }
            }
        }
        System.out.println(arr[(arr.length)-2]);
    }
}
