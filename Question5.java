package lab.viva1;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 提示用户输入总数 T
        System.out.print("Enter the number of words to test: ");
        int T = sc.nextInt();

        // 1. 外层循环：循环 T 次
        for (int i = 0; i < T; i++) {

            System.out.print("\nEnter word " + (i + 1) + ": ");
            String word = sc.next().toLowerCase(); // .toLowerCase() 确保只处理小写

            // 2. 假设它是和谐的
            boolean isHarmony = true;

            // 3. 检查规则 1：最后一个字母不能是元音
            char lastLetter = word.charAt(word.length() - 1);
            if (isVowel(lastLetter)) {
                isHarmony = false; // 违反规则 1
            }

            // 4. 检查规则 2：不能有两个连续的元音
            // (如果规则 1 已经失败了，其实可以跳过这一步，但为了逻辑清晰，我们继续检查)
            for (int j = 0; j < word.length() - 1; j++) {
                char current = word.charAt(j);
                char next = word.charAt(j + 1);

                if (isVowel(current) && isVowel(next)) {
                    isHarmony = false; // 违反规则 2
                    break; // 找到一对就够了，立刻停止这个 for 循环
                }
            }

            // 5. 打印最终结果
            if (isHarmony) {
                System.out.println(word + " has: Harmony");
            } else {
                System.out.println(word + " has: Chaos");
            }
        }
    }


    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}