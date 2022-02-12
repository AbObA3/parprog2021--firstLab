package ru.spbstu.telematics.java;

import junit.framework.TestCase;
import java.io.File;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    public void test1() throws IOException {
        int length[] ={12,5};
        testApp(length);
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp(int[] length) throws IOException {
        IO io = new IO(new File("").getAbsolutePath() + "\\src\\main\\java\\ru\\spbstu\\telematics\\java\\tmp.txt");
        io.Read();
        for(int i = 0 ; i < io.lengths.size();i++ )
           assertEquals((int)io.lengths.get(i), length[i] );
    }
}
