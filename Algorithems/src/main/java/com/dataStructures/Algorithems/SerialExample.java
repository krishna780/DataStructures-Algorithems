package com.dataStructures.Algorithems;



import lombok.ToString;

import java.io.*;

@ToString
class Emp implements Serializable{
    private static final long serialVersionUID = 1L;

    String name;
    transient int a;
     int b;
    int age;
    public Emp(String name, int age, int a, int b)
    {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }


}
public class SerialExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp object = new Emp("ab", 20, 2, 1000);
        File file=new File("emp.txt");
        writeObjectToFile(object,file);

       Emp p = readObjectFromFile(file);

        System.out.println(p);

    }

    private static void writeObjectToFile(Emp emp, File file) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(emp);
        objectOutputStream.flush();
    }
    public static Emp readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Emp result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Emp) ois.readObject();
        }
        return result;
    }
}
