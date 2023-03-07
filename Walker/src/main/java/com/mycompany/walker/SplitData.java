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
public class SplitData implements SplitDataImp{
   
    public ArrayList<String> getData(){
        GetDataFromDatabase db = new GetDataFromDatabase();
        String json = db.loadData();
        String routes = json.substring(1, json.indexOf("\"users\": ["));
        //System.out.print(routes);
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> pos2 = new ArrayList<>();
        for(int i = 0; i < routes.length(); i++) {
            if(routes.charAt(i) == '{') pos.add(i);
            if(routes.charAt(i) == '}') pos2.add(i);
        }

        ArrayList<String> routesSplitted = new ArrayList<>();
        for(int i = 0; i < pos.size(); i++) {
            routesSplitted.add(json.substring(pos.get(i)+2, pos2.get(i)-1));
     
        }
        return routesSplitted;
        
        
        
       
    }
    public ArrayList<String> getNames(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"name\":")+9);
            String finalData = rawData.substring(0, rawData.indexOf("\","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getDescription(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"description\":")+16);
            String finalData = rawData.substring(0, rawData.indexOf("\","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getImages(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"image_url\":")+14);
            String finalData = rawData.substring(0, rawData.indexOf("\","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getLengths(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"length\":")+10);
            String finalData = rawData.substring(0, rawData.indexOf(","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getBestDates(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"best_lap_date\":")+16);
            String finalData = rawData.substring(0, rawData.indexOf(","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getBestTimes(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"best_lap_time\":")+16);
            String finalData = rawData.substring(0, rawData.indexOf(","));
            data.add(finalData);
            
        }
        
        return data;
    }
    public ArrayList<String> getTypes(ArrayList<String> routesSplitted){
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < routesSplitted.size(); i++) {
            String rawData = routesSplitted.get(i).substring(routesSplitted.get(i).indexOf("\"type\":")+9);
            String finalData = rawData.substring(0, rawData.indexOf("\""));
            data.add(finalData);
            
        }
        
        return data;
    }
}
