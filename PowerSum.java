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

// This is just a function. You would have to give input on your own by creatin gmain function.

// The Logic of this problem is to keep choosing numbers. That is either i will choose 1 or not then if i won't choose i will call for 2 and apply same previous condition.
// If i will choose 1 then the number will decrease by 1 and i will call the same function with changed value of X and check for 2. 

// Like wise if p^N<X we will return what is defined above.
// if p^N==X then only 1 number exists to bring this sum thus we returned 1.
// Else in remaining case we will return 0 since such a positive number won'y exist.
