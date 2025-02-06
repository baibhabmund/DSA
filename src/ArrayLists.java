//add at last
//remove from last
//contains
//find index
//resize
//Add at particular index

public class ArrayLists{
    private int[] values;
    private int size;
    private static final int initial_Capacity = 5;

    public ArrayLists(){
        values = new int[initial_Capacity];
        size = 0;
    }

    public void resizeArray(){
        int newCapacity = initial_Capacity * 2;
        int[] newArr = new int[newCapacity];

        for(int i = 0; i < size; i++){
            newArr[i] = values[i];
        }
        values = newArr;
    }

    public void addAtEnt(int value){
        if(size == values.length){
            resizeArray();
        }
        values[size++] = value;
    }

    public void removeFromLast(int value){
        if(size == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        size--;
    }

    public boolean containsElement(int value){
        for(int i = 0; i < size; i++){
            if(values[i] == value){
                return true;
            }
        }
        return false;
    }
    public int findIndex(int value){
        for(int i = 0; i < size; i++){
            if(values[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void addAtIndex(int index, int value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if(size == values.length){
            resizeArray();
        }
        for(int i = size; i > index; i--){
            values[i] = values[i - 1];
        }
        values[index] = value;
        size++;
    }

    public static void main(String[] args) {
        ArrayLists arr = new ArrayLists();
        arr.resizeArray();
        arr.addAtEnt(10);
        arr.addAtEnt(20);
        arr.addAtEnt(30);
        arr.addAtEnt(40);
        arr.addAtEnt(50);

        arr.removeFromLast(50);

        arr.containsElement(50);

        arr.findIndex(3);

        arr.addAtIndex(4,45);
    }
}