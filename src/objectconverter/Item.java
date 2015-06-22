/*
 * Copyright (C) 2015 sinjo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package objectconverter;

import java.util.HashMap;


/**
 *
 * @author sinjo
 */
public class Item {
    
    private String title;
    private HashMap<String, String> possibleValues;
    private int size;
    
    public Item(String title, HashMap values, int size) {
        this.title = title;
        this.possibleValues = values;
        this.size = size;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getSize() {
        return size;
    }

    public int getLenOfKey() {
        for (String key : possibleValues.keySet() ) {
            return key.length();
        }
        return 0;
    }
    
    public String getValueForKey(String key) {
        if(possibleValues.get(key) != null) {
            return possibleValues.get(key);
        }
        else {
            //System.err.println(key + " not found");
            
            return key;
        }
    } 
}
