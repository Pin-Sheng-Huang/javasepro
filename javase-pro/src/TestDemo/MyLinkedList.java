package TestDemo;

import java.util.Random;

/**
 使用java 撰写在MyLinkList类中,开发一个sort方法,支持对练表进行升序排序,写完后需要分别设是对这两个链表排序,
 并分别遍历输出。在MyLinkedList类中,开发一个mergeSort方法,支持将这两个升序排序的链表,再次合并成一个新链表,
 要求心恋表中的节点扔然是递增排序的
 */

public class MyLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        Node index = null;
        int temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public static MyLinkedList mergeSort(MyLinkedList list1, MyLinkedList list2) {
        MyLinkedList mergedList = new MyLinkedList();

        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                mergedList.add(current1.data);
                current1 = current1.next;
            } else {
                mergedList.add(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }
}

 class Main {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        Random r = new Random();

        list1.add(5);
        list1.add(4);
        list1.add(9);
        list1.add(10);

        System.out.println("排序之前的表一:");
        list1.display();
        list1.sort();
        System.out.println("排序之后的表一:");
        list1.display();

        MyLinkedList list2 = new MyLinkedList();
        list2.add(11);
        list2.add(7);
        list2.add(19);
        list2.add(15);
        System.out.println("排序之前的表二:");
        list2.display();
        list2.sort();
        System.out.println("排序之后的表二:");
        list2.display();

        MyLinkedList mergedList = MyLinkedList.mergeSort(list1, list2);
        System.out.println("Merged list:");
        mergedList.display();
    }
}
