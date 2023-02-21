package introduction100.day5;

// 배열 뒤집기

// 문제 설명
// 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ num_list의 길이 ≤ 1,000
// 0 ≤ num_list의 원소 ≤ 1,000

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q020 {
    public int[] solution(int[] num_list) {
        //int[] -> List<Integer>로 변환
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        // index 역순으로 정렬
        Collections.reverse(list);
        //List<Integer> -> int[] 다시 변환!
        return list.stream().mapToInt(i->i).toArray();
    }
}
