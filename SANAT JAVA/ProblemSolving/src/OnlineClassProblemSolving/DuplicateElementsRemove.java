package OnlineClassProblemSolving;

public class DuplicateElementsRemove {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,6,6};
        int temp= 0;
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]&&i!=j){
                for (int k = 0; k < arr2.length; k++) {
                    arr2[i]= arr[i];
                }
            }
            }
        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
