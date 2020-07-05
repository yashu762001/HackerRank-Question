public static void floodFill(int a[][], int r, int c, int newcolor, int prev)
 {
        int row = a.length; 
   
     int col = a[0].length; 
        
      
  if(r<0||r>=row||c<0||c>=col){
  
           return; 
        
}
        
     
   if(a[r][c]!=prev) {
    
        return; 
      
  }
        


        
        
        else {
      
      a[r][c] = newcolor ;
        
    floodFill(a, r-1, c, newcolor, prev); 
    
        floodFill(a, r+1, c, newcolor, prev); 
       
     floodFill(a, r, c-1, newcolor, prev); 
         
   floodFill(a, r, c+1, newcolor, prev); 
        
}
    

}