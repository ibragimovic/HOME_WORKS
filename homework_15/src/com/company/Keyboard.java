package com.company;

public class Keyboard {
    boolean backlight;
    boolean additionalDigits;

    public Keyboard(){}

    public Keyboard(boolean backlight, boolean additionalDigits){
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public void printInfo(){
        System.out.println("Keyboard\n backlight - " + backlight + ",\nadditional digits - " + additionalDigits);
    }

    public void setBacklight(boolean backlight){
        this.backlight = backlight;
    }

    public boolean isBacklight(boolean backlight){
        return backlight;
    }

    public void setAdditionalDigits(boolean additionalDigits){
        this.additionalDigits = additionalDigits;
    }

    public boolean isAdditionalDigits(){
        return additionalDigits;
    }


}
