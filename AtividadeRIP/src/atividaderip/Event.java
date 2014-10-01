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
public class Event {
    private float evtime;
    private int evtype;
    private int eventify;
    private Rtpkt packet;
    
    public Event(float evtime, int evtype, int eventify, Rtpkt packet){
        this.evtime = evtime;
        this.evtype = evtype;
        this.eventify = eventify;
        this.packet = packet;
    }
    
    public float getEvTime(){
        return this.evtime;
    }
    
    public int getEvType(){
        return this.evtype;
    }
    
    public int getEventify(){
        return this.eventify;
    }
    
    public Rtpkt getPacket(){
        return this.packet;
    }
}
