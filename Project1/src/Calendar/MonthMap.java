/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

/**
 *
 * @author rleiva
 */

import java.util.HashMap;
import java.util.Map;

public class MonthMap {
    
    private Map<String, String> monthMap = new HashMap<>();
    
    public MonthMap(int year)
    {
        monthMap.put("January", "31");
        if(isLeapYear(year))
            monthMap.put("February", "29");
        else
            monthMap.put("February", "28");
        monthMap.put("March", "31");
        monthMap.put("April", "30");
        monthMap.put("May", "31");
        monthMap.put("June", "30");
        monthMap.put("July", "31");
        monthMap.put("August", "31");
        monthMap.put("September", "30");
        monthMap.put("October", "31");
        monthMap.put("November", "30");
        monthMap.put("December", "31");
    }
    
    public boolean isLeapYear(int year)
    {
        return ((year % 4 == 0) || (year % 100 == 0) && (year % 400 ==0));
    }
    
    public Map<String, String> getMap()
    {
        return monthMap;
    }
}