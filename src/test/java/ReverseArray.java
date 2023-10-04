public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"один", "два", "три", "чотири", "п'ять"};

        System.out.println("Початковий масив:");
        printArray(array);

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Масив після зміни порядку:");
        printArray(array);
    }
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

