package java11;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args){
        // 람다식 : Function<String, Integer> f =  (String s) -> Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100")+200);

        //Supplier<MyClass> s = ()->new MyClass();
        /*Supplier<MyClass> s = MyClass::new;
        MyClass mc = s.get();
        System.out.println(mc);
        System.out.println(s.get());*/

        //Function<Integer, MyClass> s = i -> new MyClass(i);
        Function<Integer, MyClass> s = MyClass::new;
        System.out.println(s.apply(200).iv);

        //Function<Integer, int[]> f2 = i -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;
        System.out.println(f2.apply(5).length);
    }
}
class MyClass{
    int iv;

    MyClass(int iv){
        this.iv = iv;
    }
}