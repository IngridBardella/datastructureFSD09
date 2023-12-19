package array;

public class ArrayExample {
    public static void main(String[] args) {
       int[] arr = new int[10]; // 1 dimension array

       int[][] int2DArray = {{1, 2, 3, 4}, {10, 20}, {100, 200, 300, 400}};

       for (int i=0; i<int2DArray.length; i++){
           for(int j=0; j<int2DArray[i].length; j++){
               System.out.printf("%d ", int2DArray[i][j]);
           }
           System.out.println();
       }

       int[][] int2DArray2 = new int[3][];
        int2DArray2[0] = new int[4];
        int2DArray2[1] = new int[3];
        int2DArray2[2] = new int[1];

        int2DArray2[0][0] = 1;
        int2DArray2[0][1] = 2;
        int2DArray2[0][2] = 3;
        int2DArray2[0][3] = 4;

        int2DArray2[1][0] = 10;
        int2DArray2[1][1] = 20;
        int2DArray2[1][2] = 30;

        int2DArray2[2][0] = 100;


        System.out.println("--------------The second array -------");
        for (int i=0; i<int2DArray2.length; i++){
            for(int j=0; j<int2DArray2[i].length; j++){
                System.out.printf("%d ", int2DArray2[i][j]);
            }
            System.out.println();
        }


        int[][] int2DArray3 = new int[3][];
        int2DArray3[0] = new int[4];
        int2DArray3[1] = new int[3];
        int2DArray3[2] = new int[1];

        System.out.println("--------------The Third array -------");
        for (int i=0; i<int2DArray3.length; i++){
            for(int j=0; j<int2DArray3[i].length; j++){
                System.out.printf("%d ", int2DArray3[i][j]);
            }
            System.out.println();
        }

        int[] myarrDef = new int[5];
        for(int ele : myarrDef){
            System.out.printf("%d ", ele);
        }
        System.out.println("---default boolean");
        boolean[] myarrDefBool = new boolean[5];
        for(boolean ele : myarrDefBool){
            System.out.printf("%b ", ele);
        }

        System.out.println("---default Integer");
        Integer[] myarrDefInteger = new Integer[10];
        for(Integer ele : myarrDefInteger){
            System.out.printf("%d ", ele);
        }
    }
}
