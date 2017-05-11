/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import assignment.pkg1.sorting.Person;

/**
 *
 * @author w208079293
 */
public class NodeLink {

    Node_k head;
    Node_k tail;

    public void remove(Person name) {
        Node_k tail = head;
        Node_k prev = null;
        while (tail != null) {
            if (tail.item_k.equals(name)) {
                if (tail == head) {
                    head = head.next_k;
                } else {
                    prev.next_k = tail.next_k;
                }
            } else {
                prev = tail;
            }
            tail = tail.next_k;
        }

    }

    public void add(Person value) {
        Node_k node = new Node_k();
        node.item_k = value;
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next_k = node;
            tail = node;
        }
    }

    public void display() {
        Node_k temp = head;
        while (temp != null) {
            System.out.println(temp.item_k);
            temp = temp.next_k;
        }
    }

    public static void main(String[] args) {
        NodeLink nl = new NodeLink();
        Person person1 = new Person("Karen", 21);
        nl.add(person1);

        Person person2 = new Person("Alex", 25);
        nl.add(person2);
//        nl.add("Karen");
//        nl.add("Alex");
//        nl.add("Rodolfo");
//        nl.remove("Alex");
        nl.display();
    }
}
