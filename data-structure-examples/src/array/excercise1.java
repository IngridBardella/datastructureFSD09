package array;

import java.util.Scanner;

public class excercise1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] data;
        try {
            System.out.println("Please enter the height and width of an array");
            int height = scanner.nextInt();
            int width = scanner.nextInt();

            //validate
            if (width < 1 || height < 1) {
                throw new IllegalArgumentException("the size needs to be more than 1");
            }

            data = new int[width][height];


            //giving random numbers
            for (int row = 0; row < data.length; row++) {
                for (int col = 0; col < data[row].length; col++) {
                    data[row][col] = (int) (200 * (Math.random()));
                }
            }

            for (int row = 0; row < data.length; row++) {
                for (int col = 0; col < data[row].length; col++) {
                    System.out.printf("%s%4d", col == 0 ? "" : ",", data[row][col]);
                }
                System.out.println();
            }

            printSumArray(data);
            printSumRows(data);
            printSumColumns(data, width, height);
            stdDeviation(data);
            findPairsOfPrime(data);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void findPairsOfPrime(int[][] data) {
        for(int row=0; row< data.length ;row++){
            for(int col= 0; col<data[row].length; col++){
                for(int row2= row; row2< data.length; row2++){
                    for(int col2= col + 1; col2 < data[row2].length; col2++){
                        int val = data[row][col] + data[row2][col2];
                        if(isPrime(val)){
                            System.out.printf("prime sum %d of [%d, %d][%d, %d]",val, row, col, row2, col2 );
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

    private static boolean isPrime(int number){
        for(int n =2 ; n< Math.sqrt(number); n++){
            if(number % n == 0){
                return false;
            }
        }
        return number > 2 ;
    }

    private static void stdDeviation(int[][] data) {
        double sum=0;
        //avg = sumArray / width * height
        double avg = sumArray(data) / (double) data.length * data[0].length;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += Math.pow(data[row][col] - avg, 2);
            }
        }

        double v = sum / (data.length * data[0].length) - 1;
        double std = Math.sqrt(v);
        System.out.printf("std is %.3f \n", std);
    }

    private static void printSumColumns(int[][] data, int width, int height) {

        for(int j=0; j< height; j++){
            int colSum=0;
            for(int i=0; i< width; i++){
                colSum += data[i][j];
            }
            System.out.printf("sum of col %d: %d \n", j, colSum);
        }
    }

    private static void printSumRows(int[][] data) {
        //whenever you need to know the index of array
        for(int row=0 ; row<data.length ; row++){
            int sumOfEachRow = 0;
            for(int col=0 ; col< data[row].length ; col++){
                sumOfEachRow += data[row][col];
            }
            System.out.printf("the sum of the row %d is: %d", row+1, sumOfEachRow);
            System.out.println();
        }
    }

    private static void printSumArray(int[][] data) {

        System.out.printf("The sum of all elements is : %f", sumArray(data));
        System.out.println();
    }

    private static double sumArray(int[][] data){
        int sum = 0;
        for(int[] dataNum: data){
            for(int element:dataNum){
                sum += element;
            }
        }
        return sum;
    }


}
