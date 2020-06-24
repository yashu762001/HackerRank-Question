public static int nonDivisibleSubset(int k, ArrayList<Integer> s) {
        
        ArrayList<Integer> obj = new ArrayList<Integer>() ;
        int maximum =0 ; 

        for(int i=0; i<k; i++) {
            obj.add(0); 
        }

        for(int i=0; i<s.size(); i++) {
            obj.set(s.get(i)%k, obj.get(s.get(i)%k)+1); 
        }

        System.out.println(obj);

        if(obj.get(0)==0) {
            maximum+=0; 
        }

        else {
            maximum+=1 ;
        }

        if(k%2==0) {
            if(obj.get((int)(k/2))!=0) {
                maximum+=1; 
            }

            else {
                maximum+=0; 
            }
        }

        for(int i=1; i<((int)(k/2)+1); i++) {
                if(i!=k-i) {
            maximum+=Math.max(obj.get(i), obj.get(k-i)); 
                }
        }

            return maximum ; 
            
    }

}
                          // Method 1 : Preferrable.       
//  Basically I am storing the remainder values in a array list named obj.
//  This arraylist contains the record of all possible remainders between 0 and k-1.
//  Now i will choose only 1 number with 0 remainder if it exists otherwise 0.
//  If k is even then the list may have a number which gives k/2 as remainder on dividing with k. So if such numbers are more than 1 then i will choose only 1.
//  For rest i wil choose numbers with i remainder or k-i remainder since if both of them choosen will get divisible by k.

                        // Method 2 : Brute Force.
//  There is one more approach ie the Brute Force Approach.
//  I will add one element in a sequence. For example list is [1,9,23,45,67,69,89] then i will first add 1 into it. Then check for consecutive numbers such that the sum is not
// divisble by k. If this is so i will add it. Then I will move ahead and now check the sum of this new number with all the pre existing numbers in the created list.
// When I will iterate completely through the list i will record the size of this list and will empty the list by using list.removeAll(list) comand in java.
// After that I will choose next number in the above list ie 9 and iterate starting from 23 till end of list. If now the size comes more than the previous one i will update
// it else empty the list and chose next number.

// This method is larger lists. So this is not preferred. But yaa!! This is also a right approach.
