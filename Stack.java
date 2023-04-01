package stackgerceklestirmesi;

import java.util.Arrays;
//tek başına bu çalışmayı yap.

/**
 *
 * @author belkizozbek
 */
public class Stack {

    public static final int MAX_STACK_SIZE = 5;
    boolean bosmu = true;
    boolean doldumu = false;
    int location = 0;

    String[] array = new String[MAX_STACK_SIZE];

    //Put element on the top
    public void push(String newElement) {

        if (!doldumu) {
            array[location] = newElement;
            location++;
            bosmu = false;
            if (location == MAX_STACK_SIZE) {
                doldumu = true;
            }
        } else {
            System.out.println("Array max kapasiteye ulaştı, ekleme yapılamaz!!");
        }
    }
    //Pop element from the top

    public void pop() {

        if (!bosmu) {
            array[location] = null;
            location--;
        } else {
            System.out.println("Olmayan eleman nasıl çıksın gardaş, etmmea!");
        }
    }

    //Remove all elements from stack
    public void clear() {
        Arrays.fill(array, null);

    }

    //Is stack empty
    public boolean isEmpty() {

        return bosmu;
    }

    //Is stack full
    public boolean isFull() {

        return doldumu;
    }

    //How many elements in stack
    public int size() {

        return location;
    }

    //Capacity of stack
    public int getCapacity() {
        return MAX_STACK_SIZE;
    }

    //Output the elements in the stack
    public void showElements() {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
