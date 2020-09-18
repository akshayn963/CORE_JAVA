class Q25 { 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0, odd = 0; 
  
       
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
  
        System.out.println("Even elements sum: " + even); 
        System.out.println("Odd elements sum: " + odd); 
    } 
} 
