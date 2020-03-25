/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Oswaldo
 */
public class Bola {
    private int x, y, r;
    private int w, h; 
    boolean ix, iy;

    public Bola() {
        w = 100;
        h = 100;
        ix = false;
        iy = false;
        
        x = new Random().nextInt(w);
        y = new Random().nextInt(h);
        r = 20;
    }
    
    public void draw(Graphics lapiz){
        lapiz.setColor(Color.GRAY);
        lapiz.fillOval(x, y, r, r);
        
        if(x > w){
            ix = false;
        }
        if(x < 0){
            ix = true;
        }
        if(ix){
            x++;
        }else{
            x--;
        }
        
        if(y > h){
            iy = false;
        }
        if(y < 0){
            iy = true;
        }
        
        if(iy){
            y++;
        }else{
            y--;
        }
        
        lapiz.setColor(Color.red);
        lapiz.fillOval(x, y, r, r);
    }
    
}
