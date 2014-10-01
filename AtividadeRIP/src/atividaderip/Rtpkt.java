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
public class Rtpkt {
    private int sourceId;
    private int destId;
    private int[] mincost;
    
    public Rtpkt(int sourceId, int destId){
        this.sourceId = sourceId;
        this.destId = destId;
        mincost = new int[4]; 
    }
    
    public int getSource(){
        return this.sourceId;
    }
    
    public int getDest(){
        return this.destId;
    }
    
    public int[] getMinCost(){
        return this.mincost;
    }
    
}
