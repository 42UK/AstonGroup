package Simply.Arrays;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    /**
     * Проверяет, содержит ли массив целых чисел дубликаты.
     *
     * <p> Метод сравнивает длину исходного массива с размером множества,
     * созданного из элементов массива. Если длины различаются, это означает,
     * что в массиве есть дубликаты.</p>
     *
     * @param nums массив целых чисел для проверки на наличие дубликатов
     * @return {@code true}, если в массиве есть дубликаты;
     * {@code false} в противном случае
     */
    public static boolean containsDuplicate(int[] nums) {
        return nums.length != Stream.of(nums)
                .collect(Collectors.toSet())
                .size();
    }


}
