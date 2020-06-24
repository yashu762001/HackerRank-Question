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
