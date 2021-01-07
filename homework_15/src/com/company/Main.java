package com.company;

public class Main {

    public static void main(String[] args) {

        //TASK A

        Human person0 = new Human("Ibragim", "Musaev", "Abubakirovich", 1988, "football", 'm');
        Human person1 = new Human("Nargiza", "Musaeva", "Abubakirovna", 1990, "programming", 'f');
        Human person2 = new Human("Meerim", "Arzymatova", "Ruslanovna", 1990, "investment", 'f');
        Human person3 = new Human("Aruujan", "Abubakirova", "Ibragimovna", 2018, 'f');
        Human person4 = new Human("Talgat", "Seitaliev", "Jenishbekovich", 2014, 'm');
        Human person5 = new Human("Amir", "Seitaliev", "Jenishbekovich", 2015, "drawing", 'm');
        Human person6 = new Human("Leila", "Valieva", "Nimattullaevna", 1962, 'f');
        Human person7 = new Human("Jenish", "Seitaliev", "Chapaevich", 1989, "football", 'm');
        Human person8 = new Human("Nursultan", "Abubakirov", "Ibragimovich", 2021, 'm');
        Human person9 = new Human("Lionel", "Messi", "Riveiro", 1987, "dancing", 'm');

        Human[] persons = {person0, person1, person2, person3, person4, person5, person6, person7, person8, person9};

        for(Human person : persons){
            person.printInfo();
        }

        //TASK B

        Monitor monitor1 = new Monitor(24, "Philips", "IPS");
        HDD hdd1 = new HDD(930, 2);
        RAM ram1 = new RAM(16, "ACER");
        Usb usb1 = new Usb(3, 3);

        Computer computer1 = new Computer(monitor1, "Acer", "Black", hdd1, ram1, "Intel(R) HD Graphics 620", usb1);

        computer1.printInfo();












    }
}
