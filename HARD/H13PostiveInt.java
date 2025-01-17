public class H13PostiveInt
{
    public static void main(String[] args) 
    {
        int a[] = new int[]{1, 2, 3, 4};
        int b[] = new int[]{2, 4, 2, 6, 7};
        int len = b.length;
        // Remove duplicates from array b
        for (int i = 0; i < len; i++) 
        {
            for (int j = i + 1; j < len; j++) 
            {
                if (b[i] == b[j]) 
                {
                    // Shift elements to the left to remove the duplicate
                    for (int k = j; k < len - 1; k++) 
                    {
                        b[k] = b[k + 1];
                    }
                    len--;  // Decrease the length
                    j--;  // Decrement j to check the new element at j
                }
            }
        }
        // Print elements of a that are in b
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < len; j++) 
            {
                if (a[i] == b[j]) 
                {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
