package com.example.admin.baitapnhom4.com.example.admin.Profil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/11/2016.
 */
public final class DummyData {

    public static List<CityEvent> getData() {
        List<CityEvent> list = new ArrayList<>();

        list.add(new CityEvent("TITRE","President chez Gris-Metal",null, CityEvent.TITRE));
        list.add(new CityEvent("CENTRES D'INTERET", "Gastronmie,concert,moto", null, CityEvent.TITRE));
        list.add(new CityEvent("FACEBOOK", "Consulter le profil",  null, CityEvent.TITRE));
        list.add(new CityEvent("TWITTER", "Consulter le profil",  null, CityEvent.TITRE));
        list.add(new CityEvent("SOCIETE", "Gis-Metal",  null, CityEvent.TITRE));

        list.add(new CityEvent("ACTIVITE","Agence web", "Three ViewHolders are needed, one for each type" +
                " of the card and they all inherit from a generic ViewHolder class. In onCreateViewHolder check" +
                "type and set data to the views.", CityEvent.ACTIVITE));

        list.add(new CityEvent("NUMERO DE LICENCE", "525077089",  null, CityEvent.TITRE));

        list.add(new CityEvent("INDEX", "16,4",  null, CityEvent.TITRE));
        return list;
    }
}
