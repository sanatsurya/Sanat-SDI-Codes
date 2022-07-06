package arraylist;
class IndexValueofNum {
    int arr[];

    public static int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }
}
public class IndexValueArrayImplementation {

}

