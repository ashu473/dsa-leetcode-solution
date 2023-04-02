class Solution{
public int[] successfulPairs(int[] spells, int[] potions, long success) {
     // Get the length of the spells and potions array
 int n = spells.length;
 int m = potions.length;
 
 // Get the maximum potion strength
 int max = -1;
 for (int x : potions)
     max = max>x?max:x;
 
 // Count the frequency of potions with a specific strength
 int[] potionsCount = new int[max + 1];
 for (int x : potions)
     potionsCount[x]++;
 
 // Calculate the cumulative frequency of potions with strengths less than or equal to a specific strength
 int count = 0;
 for (int i = max; i >= 0; i--) {
     count += potionsCount[i];
     potionsCount[i] = count;
 }
 
 // Initialize the array to store the number of successful pairs for each spell
 int[] ret = new int[n];
 
 // Iterate through each spell
 for (int i = 0; i < n; i++) {
     // Get the target potion strength for a successful pair with the current spell
     long target = success / spells[i];
     
     // If the target strength is greater than the maximum strength of the potions array, skip to the next spell
     if (target > max)
         continue;
     
     // Increase the target strength until it is greater than or equal to success / spells[i]
     while (target < 100001 && target * spells[i] < success)
         target++;
     
     // If the target strength is greater than the maximum strength of the potions array, skip to the next spell
     if (target > max)
         continue;
     
     // Store the number of successful pairs for the current spell
     ret[i] = potionsCount[(int)target];
 }
 
 // Return the array with the number of successful pairs for each spell
 return ret;
}
}