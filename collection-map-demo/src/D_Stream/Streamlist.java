package D_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-22 17:44
 * @LastEditTime: 2023-04-22 17:44
 */

public class Streamlist {
    public static void main(String[] args) {
        List<String>l = new ArrayList<>();
        Collections.addAll(l,"FUU","UUZ","C","K1","UUX","UUU");
        System.out.println(l);
        
        List<String >lx = new ArrayList<>();
        for (String s : l) {
            if(s.startsWith("K")){
                lx.add(s);
            }
        }
        System.out.println(lx);
        List<String>ly = new ArrayList<>();
        for (String s : l) {
            if(s.length() == 2){
                ly.add(s);
            }
        }
        System.out.println(ly);
        /*Stream*/
        l.stream().filter(s -> s.startsWith("F") && s.length()==3).filter(s -> s.startsWith("U",1)).forEach(s -> System.out.println(s));
        l.stream().filter(s -> s.startsWith("F") && s.length()==3).filter(s -> s.startsWith("U",1)).forEach(System.out::println);
        l.stream().filter(s -> s.startsWith("U",1)).forEach(s-> System.out.println("總數："+s));
        l.stream().filter(s -> s.startsWith("U",1)).limit(2).forEach(s-> System.out.println(s+"所選前兩個"));
        l.stream().filter(s -> s.startsWith("U",1)).skip(2).forEach(s-> System.out.println(s+"跳過前兩個"));
        l.stream().map(s -> "初阳科技:"+s).forEach(System.out::println);//使用map方法中的apply去加字串+变数并打印
        l.stream().map(s -> "初阳科技2:"+s).forEach(s-> System.out.println(s));
        /*stream流中filter过滤器所有值->从s里F开头并前长度等于3再过滤地一个index为U再遍历那个值*/
        long size = l.stream().filter(s->s.length()==3).count();
        System.out.println(size);
        /*--------------------封装到EnglishName实体类--------------**/
        l.stream().map(s ->new EnglishName(s)).forEach(s-> System.out.println(s));
        l.stream().map(EnglishName::new).forEach(System.out::println);//和上方写法一样
        //合并流
        Stream<String>ll= l.stream().filter(s->s.startsWith("F"));
        Stream<String>lll = Stream.of("皇阿玛","小倩");
        Stream<String>llll = Stream.concat(ll,lll);
        llll.forEach(s-> System.out.println(s));

    }
}
