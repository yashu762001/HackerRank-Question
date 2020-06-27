

 public static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

         int temp1 =0 ; 
         int temp2 =0 ; 
         int temp3 =0 ; 
         int temp4 =0 ; 
         int temp5 =0 ; 
         int temp6 =0 ; 
         int temp7 =0 ; 
         int temp8 =0 ; 
         int temp9 =0 ; 
         int temp10 =0 ; 
         int temp11 =0 ; 
         int temp12 =0 ; 
        int total =0 ; 
        if(r_q==1||c_q==1||r_q==n||c_q==n) {
            total = 3*(n-1); 
        }

        else {
                if(r_q+c_q<=n+1) {                    
                        total = 2*(n-1) + r_q + c_q - 2 + n-1 - (Math.abs(r_q-c_q)); 
                   
                }

                else if(r_q+c_q>n+1) {
                       
                    total = 2*(n-1) + ((2*n)-r_q-c_q) + n-1 - (Math.abs(r_q-c_q)); 
                        
                }  
            
        }
 
        for(int i=0; i<k; i++) {
            if(obstacles[i][0]==r_q) {
                if(obstacles[i][1]>c_q) {
                        if((n-obstacles[i][1]+1)>temp1) {
                            temp1 =  (n-obstacles[i][1]+1); 
                        }
                }

                else if(obstacles[i][1]<c_q) {
                        if((obstacles[i][1])>temp2) {
                            temp2 = (obstacles[i][1]) ; 
                        }
                }
            }

            else if(obstacles[i][1]==c_q) {
                if(obstacles[i][0]>r_q) {
                        if((n-obstacles[i][0]+1)>temp3) {
                            temp3 = (n-obstacles[i][0]+1) ;
                        }
                }

                else if(obstacles[i][0]<r_q) {
                        if((obstacles[i][0])>temp4) {
                            temp4 = (obstacles[i][0]);
                        } 
                }
            }

            else if(obstacles[i][1] - obstacles[i][0] == c_q-r_q) {
                if(r_q<=c_q) {
                    if(obstacles[i][1]>c_q) {
                            if((n-obstacles[i][1]+1)>temp5) {
                                temp5 = (n-obstacles[i][1]+1);
                            }
                    }

                    else if(obstacles[i][1]<c_q) {
                            if((obstacles[i][0])>temp6) {
                                temp6 = (obstacles[i][0]);
                            }
                    }
                }

                else if(r_q>c_q) {
                    if(obstacles[i][1]>c_q) {
                            if((n-obstacles[i][0]+1)>temp7) {
                                temp7 = (n-obstacles[i][0]+1);
                            } 
                    }

                    else if(obstacles[i][1]<c_q) {
                            if((obstacles[i][1])>temp8) {
                                temp8 = (obstacles[i][1]);
                            } 
                    }
                }
            }

            else if(obstacles[i][0] + obstacles[i][1] == r_q+c_q) {
                if(r_q+c_q<=n+1) {
                    if(obstacles[i][1]>c_q) {
                            if((obstacles[i][0])>temp9) {
                                temp9 = (obstacles[i][0]);
                            } 
                    }

                    else if(obstacles[i][1]<c_q) {
                            if((obstacles[i][1])>temp10) {
                                temp10 =  (obstacles[i][1]);
                            } 
                    }
                }

                else if(r_q+c_q>n+1) {
                    if(obstacles[i][1]>c_q) {
                            if((n-obstacles[i][1]+1)>temp11) {
                                temp11 = (n-obstacles[i][1]+1);
                            } 
                    }

                    else if(obstacles[i][1]<c_q) {
                            if((n-obstacles[i][0]+1)>temp12) {
                                temp12 = (n-obstacles[i][0]+1);
                            } 
                    }
                }
            }
                
                }
            
         

        total = total - (temp1+temp2+temp3+temp4+temp5+temp6+temp7+temp8+temp9+temp10+temp11+temp12); 

        return total ; 
 