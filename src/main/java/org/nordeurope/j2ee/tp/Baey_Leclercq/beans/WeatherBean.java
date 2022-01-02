package org.nordeurope.j2ee.tp.Baey_Leclercq.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WeatherBean implements Serializable {
    Boolean selected;
    String country;
    String capital;
    String temperature;
    String language =null;

    public WeatherBean() {
        selected = false;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getLanguage() {return language;}

    public void setLanguage(String language) {this.language = language;}
}
