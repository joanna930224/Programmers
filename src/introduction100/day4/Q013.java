package introduction100.day4;

// 피자 나눠 먹기 (1)

// 문제 설명
// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
// 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

// 제한사항
// 1 ≤ n ≤ 100

public class Q013 {
    public int solution(int n) {
        int pizzaPiece = 7;
        int answer = n / pizzaPiece;

        if(n % pizzaPiece == 0){
            return answer;
        }
        return answer + 1;
    }
}
