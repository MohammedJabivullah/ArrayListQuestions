public class UniqueElement {
    public static void main(String[] args) {
        /*
         * Given an Array of integers A, every element in it is repeated twice except one, find that unique element.
         */
        int a[] = {4,2,2,1,4,1,3,8,9,8,9};

        int U = 0;
        
        for(int i=0;i<a.length;i++){
           U = U^a[i];
        }
        System.out.println(U);
    }
}
