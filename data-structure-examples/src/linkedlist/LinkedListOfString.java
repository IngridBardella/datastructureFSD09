package linkedlist;

public class LinkedListOfString {

    private Container start, end;
    private int size = 0;

    private class Container{
        String value;
        Container next;
    }

    public void addToFront(String value){
        Container newNode = new Container();
        newNode.value = value; // providing the value for the node

        if(size == 0){
            start = end = newNode; // they contain the reference of the newly created object
            //newNode.next = null; // IT is not needed to say that
        }
        else{
            newNode.next = start; //points to the ex-first element
            start = newNode; // put start tp the newNode which is the first node now
        }
        size++;
    }

    public void addToEnd(String value){

    }

    public void add(String value, Place place){
        if (place.equals(Place.FIRST)){
            this.addToFront(value);
        }
        else{
            this.addToEnd(value);
        }
    }

    public String get(int index){
        //validate if index is within the range
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        //if index = 0 -> the node at the front
        if(index == 0){
            return start.value;
        }
        //if index = size - 1 -> node at the end
        if(index == size - 1){
            return end.value;
        }
        // node in the middle
        //I need a pointer for navigation
        Container curContainer = start; // using start pointer to navigate from the beginning
        int counter = 0; // to check how many nodes I traversed

        while(curContainer != null){
            if(counter == index){
                return curContainer.value;
            }
            counter ++;

            //IMPORTANT
            curContainer = curContainer.next; // whatever you are looking , take the NEXT container and override the value into
                                                // your pointer
        }
        throw new RuntimeException("No data available");
    }

    public void insertValueAtIndex(int index, String value){

    }

    public void deleteByIndex(int index){

    }

    public boolean deleteByValue(String value){

    }

    public String toString(){

    }

    public String[] toArray(){

    }
}
