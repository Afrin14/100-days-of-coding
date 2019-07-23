class InsertionSort { 
    
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
    }

    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; ++i) { 
            int key = arr[i]; 
            int j = i; 
  
            while (j > 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }  
} 