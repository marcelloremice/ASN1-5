import java.util.Random;
public class IntArray {
    private final int length;
    private final int[] myArray;

    public IntArray(int l){
        length = l;
        myArray = new int[l];
    }
    public void clear(){
        for(int i = 0; i < myArray.length; i++){
            this.myArray[i] = 0;
        }
    }
    public void fillRand(){

        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            this.myArray[i] = random.nextInt(6)+1;
        }
    }

    public int get(int element){
        return myArray [element];
    }
    public boolean isEmpty() {
        for (int j : myArray) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public void set(int element, int newValue){
        myArray[element] = newValue;
    }

    public int size(){
        return length;
    }

    public void sort(){

    }
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append("IntArray Instance data:\n");
        for(int i = 0; i < myArray.length; i++) {
            output.append("Element ").append(i).append(":").append(myArray[i]).append("\n");
        }
                return output.toString();
    }
}