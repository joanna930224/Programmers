package introduction100.day3;

// 짝수는 싫어요

// 문제 설명
// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ n ≤ 100

public class Q012 {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + n%2];
        int index = 0;
        for (int i = 1; i <= n; i+=2) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}
