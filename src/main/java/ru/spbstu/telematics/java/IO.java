package ru.spbstu.telematics.java;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO {
    private String path;
    private FileReader fr;
    public  final BufferedReader br;
    public ArrayList<Integer> lengths;
    public String line;

    public IO(String path) throws FileNotFoundException {
        this.path= path;
        this.fr=new FileReader(this.path);
        this.br=new BufferedReader(fr);
        lengths= new ArrayList<Integer>();
    }

    public void Read() throws IOException{
        try(this.br) {

            while((this.line = this.br.readLine()) != null) {
                lengths.add(this.line.length());
                System.out.println(line);

            }
        }
        finally {
            this.fr.close();
        }

    }


    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public FileReader getFr() {
        return fr;
    }

    public String getPath() {
        return path;
    }
}
