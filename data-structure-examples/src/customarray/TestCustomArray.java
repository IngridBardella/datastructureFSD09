package customarray;

import java.util.ArrayList;

public class TestCustomArray {
    public static void main(String[] args) {
//        ArrayList<String> arr  = new ArrayList<>(1);
//        arr.add("A");

        CustomArrayInt customArrayInt = new CustomArrayInt();
        customArrayInt.add(1);
        customArrayInt.add(2);
        customArrayInt.add(3);
        customArrayInt.add(4);
        customArrayInt.add(5);
        System.out.println(customArrayInt);

        System.out.println(customArrayInt.get(0));
        System.out.println(customArrayInt.get(1));
        System.out.println(customArrayInt.get(2));

//        System.out.println(customArrayInt.get(3)); indexoutofbound exception

//        customArrayInt.clear();
//        System.out.println("after clear");
//
//        System.out.println(customArrayInt);

        System.out.println("after insert in index 3");
        customArrayInt.insertAtIndex(100, 3);
        System.out.println(customArrayInt);

        System.out.println("after delete in index 1");
        customArrayInt.deleteByIndex(1);
        System.out.println(customArrayInt);

        System.out.println("after delete in value 4");
        customArrayInt.deleteByValue(4);
        System.out.println(customArrayInt);


        System.out.println("get slice");
        customArrayInt.add(40);
        customArrayInt.add(50);
        customArrayInt.add(60);
        customArrayInt.add(70);
        System.out.println(customArrayInt);

        int[] slice = customArrayInt.getSlice(4, 3);
        for(int e : slice){
            System.out.printf("%d ", e);
        }




        CustomArrayGeneric<Long> customArrayGeneric = new CustomArrayGeneric<>(2);
        customArrayGeneric.add(2L);
        customArrayGeneric.add(1L);


    }
}
