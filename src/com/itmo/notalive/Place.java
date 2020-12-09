package com.itmo.notalive;

import com.itmo.exception.*;

public class Place {
    private String map;
    private String info;
    private Thing has;

    public Place(String minimap) {
        map = minimap;
    }

    public Place(String minimap, String condition) {
        map = minimap;
        info = condition;
    }

    public Place(String minimap, String condition, Thing got) {
        map = minimap;
        info = condition;
        has = got;
    }

    public String miniMap() {
        return map;
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

    public  String getInfo() throws DescException{
        if (info == null) {
            throw new DescException("Нет информации по " + map);
        }
        return  info;
    }

    public String getMap() {
        try {
            return getInfo() + " " + map;
        } catch (DescException ex) {
            System.err.print(ex.getMessage());
            return map;
        }
        //return info == null ? map : map + " " + info;
    }

}