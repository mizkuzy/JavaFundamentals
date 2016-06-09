package Algorithms;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public abstract class Sort {

    /**
     * This type of sort makes copy of sorting massive  so it uses extra memory.
     */
    public static void mergeSort(Integer[] array) {
        Integer[] tempArray = new Integer[array.length];

        mergeSort(array, tempArray, 0, array.length - 1);
    }

    private static void mergeSort(Integer[] array, Integer[] tempArray, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            int centerIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, tempArray, leftIndex, centerIndex);
            mergeSort(array, tempArray, centerIndex + 1, rightIndex);
            merge(array, tempArray, leftIndex, centerIndex, rightIndex);
        }
    }

    private static void merge(Integer[] array, Integer[] tempArray, int leftIndex, int centerIndex, int rightIndex) {
        int rightBegin = centerIndex + 1;
        int tempPos = leftIndex;
        int elementsAmount = rightIndex-leftIndex+1;

        while (leftIndex <= centerIndex && rightBegin <= rightIndex) {

            if (array[leftIndex] <= array[rightBegin]) {
                tempArray[tempPos++] = array[leftIndex++];
            } else {
                tempArray[tempPos++] = array[rightBegin++];
            }
        }

        while (leftIndex <= centerIndex) {
            tempArray[tempPos++] = array[leftIndex++];
        }

        while (rightBegin != rightIndex) {
            tempArray[tempPos++] = array[rightBegin++];
        }

        for( int i = 0; i < elementsAmount; i++, rightIndex-- )

            array[ rightIndex ] = tempArray[ rightIndex ];
    }
}

