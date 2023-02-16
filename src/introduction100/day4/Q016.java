package introduction100.day4;

// 배열의 평균값

// 문제 설명
// 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 0 ≤ numbers의 원소 ≤ 1,000
// 1 ≤ numbers의 길이 ≤ 100
// 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

import java.util.Arrays;

public class Q016 {
    public double solution1(int[] numbers) {
        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //average()는 OptionalDouble 타입을 리턴.
    //OptionalDouble의 orElse() 메소드를 이용하여,
    //average()가 리턴한 값이 없을 경우, null 대신 0을 리턴하도록 함
    public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
