package main;

import impl.FibCheckable;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        FibCheckable test1 = (int n) -> (sqrt(5 * (n * n) - 4) % 1 == 0);
        FibCheckable test2 = (int n) ->  (sqrt(5 * (n * n) + 4) % 1 == 0);
        int[] arr = {4, 7, 2, 0, 134, 23, 75, 34, 610, 987, 988, 555, 4181, 17711,13};
        System.out.println(Arrays.stream(arr)
                .filter((((IntPredicate) n -> sqrt(5 * (n * n) - 4) % 1 == 0).and(n -> sqrt(5 * (n * n)+4) % 1 == 0)))
                .boxed()
                .collect(Collectors.toList()));
        System.out.print(test1.isFib(12) && test2.isFib(12));
    }
}