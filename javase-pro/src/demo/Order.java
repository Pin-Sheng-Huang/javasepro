package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-27 13:57
 * @LastEditTime: 2023-06-27 13:57
 */

public class Order {
    private int id;
    private String name;
    private LocalDateTime time;


    public Order(){}

    public Order(int id, String name, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
