package java11;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream(); //list를 통해 stream을 생성.
        intStream.forEach(System.out::println);// 스트림은 한 번 생성하면 닫힌다. 1회용임

        Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
        strStream.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        //intStream1.forEach(System.out::println);
        System.out.println(intStream1.sum());
    }
}
