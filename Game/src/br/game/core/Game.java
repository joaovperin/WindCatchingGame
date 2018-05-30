/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.core;

/**
 * Game
 *
 * @author joaovperin
 */
public class Game implements Runnable {

    @Override
    public void run() {
        new MainWindow().config().start();
    }

}
