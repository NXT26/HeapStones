import java.util.Scanner;
//У вас есть несколько камней известного веса w1, …, wn.
// Напишите программу, которая распределит камни в две кучи так,
// что разность весов этих двух куч будет минимальной.
//        Ввод содержит количество камней n (1 ≤ n ≤ 20) и веса камней w1, …,
//        wn (1 ≤ wi ≤ 100 000) — целые, разделённые пробельными символами.
//Ваша программа должна вывести одно число — минимальную разность весов двух куч.
//5
//5 8 13 27 14
//ans 3
public class RecursStones {
static int ans = Integer.MAX_VALUE;
public static void ans(int Heap1, int Heap2, int i, int Count, int[] Queue) {
    if (i != Count) {
        ans(Heap1, Heap2 + Queue[i], i + 1, Count, Queue);
        ans(Heap1 + Queue[i],Heap2, i + 1, Count, Queue);
        }
    if (Count == i) {
        ans = Math.min(Math.abs(Heap1 - Heap2), ans);
    }
}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Count  = scanner.nextInt();
        int[] Queue = new int[Count];
        for (int i = 0; i < Count; i++) {
            Queue[i] = scanner.nextInt();
        }
        ans(0,0,0, Count, Queue);
        System.out.println(ans);
        }
}