/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividaderip;

/**
 *
 * @author Rodrigo
 */
public class Node {
    private int id;
    private int[][] table;
    
    public Node(int id, int[][] table){
        this.id = id;
        this.table = table;
    }
    
    public void rtupdate(){
        
    }
    
    public void printdt(){
        System.out.println("Table of Node "+id);
        System.out.println("------------------------");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
