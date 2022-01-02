package imt.nordeurope.j2ee.tp.Baey_Leclercq.ressources;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class tagWeather_fr extends ResourceBundle {

    @Override
    protected Object handleGetObject(String key) {
        Object value = null;
        switch (key){
            case "labelCountry":
                value = "Pays:";
                break;
            case "selection":
                value = ">--Choisissez un pays--<";
                break;
            case "fr":
                value = "France";
                break;
            case "ge":
                value = "Allemagne";
                break;
            case "us":
                value = "Etas Unis";
                break;
            case "tw":
                value = "Taiwan";
                break;
            case "s1":
                value = ": dans la capital du pays ";
                break;
            case "s2":
                value = ", la température est de ";
                break;
            default:
                value = null;
                break;
        }
        return value;
    }

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }
}
