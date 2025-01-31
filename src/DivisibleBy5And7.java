public class DivisibleBy5And7 {
    public static void main(String[] args) {
        /*
         * Write a program that returns the list of elements 
         * that are present in the below given list and are divisible by 5 and 7.
         * 
         * 
         * if number is divisible by 5 and 7 add them in list and return the arrayList
         */
        int a[] = {5, 7, 70, 50, 35,105,175,15};

         ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++) {
            if((a[i]%5==0)&&(a[i]%7==0)){
                A.add(a[i]);
            }
        }

        for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+" ");
        }
    }

}
