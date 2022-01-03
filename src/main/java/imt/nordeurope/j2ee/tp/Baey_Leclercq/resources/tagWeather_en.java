package imt.nordeurope.j2ee.tp.Baey_Leclercq.resources;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class tagWeather_en extends ResourceBundle {
    @Override
    protected Object handleGetObject(String key) {
        Object value = null;
        switch (key){
            case "labelCountry":
                value = "Country:";
                break;
            case "selection":
                value = ">--Choose a country--<";
                break;
            case "fr":
                value = "France";
                break;
            case "ge":
                value = "Germany";
                break;
            case "us":
                value = "US";
                break;
            case "tw":
                value = "Taiwan";
                break;
            case "s1":
                value = ": in capital city of ";
                break;
            case "s2":
                value = ", the temperature is of ";
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
