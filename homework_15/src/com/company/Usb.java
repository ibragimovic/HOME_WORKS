package com.company;

public class Usb {
    float typePort;
    int idPort;

    public Usb(){}

    public Usb(float typePort, int idPort){
        this.typePort = typePort;
        this.idPort = idPort;
    }

    public void printInfo(){
        System.out.println("USB port\ntype of port - " + typePort + ",\nid port - " + idPort);
    }

    public float getTypePort() {
        return typePort;
    }

    public void setTypePort(float typePort) {
        this.typePort = typePort;
    }

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }
}
