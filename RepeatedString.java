public static long repeatedString(String s, long n) {

            long temp = s.length(); 
            long a = (long)(n/temp); 
            long amount = 0 ;
            long result =0 ; 

            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)=='a') {
                    amount++; 
                }
            }

            System.out.println(a + " " + temp + " " + amount); 

            if(a*temp==n) {
                result = a*amount; 
            }

            else {
                int var =0 ; 
               for(int i=0; i<(n-(a*temp)); i++) {
                   if(s.charAt(i)=='a') {
                            var++; 
                   }
               }

               result = a*amount + var ;  
            }

            return result ; 

    }