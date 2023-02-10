package introduction100.day3;

// 최빈값 구하기

// 문제 설명
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.

// 제한사항
// 0 < array의 길이 < 100
// 0 ≤ array의 원소 < 1000

import java.util.HashMap;

public class Q011 {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number: array
             ) {
            // getOrDefault(Object key, V DefaultValue)
            // : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            // key : 값을 가져와야 하는 요소의 키
            // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
