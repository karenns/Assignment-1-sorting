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
public class NodeLinkPrev {
    Node_k head;
    Node_k tail;
    
    public void remove(Person name){
        Node_k temp = head;
        
        while(temp != null){
            if (temp.item_k.equals(name)){
                if (temp == head){
                    head = temp.next_k;
                    head.prev_k = null;
                }else{
                    temp.prev_k.next_k = temp.next_k;
                    temp.next_k.prev_k = temp.prev_k;
                }
                
            }  
            temp = temp.next_k;
        }
        
    }
    public void add(Person value){
        Node_k node = new Node_k();
        node.item_k = value;
        if (head == null){
            head = node;
            tail = head;
        }else{
            tail.next_k = node;
            node.prev_k= tail;
            tail = node;
        }
    }
    /*
    public void addAfter(String value, String after){
        Node_k temp = head;
        
        while(temp != null){
            if (temp.item_k.equals(after)){
                if (temp == head){
                    head = temp.next_k;
                    head.prev_k = null;
                }else if (temp == tail){
                    tail = temp.prev_k;
                    tail.next_k = null;
                    //temp.prev_k.next_k = temp.next_k;
                    //temp.next_k.prev_k = null;
                }
                else{
                    temp.prev_k.next_k = temp.next_k;
                    temp.next_k.prev_k = temp.prev_k;
                }
                
            }  
            temp = temp.next_k;
        }
        
        
        Node_k node = new Node_k();
        node.item_k. = value;
        if (head == null){
            head = node;
            tail = head;
        }else{
            tail.next_k = node;
            node.prev_k= tail;
            tail = node;
        }
    }
    */
    public void display(){
        Node_k temp = head;
        while (temp != null){
            System.out.println(temp.item_k.getName());
            temp = temp.next_k;
        }
    }
    
}
