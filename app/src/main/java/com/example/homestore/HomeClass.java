package com.example.homestore;

public class HomeClass {
    String textBreakfast;
    String textLunch;
    String textSupper;

    public HomeClass(String breakfast, String lunch, String supper) {
        this.textBreakfast = breakfast;
        this.textLunch = lunch;
        this.textSupper = supper;
    }

    public String getTextBreakfast() {
        return textBreakfast;
    }

    public void setTextBreakfast(String name) {
        this.textBreakfast = name;
    }

    public String getTextLunch() {
        return textLunch;
    }

    public void setTextLunch(String textLunch) {
        this.textLunch = textLunch;
    }

    public String getTextSupper() {
        return textSupper;
    }

    public void setTextSupper(String textSupper) {
        this.textSupper = textSupper;
    }
}
