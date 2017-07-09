/*
    ЗАДАЧА:
    1) Считать числа n и k.
    n - длина массива, k - количество потоков.
    Массив заполнить случайными числами от 0 до 100
    2) Посчитать сумму всех элементов массива с помощью k-потоков.
    Каждый поток суммирует свою область массива.
    3) Рекомендации:
    1. Описать свой класс потока
    2. Массив и переменную для результата сделать глобальными на уровне Main
    3. Обеспечить синхронизацию в момент записи значения в переменную результата.
    4. Использовать join для каждого потока, чтобы Main им не мешал
    5. Формула расчета диапазона значений:
    Для каждого i-го потока:
    start = i * (n / k)
    end = start + (n / k)
    Для k-1 потока
    start = (k-1) * (n/k)
    end = n;
    6. Для синхронизации использовать Lock
    lock.lock();
    r = r + a[i];
    lock.unlock();
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int array[];
    private static int sum = 0;

    public static void main(String[] args) {
        final Random random = new Random(0);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println("Enter number of threads: ");
        int k = in.nextInt();

        MyThread threads[] = new MyThread[k];
        for (int i = 0; i < k; i++) {
            threads[i] = new MyThread();
            if (i != k - 1){
                threads[i].count(i*(n/k), (i+1)*(n/k));
            } else {
                threads[i].count((k - 1)*(n/k), n);
            }
            if(threads[i].isAlive())
            {
                try {
                    threads[i].join(); // зачем ита?
                } catch(InterruptedException e) {}
            }
        }

        System.out.println("Sum = " + sum);
    }

    public static int getSum() {
        return sum;
    }

    public static void setSum(int sum) {
        Main.sum = sum;
    }

    public static int[] getArray() {
        return array;
    }
}
