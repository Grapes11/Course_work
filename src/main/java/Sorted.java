
class Sorted {
    /**
     * Данный коэффициент используется
     * при операции сортировки.
     */
    private static final double COEF = 1.25;

    /**
     * @param length длина генерируемого массива
     * @param maxNumber максимальное число в массиве
     * @return возвращает отсортированный массив
     */
        int[] generateArray(final int length, final int maxNumber) {
            int[] newArray = new int[length];
            for (int i = 0; i <= newArray.length - 1; i++) {
                newArray[i] = (int) ((Math.random() * maxNumber + 1));
                System.out.print(newArray[i] + " ");
            }
            return newArray;
        }

    /**
     * @param array входной массив
     * @return отсортированный массив
     */
        int[] combSorted(final int[] array) {
            int c = array.length;
            int d = c;
            int a;
            int b;
            for (int x = 1; d >= 1; x++) {
                for (int i = 0; i + d <= array.length - 1; i++) {
                    if (array[i] > array[i + d]) {
                        a = array[i];
                        b = array[i + d];
                        array[i] = b;
                        array[i + d] = a;
                    }
                }
                d = (int) (c / (COEF * x));
            }
            return array;
        }

    /**
     * @param array входной массив
     */
        void outputArray(final int[] array) {
            System.out.println(" ");
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }

}
