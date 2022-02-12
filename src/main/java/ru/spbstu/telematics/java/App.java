package ru.spbstu.telematics.java;

import java.io.*;



public class App
{
    public static void main(String[] args) throws IOException {

        String path = new File("").getAbsolutePath() + "\\src\\main\\java\\ru\\spbstu\\telematics\\java\\tmp.txt";
        IO io = new IO(path);
        io.Read();
    }
}