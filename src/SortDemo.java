public class SortDemo {
    public static void main(String[] args) 
    {
        // Initialize an array of integers to be sorted
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        // Outer loop: start from the end of the array and go to the beginning
        for (int i = arrayOfInts.length; --i >= 0;) 
        {
            // Inner loop: compare each pair of adjacent elements
            for (int j = 0; j < i; j++) 
            {
                // If the current element is greater than the next one, swap them
                if (arrayOfInts[j] > arrayOfInts[j + 1]) 
                {
                    int temp = arrayOfInts[j];         // Store current element in a temporary variable
                    arrayOfInts[j] = arrayOfInts[j + 1]; // Set current element to the next element
                    arrayOfInts[j + 1] = temp;         // Set next element to the stored value (swap)
                }
            }
        }
        // Loop to print the sorted array
        for (int i = 0; i < arrayOfInts.length; i++) 
        {
            System.out.println(arrayOfInts[i] + ""); // Print each element of the sorted array
        }
        System.out.println(); // Print a new line for better output formatting
    }
}


// First Pass (i = 9)

    // j = 0: Compares 32 and 87 – no swap.
    // j = 1: Compares 87 and 3 – swap to {32, 3, 87, ...}.
    // j = 2: Compares 87 and 589 – no swap.
    // ...
    // j = 8: Compares 622 and 127 – swap to {32, 3, 87, 12, 589, 1076, 8, 622, 127, 2000}.
// Second Pass (i = 8)

    // j = 0: Compares 32 and 3 – swap to {3, 32, 87, ...}.
    // j = 1: Compares 32 and 87 – no swap.
    // j = 2: Compares 87 and 12 – swap to {3, 32, 12, 87, ...}.
    // And so forth.
// After multiple passes, the array is fully sorted.

