package lab.viva1;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 1. 读取并【验证】查询总数 T ---
        int T;
        do {
            System.out.print("Enter number of queries (1-50): ");
            T = sc.nextInt();

            // 检查：如果 T 不在 1 到 50 的范围内，就打印错误
            if (T < 1 || T > 50) {
                System.out.println("Invalid input. T must be between 1 and 50.");
            }
        } while (T < 1 || T > 50); // 只要 T 无效，就一直循环

        // 2. 外层循环：运行 T 次
        for (int i = 0; i < T; i++) {

            System.out.println("\n--- Query " + (i + 1) + " ---");

            // --- 3. 读取并【验证】H ---
            int H;
            do {
                System.out.print("Enter Height (H) (1-9): ");
                H = sc.nextInt();

                // 检查：如果 H 不在 1 到 9 的范围内，就打印错误
                if (H < 1 || H > 9) {
                    System.out.println("Invalid input. H must be between 1 and 9.");
                }
            } while (H < 1 || H > 9); // 只要 H 无效，就一直循环


            char S; // 临时变量

            // 4. 【输入验证循环】(你原来的代码，是正确的！)
            do {
                System.out.print("Enter Style (A or P): ");
                S = sc.next().charAt(0); // 读取 "a", "P", "x" 等

                // 统一转换成大写 ( 'a' -> 'A', 'p' -> 'P' )
                S = Character.toUpperCase(S);

                // 检查：如果它既不是 'A' 也不是 'P'，就打印错误
                if (S != 'A' && S != 'P') {
                    System.out.println("Invalid style. Please re-enter.");
                }

            } while (S != 'A' && S != 'P'); // 只要不是 A 并且也不是 P，就一直循环


            // 5. 【立即打印】
            // (这部分代码保持不变)
            if (S == 'A') {
                // --- Logic for Style 'A' (Angled) ---
                for (int row = 1; row <= H; row++) {
                    for (int j = 1; j <= row; j++) {
                        System.out.print(row);
                    }
                    System.out.println();
                }

            } else if (S == 'P') {
                // --- Logic for Style 'P' (Pyramid) ---
                for (int row = 1; row <= H; row++) {
                    for (int s = 1; s <= H - row; s++) {
                        System.out.print(" ");
                    }
                    for (int asc = 1; asc <= row; asc++) {
                        System.out.print(asc);
                    }
                    for (int desc = row - 1; desc >= 1; desc--) {
                        System.out.print(desc);
                    }
                    System.out.println();
                }
            }
        }
    }
}

