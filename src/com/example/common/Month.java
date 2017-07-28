package com.example.common;

/**
 * Created by Admin on 7/28/17.
 */
public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private String englishName;

    public  String setEnglishName(String englishName) {
         return this.englishName = englishName;
    }

    public String getEnglishName() {
        return englishName;
    }

}
