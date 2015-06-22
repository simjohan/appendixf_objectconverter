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
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author sinjo
 */
public class ObjectValues {
    
    public static ArrayList initObj35() {
        ArrayList<Item> items = new ArrayList<>();
        
        HashMap item1 = new HashMap();
        item1.put("0", "Parameter set to Nei");
        item1.put("1", "Parameter set to GML");
        item1.put("2", "Parameter set to Ja");
        items.add(new Item("ECR integration", item1, 1));
        
        HashMap item2 = new HashMap();
        item2.put("1", "1200");
        item2.put("2", "2400");  
        item2.put("3", "4800");  
        item2.put("4", "9600");  
        item2.put("5", "19200");  
        item2.put("6", "38400");  
        item2.put("7", "57600");  
        item2.put("8", "115200");          
        items.add(new Item("ECR baud rate", item2, 1));
        
        HashMap item3 = new HashMap();
        item3.put("1", "Yes");
        item3.put("2", "No");
        items.add(new Item("ECR Card Status", item3, 1));
        
        HashMap item4 = new HashMap();
        item4.put("0", "Always");
        item4.put("1", "Never");
        item4.put("2", "After amount");
        items.add(new Item("ECR card info", item4, 1));
        
        HashMap item5 = new HashMap();
        item5.put("1", "RS232");
        item5.put("2", "USB");
        item5.put("3", "Magic box");
        item5.put("4", "IP ETHERNET");
        item5.put("5", "BT Android");
        item5.put("6", "BT IOS");
        item5.put("7", "GPRS");
        item5.put("8", "AUTOMATIC");
        items.add(new Item("ECR Port", item5, 1));
        
        HashMap item6 = new HashMap();
        item6.put("1", "Yes");
        item6.put("2", "No");
        items.add(new Item("Header/Footer", item6, 1));
        
        return items;
    }
    
    
    public static ArrayList initObj37() {
        
        ArrayList<Item> items = new ArrayList<>();
        
        HashMap item1 = new HashMap();
        item1.put("1", "Normal receipts(as defined in chapter 6.8.2, step 04)");
        item1.put("2", "Hotel receipt. Print partial receipt.");
        item1.put("3", "Restaurant receipt. Print complete receipt.");
        items.add(new Item("Pre-Authorisation receipt", item1, 1));
        
        HashMap item2 = new HashMap();
        item2.put("1", "Active (TRUE)");
        item2.put("2", "Inactive (FALSE)");  
        items.add(new Item("Electronic Offline Transaction", item2, 1));
        
        HashMap item3 = new HashMap();
        item3.put(" ", "Not a multiterminal");
        item3.put("1", "Master multiterminal (physical TID)");
        item3.put("2", "Slave multiterminal (logical TID)");
        items.add(new Item("Multiterminal", item3, 1));
        
        HashMap item4 = new HashMap();
        item4.put("00000000", "Not a multiterminal");
        item4.put("{var}", "Master TID");
        items.add(new Item("Master TID", item4, 8));
        
        HashMap item5 = new HashMap();
        item5.put("0", "Ingen info");
        item5.put("1", "KID (numeric input)");
        item5.put("2", "Info text");
        item5.put("3", "OPER ID");
        items.add(new Item("Information Field", item5, 1));
        
        HashMap item6 = new HashMap();
        item6.put("1", "Active (TRUE – Default)");
        item6.put("2", "Inactive (FALSE)");
        items.add(new Item("Duplicate Control", item6, 1));
        
        HashMap item7 = new HashMap();
        item7.put("0", "Not used");
        item7.put("1", "Per reconciliation");
        item7.put("2", "After Z-report is printed");
        item7.put("3", "For all transaction types");
        item7.put("4", "After O-report is printed");
        items.add(new Item("OPER ID usage", item7, 1));
        
        HashMap item8 = new HashMap();
        item8.put("0", "Not in use");
        item8.put("1", "Inserted if old keyboard on the Banjo terminal.");
        items.add(new Item("Banjo terminals Keyboard", item8, 1));        
        
        HashMap item9 = new HashMap();
        item9.put("0", "Migration stage unknown");
        item9.put("1", "Migration stage 1");
        item9.put("2", "Migration stage 2");
        item9.put("3", "Migration stage 3");
        item9.put("4", "Migration stage SSA operative");
        items.add(new Item("Ingenico, SW 7.0.x: Migration stage", item9, 1));
        
        HashMap item10 = new HashMap();
        item10.put("1", "Active");
        item10.put("2", "Inactive (default)");
        items.add(new Item("Reconciliation protection", item10, 1));
        
        HashMap item11 = new HashMap();
        item11.put("1", "Øre");
        item11.put("2", "Kroner");
        items.add(new Item("Amount mode", item11, 1));
        
        HashMap item12 = new HashMap();
        item12.put("1", "Active");
        item12.put("2", "Inactive (default)");
        items.add(new Item("Always copy", item12, 1));
        
        HashMap item13 = new HashMap();
        item13.put("0", "None");
        item13.put("1", "On error");
        item13.put("2", "Always");
        items.add(new Item("Key sound", item13, 1));
        
        /*HashMap item14 = new HashMap();
        item14.put("1", "Not in use");
        item14.put("2", "Normal");
        item14.put("3", "Local");
        items.add(new Item("Test mode", item14, 1));*/
        
        HashMap item15 = new HashMap();
        item15.put("{var}", "Number of days a preauthorisation can be stored before a warning is displayed");
        items.add(new Item("Authorisation days", item15, 3));
        
        HashMap item16 = new HashMap();
        item16.put("no", "Norwegian");
        item16.put("sv", "Swedish");
        item16.put("en", "English");
        item16.put("da", "Danish");
        items.add(new Item("Language code ISO 639-1", item16, 2));
        
        HashMap item17 = new HashMap();
        item17.put("1", "Total Amount Mode");
        item17.put("2", "No");
        item17.put("3", "Extra Amount Mode");
        items.add(new Item("Tips", item17, 1));
        
        HashMap item18 = new HashMap();
        item18.put("{var}", "In tenth of promille 9999 = 99.99%");
        items.add(new Item("Vat Rate", item18, 4));
        
        HashMap item19 = new HashMap();
        item19.put("0", "Unkown");
        item19.put("1", "Not Used");
        item19.put("2", "Edit Disable");
        item19.put("3", "Edit Enable");
        items.add(new Item("Use Vat", item19, 1));
        
        HashMap item20 = new HashMap();
        item20.put("1", "Yes");
        item20.put("2", "No");
        items.add(new Item("Deposit Protection", item20, 1));
        
        // NOT IN USE FOR TELIUM??
        HashMap item21 = new HashMap();
        item21.put("0", "Not used");
        item21.put("1", "1 minute");
        item21.put("2", "5 minutes");
        item21.put("3", "15 minutes(default)");
        item21.put("4", "60 minutes");
        item21.put("5", "Never");
        items.add(new Item("Sleep mode", item21, 1));
        
        HashMap item22 = new HashMap();
        item22.put("1", "Yes");
        item22.put("2", "No");
        items.add(new Item("Menu Protext", item22, 1));
        
        HashMap item23 = new HashMap();
        item23.put("0", "Standard");
        item23.put("1", "Fixed price");
        items.add(new Item("Idle Mode", item23, 1));
        
        HashMap item24 = new HashMap();
        item24.put("1", "Yes");
        item24.put("2", "No");
        items.add(new Item("Logging", item24, 1)); 

        HashMap item25 = new HashMap();
        item25.put("1", "Yes");
        item25.put("2", "No");
        items.add(new Item("Service First", item25, 1));
        
        HashMap item26 = new HashMap();
        item26.put("-", "Not used");
        item26.put("no", "Norwegian");
        item26.put("sv", "Swedish");
        item26.put("en", "English");
        item26.put("da", "Danish");
        item26.put("de", "German");
        item26.put("es", "Spanish");
        item26.put("fi", "Finnish");
        item26.put("fr", "French");        
        items.add(new Item("Fallback customer language ISO 639-1", item26, 2));
        
        HashMap item28 = new HashMap();
        item28.put("0", "Not used");
        item28.put("1", "After 1 hour");
        item28.put("2", "After 2 hour");
        item28.put("3", "Never");
        items.add(new Item("PowerOff Modes", item28, 1));
        
        HashMap item29 = new HashMap();
        item29.put("0", "Auto");
        item29.put("1", "Always");
        items.add(new Item("Backlight", item29, 1));
        
        HashMap item30 = new HashMap();
        item30.put("1", "Yes");
        item30.put("2", "No");
        items.add(new Item("Pinshield Light", item30, 1));
        
        HashMap item31 = new HashMap();
        item31.put("1", "Yes");
        item31.put("2", "No");
        items.add(new Item("Protect refund", item31, 1));
        
        HashMap item32 = new HashMap();
        item32.put("1", "Yes");
        item32.put("2", "No");
        items.add(new Item("Protect reversal", item32, 1));
        
        HashMap item33 = new HashMap();
        item33.put("1", "Chip up");
        item33.put("2", "Chip towards you");
        item33.put("2", "Chip down");
        items.add(new Item("Chip direction", item33, 1));
        
        HashMap item34 = new HashMap();
        item34.put("0", "Always");
        item34.put("1", "On Demand (Terminal will display  prompt before printing the customer  receipt)");
        items.add(new Item("Customer receipt", item34, 1));
        
        HashMap item35 = new HashMap();
        item35.put("1", "None");
        item35.put("2", "Always(default)");
        items.add(new Item("PinKey Tine", item35, 1));
        
        return items;
        
    }
    
}
