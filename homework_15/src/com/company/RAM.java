package com.company;

public class RAM {
    int sizeRam;
    String manufacturerRam;

    public RAM(){}

    public RAM(int size, String manufacturer){
        this.sizeRam = size;
        this.manufacturerRam = manufacturer;
    }

    public void printInfo(){
        System.out.println("RAM\n size - " + sizeRam + ",\nmanufacturer - " + manufacturerRam);
    }

    public void setSizeRam(int sizeRam){
        this.sizeRam = sizeRam;
    }

    public int getSizeRam(){
        return sizeRam;
    }

    public void setManufacturerRam(String manufacturerRam){
        this.manufacturerRam = manufacturerRam;
    }

    public String getManufacturerRam(){
        return manufacturerRam;
    }
}
