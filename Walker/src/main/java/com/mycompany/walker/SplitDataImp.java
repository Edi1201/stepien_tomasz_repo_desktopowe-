package com.mycompany.walker;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomme
 */
public interface SplitDataImp {
    public ArrayList<String> getData();
    public ArrayList<String> getNames(ArrayList<String> routesSplitted);
    public ArrayList<String> getDescription(ArrayList<String> routesSplitted);
    public ArrayList<String> getImages(ArrayList<String> routesSplitted);
    public ArrayList<String> getLengths(ArrayList<String> routesSplitted);
    public ArrayList<String> getBestDates(ArrayList<String> routesSplitted);
    public ArrayList<String> getBestTimes(ArrayList<String> routesSplitted);
    public ArrayList<String> getTypes(ArrayList<String> routesSplitted);
}
