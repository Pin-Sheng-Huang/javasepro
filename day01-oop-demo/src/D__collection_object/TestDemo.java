package D__collection_object;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-19 19:32
 * @LastEditTime: 2023-03-19 19:32
 */

public class TestDemo {
    public static void main(String[] args) {
        //定义电影类

        //定义一个对象存储3疙电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("神鬼奇航1","神鬼诡奇奇航",4.6,"基努李维"));
        movies.add(new Movie("神鬼奇航2","神鬼诡奇奇航",4.6,"基努李维"));
        movies.add(new Movie("神鬼奇航3","神鬼诡奇奇航",4.6,"基努李维"));
        System.out.println("类加上重写toString方法:"+movies);//不然吼回是地址
        //便立即和容器中的每个对象
        for(Movie m : movies){
            System.out.println("片名:"+ m.getName());
            System.out.println("描述:"+ m.getDescription());
            System.out.println("评分:"+ m.getStar());
            System.out.println("演员:"+ m.getActors());
        }

        movies.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.print(movie.getActors()+",");
                System.out.print(movie.getDescription()+",");
                System.out.print(movie.getStar()+",");
                System.out.print(movie.getActors());
            }
        });
        System.out.println("----");
        movies.forEach(movie-> {
                System.out.print(movie.getActors()+",");
                System.out.print(movie.getDescription()+",");
                System.out.print(movie.getStar()+",");
                System.out.print(movie.getActors());
            }
        );
        System.out.println("----");
        movies.forEach(movie-> {
                    System.out.print(movie.getActors()+",");
                    System.out.print(movie.getDescription()+",");
                    System.out.print(movie.getStar()+",");
                    System.out.print(movie.getActors());
                }
        );

    }
}
