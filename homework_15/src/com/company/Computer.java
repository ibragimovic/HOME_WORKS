package com.company;

public class Computer {
    Monitor monitor;
    String brand;
    String color;
    HDD hdd;
    RAM ram;
    String videoCard;
    Usb usb;

    public Computer(){}

    public Computer(Monitor monitor, String brand, String color, HDD hdd, RAM ram, String videoCard, Usb usb){
        this.monitor = monitor;
        this.brand = brand;
        this.color = color;
        this.hdd = hdd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usb = usb;

    }

    public void printInfo(){
        System.out.println("Computer");
        monitor.printInfo();
        System.out.println("Brand - " + brand + ", color - " + color);
        hdd.printInfo();
        ram.printInfo();
        System.out.println("Video card - " + videoCard);
        usb.printInfo();
        }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }
}
