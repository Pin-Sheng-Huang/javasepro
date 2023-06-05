package collection_test;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-09 12:41
 * @LastEditTime: 2023-04-09 12:41
 */

public class Card {
    private String size;
    private String color;
    private int index; //牌的真正大小

    public Card() {
    }

    public Card(String size, String color,int index    ) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size+color;
    }
}
