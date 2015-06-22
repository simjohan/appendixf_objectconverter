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

import java.util.ArrayList;

/**
 *
 * @author sinjo
 */
public class Convert {
    
    private int object;
    private String values;
    private int caret = 0;
    
    public Convert(int object, String values) {
        this.object = object;
        this.values = values;
    }
    
    public String getStringResult() {
        String result = "";
        
        
        ArrayList<Item> items = ObjectValues.initObj37();
        
        if(object == 35) {
            items = ObjectValues.initObj35();
        }
        
        for(Item i: items) {
            try {
                String key = values.substring(caret, caret+i.getSize());
                caret += i.getSize();

                System.out.println(i.getTitle() + ": " + i.getValueForKey(key));
                result += i.getTitle() + ": " + i.getValueForKey(key) + "\n";
            }
            catch (Exception e) {
                System.out.println("Missing input.");
            }
        }
        
        return result;
    }
    
}
