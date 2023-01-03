import java.util.*;

/**
 * 線形探索
 * 配列aの先頭nの
 */
class SeqSearch
{
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);
        System.out.println("要素数: ");

        int num = stdInt.nextInt();
        int[] x = new int[num]; 

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdInt.nextInt();
        }

        System.out.println("探す値: ");
        int key = stdInt.nextInt();

        int idx = seqSearch(x, num, key);

        if(idx == -1) {
            System.out.println("その値は存在しません。");
        } else {
            System.out.println("その値はx[" + idx + "]にあります。");
        }
    }

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        while (true) {
            if (i == n) {
                return -1;
            } 
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }
}