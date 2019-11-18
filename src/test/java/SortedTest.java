import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;


public class SortedTest {

    /**
     * Проверяет, что последний элемент
     * отсортированного массива является
     * наибольшим.
     */
    @Test
    public void test1() {
        int length = 100;
        int maxNumber =15;
        Sorted sorted = new Sorted();
        int[] array = sorted.generateArray(length, maxNumber);
        array = sorted.combSorted(array);
        int a = Arrays.stream(array).max().getAsInt();
        Assert.assertEquals(a, array[length-1]);
    }

    /**
     * Проверка, что сумма всех элементов
     * до сортировки равна сумме всех
     * элементов после сортировки.
     */
    @Test
    public void test2() {
        int length = 100;
        int maxNumber =15;
        Sorted sorted = new Sorted();
        int[] array = sorted.generateArray(length, maxNumber);
        int a = Arrays.stream(array).sum();
        array = sorted.combSorted(array);
        int b = Arrays.stream(array).sum();
        Assert.assertEquals("Сумма элементов массива"
                + " после сортировки изменилась",a,b);
    }

    /**
     * Сравнивает длину массива
     * до сортировки и после.
     */
    @Test
    public void test3() {
        int length = 20;
        int maxNumber =15;
        Sorted sorted = new Sorted();
        int[] array = sorted.generateArray(length,maxNumber);
        array = sorted.combSorted(array);
        int b = array.length;
        Assert.assertEquals("Длина массива разная", length, b);

    }

    /**
     * Сгенерированный массив сортируется
     * с помощью моей сортировки и
     * встроенной сортировки java,
     * полученные массивы сверяются.
     */
    @Test
    public void test4() {
        int length = 100;
        int maxNumber =15;
        Sorted sorted = new Sorted();
        int[] array = sorted.generateArray(length,maxNumber);
        int[] probArray = Arrays.copyOf(array, array.length);
        array = sorted.combSorted(array);
        Arrays.sort(probArray);
        Assert.assertArrayEquals("Сортировка работает не верно",probArray, array);
    }


}