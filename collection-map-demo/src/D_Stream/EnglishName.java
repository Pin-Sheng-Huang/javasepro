package D_Stream;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-23 13:27
 * @LastEditTime: 2023-04-23 13:27
 */

public class EnglishName {
private String name;

    @Override
    public String toString() {
        return "EnglishName名字{" +
                "name='" + name + '\'' +
                '}';
    }

    public EnglishName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnglishName(String name) {
        this.name = name;
    }
}
