package com.java.strix;

import com.java.strix.example.Keyboard;
import com.java.strix.example.Monitor;
import com.java.strix.example.Mouse;
import com.java.strix.example.PC;
import com.java.strix.example.SystemUnit;

public class Main {

    public static void main(String[] args) { // ����� �����������

        Tree tree = new Tree();
        /*
         * ��� ����������� ���
         */
        while (tree.getBranchesCount() < 10) {
            tree.grow();
        }

        //System.out.println(tree.getTreeInfo());

        
        
        PC pc = new PC(new SystemUnit("Intel"), new Monitor("Samsung"), new Keyboard("IBM"), new Mouse("Apple"));
        System.out.println(pc.getPCInfo());
        System.out.println(pc.sum(15, 10));
        pc = new PC(new SystemUnit("Intel"), null, new Keyboard("IBM"), null);
        System.out.println(pc.getPCInfo());
        System.out.println(pc.sum(15, 10));
        
        
        
        
        
        
        
        
    }

}
