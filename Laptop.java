package Seminar.Seminar06.Homework;

import java.util.*;

class Laptop {
    private String brand;
    private int RAM;
    private int storage;
    private String OS;
    private String color;

    public Laptop(String brand, int RAM, int storage, String OS, String color) {
        this.brand = brand;
        this.RAM = RAM;
        this.storage = storage;
        this.OS = OS;
        this.color = color;
    }

    // Геттеры для получения значений полей
    public String getBrand() {
        return brand;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }
     public String toString() {
        return brand + " " + RAM + "GB RAM " + storage + "GB storage " + OS + " " + color;
    }
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Laptop laptop = (Laptop) obj;
    return RAM == laptop.RAM &&
            storage == laptop.storage &&
            Objects.equals(brand, laptop.brand) &&
            Objects.equals(OS, laptop.OS) &&
            Objects.equals(color, laptop.color);
}

}

