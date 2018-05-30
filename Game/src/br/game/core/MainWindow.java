/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author joaovperin
 */
public class MainWindow extends JFrame {

    /**
     * Config the window
     *
     * @return MainWindow
     */
    public MainWindow config() {
        setBackground(Color.BLACK);
        getContentPane().setBackground(Color.BLACK);
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        return this;
    }

    public void start() {
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
//        g.clearRect(this.getX(), this.getY(), this.getWidth(),this.getHeight());
        g.setColor(Color.red);
        g.setFont(new Font("Inconsolata", Font.PLAIN, 80));
        g.drawString("Hello World", 200, 300);
    }

}
