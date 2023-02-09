package introduction100.day2;

// 분수의 덧셈

// 문제 설명
//  첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

// 제한사항
// 0 <numer1, denom1, numer2, denom2 < 1,000

public class Q007 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        //분자
        answer[0] = numer1 * denom2 + numer2 * denom1;
        //분모
        answer[1] = denom1 * denom2;

        //최대 공약수 구하기
        int min = Math.min(answer[0], answer[1]);
        int max = 0;

        // min만큼 반복문을 돌며 가장 큰 값으로 나누어 떨어지는 것이 최대 공약수가 됨
        for(int i = 1; i <= min; i++){
            if(answer[0]%i == 0 && answer[1]%i == 0){
                max = i;
            }
        }

        // 각 분모 분자를 최대 공약수로 나눠줘서 기약분수 만들기
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
