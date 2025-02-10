public class UniqueElement {
    public static void main(String[] args) {
        /*
         * Given an Array of integers A, every element in it is repeated twice except one, find that unique element.
         */
        int a[] = {4,2,2,1,4,1,3,8,9,8,9};
        
        for(int i=0;i<a.length;i++){
            int count = 0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count<2){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
