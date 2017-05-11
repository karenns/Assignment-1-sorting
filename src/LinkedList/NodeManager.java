/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import assignment.pkg1.sorting.Person;

/**
 *
 * @author W208079293
 */
public class NodeManager {
    public Node_k head;
    public Node_k tail;
    
    public void add(Person person){
        Node_k node = new Node_k();
        node.item_k = person;
        
        if(head == null){
            head = node;
            tail = head;
        }
        else{
            tail.next_k = node;
            tail = node;
        }  
    }
    
    public void display(){
        Node_k temp = head;
        while (temp != null){
            System.out.println(temp.item_k.getAge());
            temp = temp.next_k;
        }
    }
    
    
}
