/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databut;

/**
 *
 * @author belkizozbek
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 8, 7, 2};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }

            }
        }

        for(int arrays: arr){
            System.out.print(arrays + " ");
        }
    }

}
