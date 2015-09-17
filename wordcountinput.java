/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javatest2015.pkg100;

/**
 *
 * @author ross.bai
 */

import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;
import java.io.*;

public class wordcountinput {
    
    public static void main(String args[])
    {
    
     {
      String s = JOptionPane.showInputDialog("Enter any text.");
      String[] splitted = s.split(" ");
     
      
    Map<String, Integer> hm = new HashMap<String, Integer>();
    int x;

    for (int i = 0; i < splitted.length; i++) {

        if (hm.containsKey(splitted[i])) {
            x = hm.get(splitted[i]);
            hm.put(splitted[i], x + 1);
        } else {
            hm.put(splitted[i], 1);
        }
    }

    for (String key : hm.keySet()) {

        System.out.println(key + " " + hm.get(key));
    }
    
    }
    
    }
      
}
