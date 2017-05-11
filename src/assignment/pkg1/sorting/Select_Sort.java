/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.sorting;

import LinkedList.Node_k;
import LinkedList.NodeManager;

/**
 *
 * @author w208079293
 */
public class Select_Sort {

    public void select_sort(Node_k temp) {
        int i = 0;
        Node_k aux = null;
        NodeManager nm = new NodeManager();

        System.out.println("head: " + temp.item_k.age);
        // System.out.println("temp age: "+ temp.next_k.item_k.age);
        //System.out.println("temp next age " + temp.item_k.age);

        while (temp != null) {
            //for (int j=0; j<=i; j++){

            //}
            if (temp.next_k != null) {
                if (temp.next_k.item_k.age < temp.item_k.age) {
                    if (temp == nm.head) {
                        nm.head = temp;
                    }
                    
                    aux = temp;

                    aux.item_k = temp.item_k;
                    temp.item_k = temp.next_k.item_k;
                    temp.next_k.item_k = aux.item_k;

                }
            }

            //System.out.println(temp.item_k.getAge());
            temp = temp.next_k;
            i++;
        }

    }
}
