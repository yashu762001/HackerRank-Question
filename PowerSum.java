static int powerSum(int X, int N, int p) {

        if((int)Math.pow(p,N)<X) {
                
            return powerSum(X, N, p+1) + powerSum(X-(int)Math.pow(p,N), N, p+1); 
        }

        else if((int)Math.pow(p,N)==X) {
            return 1; 
        }

        else {
            return 0 ; 
        } 

        

    }