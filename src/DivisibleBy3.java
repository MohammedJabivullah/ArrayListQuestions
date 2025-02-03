public class DivisibleBy3 {
    public static void main(String[] args) {
        /*
         * Write a program that returns the list of elements 
         * that are present in the below given list and are divisible by 3.
         * 
         * 
         * if number is divisible by 3 add them in list and return the arrayList
         */
        int a[] = {12,4,9,21,23,28,15,19,25,32,6};
        
        ArrayList<Integer> A = new ArrayList<Integer>();


        for(int i=0;i<a.length;i++) {
            if((a[i]%3==0)){
                A.add(a[i]);
            }
        }

        for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+" ");
        }
    }

}
