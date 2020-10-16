package com.company;
import java.util.Scanner;
public class List {
    private
    Node root;
    static int amount = 0;
    public
    List()
    {
        root = null;
        amount=1;
    }
    boolean isEmpty()
    {
        return root==null;
    }
    void addElem()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое хотите поместить в ячейку:");
        int info = sc.nextInt();
        Node temp = new Node(info);
        temp.setNext(root);
        root = temp;
        amount++;
        System.out.println("Добавлено!");
    }
    void delElem(int key)
    {
        Node temp1 = new Node(0);
        Node temp2 = new Node(0);
        temp1 = root;
        temp2 = temp1.getNext();
        int counter = 1;
        if (amount<key) System.out.println("Ячейки с таким идентификатором нет!");
        else {
        while (counter !=key-1)
        {
            temp1 = temp1.getNext();
            temp2  = temp2.getNext();
            counter++;
        }
        temp2 = temp2.getNext();
        temp1.setNext(temp2);
        System.out.println("Удалено!");

        }
    }
    void output()
    {
        Node temp = new Node(0);
        temp = root;
        while (temp!=null)
        {
            System.out.println("Инфо: "+temp.info);
            temp = temp.getNext();
        }
    }
}
