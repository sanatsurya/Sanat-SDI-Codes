package PracticeProjects.ArraysReleated;



public class RemoveDuplicateElementsArray {
    public static int removeelemts(int arr[],int n){
        if(n==0||n==1){
            return n;
        }
        int [] temp =new int[n];
        int j=0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i]!= arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        
    }
}
