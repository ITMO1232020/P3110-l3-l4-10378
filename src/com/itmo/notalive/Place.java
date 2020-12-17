package com.itmo.notalive;

import com.itmo.exception.*;

public class Place {
    private String name;
    private String description;
    private Thing has;

    public Place(String minimap) {
        name = minimap;
    }

    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Place(String name, String description, Thing has) {
        this.name = name;
        this.description = description;
        this.has = has;
    }

    public String miniMap() {
        return name;
    }

    public static class Time {
        public static String time = "";

        public static void setTime(String clock) {
            time = clock;
        }

        public static String getTime() {
            return time;
        }
    }

    private  String getInfo() throws DescException{
        if (description == null) {
            throw new DescException("Нет информации по " + name);
        }
        return description;
    }

    public String getMap() {
        try {
            return getInfo() + " " + name;
        } catch (DescException ex) {
            System.err.print(ex.getMessage());
            return name;
        }
        //return info == null ? map : map + " " + info;
    }

}