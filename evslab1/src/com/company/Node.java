package com.company;
import java.util.Scanner;
public class Node {
    private
    Node next;
    int info;
    public
    Node(int info)
    {
        this.info = info;
    }
    int getInfo()
    {
        return this.info;
    }
    void setInfo(int num)
    {
        this.info = num;
    }
    Node getNext()
    {
        return this.next;
    }
    void setNext(Node node)
    {
        this.next = node;
    }
}
