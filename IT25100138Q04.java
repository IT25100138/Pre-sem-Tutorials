public class IT25100138Q04 {
    public static void main(String[] args) {
        
        int i = 1; 
        while (i <= 5) {
            int j = 1; 
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); 
            i++;
        }

        System.out.println(); 

        
        for (int row = 1; row <= 5; row++) {
            
            for (int s = 1; s <= 5 - row; s++) {
                System.out.print(" ");
            }
            
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

