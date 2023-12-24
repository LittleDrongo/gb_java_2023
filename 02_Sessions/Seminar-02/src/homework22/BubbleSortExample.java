package homework22;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = {9, 3, 4, 8, 2, 5, 7, 1, 6, 10};

//        System.out.println("Исходный массив:");
//        printArray(array);


        bubbleSort(array);

//        System.out.println("\nОтсортированный массив:");
//        printArray(array);
    }

    // Метод для печати элементов массива
    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Метод для реализации пузырьковой сортировки
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1 - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Сравниваем соседние элементы и меняем их местами, если они находятся в неправильном порядке
                if (array[j] > array[j + 1]) {
                    // Обмен значений
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            printArray(array);
            System.out.println();
        }
    }
}
