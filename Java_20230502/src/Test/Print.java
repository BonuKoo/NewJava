package Test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문서 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        
        int[] priorities = new int[n];
        String[] names = new String[n];
        System.out.println("문서 내용과 중요도를 입력하세요.");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 문서 내용: ");
            names[i] = sc.nextLine();
            System.out.print((i + 1) + "번째 문서 중요도: ");
            priorities[i] = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
        }

        System.out.print("내가 인쇄를 요청한 문서의 위치를 입력하세요: ");
        int location = sc.nextInt();

        int answer = ShowmyDoc(priorities, location);
        System.out.println("내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지: " + answer);
    }

    public static int ShowmyDoc(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }

        return count;
    }
}