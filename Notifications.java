 public static int getMedian(int freq[], int d) {
        int temp[] = new int[201]; 
        
        for(int i=0; i<201; i++) {
                if(i==0) {
                    temp[i] = freq[i]; 
                }

                else {
                    temp[i] = temp[i-1] + freq[i]; 
                }
        }

        int a =0 ; int b =0 ; int median =0 ; 

        if(d%2==0) {
            int first =d/2 ;
            int second = first+1; 
            int i=0; 
            for(i=0; i<201; i++) {
                if(first<=temp[i]) {
                    a =i ; 
                    break; 
                }
            }

            for(int j =i ; j<201; j++) {
                if(second<=temp[j]) {
                    b = j ;
                    break; 
                }
            }

            median = a+b;  
        }

        else if(d%2!=0) {
            int first = d/2+1 ; 
            for(int i=0; i<201; i++) {
                if(first<=temp[i]) {
                    a =i ; 
                    break; 
                }
            }

            median = a; 
        }

        return median ;  
    }

    static int activityNotifications(int[] expenditure, int d) {

        int freq[] = new int[201]; 
        boolean first = true;
        int pop = 0 ;  
        int count =0 ; 
        int i=0; 
        for(i=d; i<expenditure.length; i++) {
            if(first) {
                    first = false; 
                for(int j=i-d; j<i; j++) {
                    freq[expenditure[j]]++; 
                }
            }

            else {
                freq[pop]--; 
                freq[expenditure[i-1]]++; 
            }

            int median = getMedian(freq, d); 
            if(d%2==0) {
                if(expenditure[i]>=median) {
                        count++; 
                }
            }

            else if(d%2!=0) {
                if(expenditure[i]>=2*median) {
                    count++; 
                }
            }

            pop = expenditure[i-d] ;
        } 
        return count ;
    }