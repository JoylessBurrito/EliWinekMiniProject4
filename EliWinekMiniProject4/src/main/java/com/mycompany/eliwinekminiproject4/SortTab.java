/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eliwinekminiproject4;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author elija
 */
public class SortTab extends Tab {
    private Button clear;
    private Button sort;
    private Button random;
    Random rand = new Random();
    private int listSize = 10;
    int[] unsortedList = new int[listSize];
    int[] sortedList = new int[listSize];
    ArrayList<Label> labels = new ArrayList<Label>();
    
    public SortTab() {
        BorderPane shapeBox = new BorderPane();
    }
    
    
    
}
