public class lab2 {
    public static void main(String[] args) {
        int zaliknumber = 9105;
        int C5 = zaliknumber % 5;
        int C7 = zaliknumber % 7;
        int C11 = zaliknumber % 11;
        System.out.println("Welcome to my program!\nNumber of record book is " + zaliknumber);
        System.out.println("C5 = " + C5);
        System.out.println("C7 = " + C7);
        System.out.println("C11 = " + C11);
        
        short a = 5;
        short sum = 0;

        char[][] array = new char[3][3];
 
		array[0][0] = 43;
		array[0][1] = 67;
		array[0][2] = 54;
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		array[2][0] = 70;
		array[2][1] = 80;
		array[2][2] = 90;
        
        System.out.print("Matrix without a:\n");
        
		for (short i = 0; i < array.length; i++) {
			for (short j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("Matrix with a:\n");
		for (short i = 0; i < array.length; i++) {
			for (short j = 0; j < array[i].length; j++) {
			    array[i][j] *= (char) a;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("Averge value in row:\n");
		for (short i = 0; i < array.length; i++) {
			for (short j = 0; j < array[i].length; j++) {
			    sum += (short) array[i][j];
			}
			System.out.print("The " + (i+(short)1) + "-th row: " + (sum / array[i].length) + "\n");
			sum = 0;
		}
		
		
    }
}