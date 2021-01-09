package com.company;

public class Monitor {
    int diagonal;
    String manufacturerMonitor;
    String matrixType;

    public Monitor (){}

    public Monitor(int diagonal, String manufacturer, String matrixType){
        this.diagonal = diagonal;
        this.manufacturerMonitor = manufacturer;
        this.matrixType = matrixType;
    }

    public void printInfo(){
        System.out.println("Monitor\ndiagonal - " + diagonal + ",\nmanufacturer - " + manufacturerMonitor + ",\ntype of matrix " + matrixType);
    }

    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    public int getDiagonal(){
        return  diagonal;
    }

    public void setManufacturerMonitor(String manufacturerMonitor){
        this.manufacturerMonitor = manufacturerMonitor;
    }

    public String getManufacturerMonitor(){
        return manufacturerMonitor;
    }

    public void setMatrixType(String matrixType){
        this.matrixType = matrixType;
    }

    public String getMatrixType(){
        return matrixType;
    }
}
