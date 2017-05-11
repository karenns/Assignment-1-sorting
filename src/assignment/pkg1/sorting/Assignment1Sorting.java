/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.sorting;

import LinkedList.NodeManager;

/**
 *
 * @author w208079293
 */
public class Assignment1Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NodeManager nodeManager = new NodeManager();
        
        Person person1 = new Person("Karen",11);
        nodeManager.add(person1);
        
        Person person2 = new Person("Alex",8);
        nodeManager.add(person2); 
        
        Person person3 = new Person("Alex",10);
        nodeManager.add(person3); 
        
        //nodeManager.display();
        
        Select_Sort sort = new Select_Sort();

        System.out.println(nodeManager.head);
        
        sort.select_sort(nodeManager.head);
        nodeManager.display();
        
    }
    
}
