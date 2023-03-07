/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.walker;

import java.util.ArrayList;

/**
 *
 * @author tomme
 */
public class Route {
    private String name;
    private String description;
    private String image;
    private String lenght;
    private String bestDate;
    private String bestTime;
    private String type;

    public Route(String name, String description, String image, String lenght, String bestDate, String bestTime, String type) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.lenght = lenght;
        this.bestDate = bestDate;
        this.bestTime = bestTime;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getLenght() {
        return lenght;
    }

    public String getBestDate() {
        return bestDate;
    }

    public String getBestTime() {
        return bestTime;
    }

    public String getType() {
        return type;
    }

    
    
}
