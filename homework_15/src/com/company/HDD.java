package com.company;

public class HDD {
    int memorySize;
    int numberOfDisks;

    public HDD(){}

    public HDD(int memorySize, int numberOfDisks){
        this.memorySize = memorySize;
        this.numberOfDisks = numberOfDisks;
    }

    public void printInfo(){
        System.out.println("HDD\nmemory size - " + memorySize + ",\nnumber of disks - " + numberOfDisks);
    }

    public void setMemorySize(int memorySize){
        this.memorySize = memorySize;
    }

    public int getMemorySize(){
        return memorySize;
    }

    public void setNumberOfDisks(int numberOfDisks){
        this.numberOfDisks = numberOfDisks;
    }

    public int getNumberOfDisks (){
        return numberOfDisks;
    }
}
