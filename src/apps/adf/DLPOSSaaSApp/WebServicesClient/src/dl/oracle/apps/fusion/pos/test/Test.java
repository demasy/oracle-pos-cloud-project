package dl.oracle.apps.fusion.pos.test;

import java.util.ArrayList;

import roketto.oracle.apps.fusion.repo.common.client.pojo.Territoriy;
import roketto.oracle.apps.fusion.repo.common.client.rest.Territories;

public class Test {
 
    public static void main(String[] args) {

        Territories territories = new Territories();
        // territories.getAllTerritoriesJSON();
        ArrayList<Territoriy> territoriesArray = territories.getAllTerritories(300);
        for (int i = 0; i < territoriesArray.size(); i++) {
                Territoriy territoriy = new Territoriy();
                territoriy = territoriesArray.get(i);
                System.out.println("# " + i);
                System.out.println("Code=> " + territoriy.getTerritoryCode());
                System.out.println("Short Name=> " + territoriy.getTerritoryShortName());
                System.out.println("");
        }
        
    }
}
