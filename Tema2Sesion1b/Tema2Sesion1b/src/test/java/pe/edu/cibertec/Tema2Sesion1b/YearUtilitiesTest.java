package pe.edu.cibertec.Tema2Sesion1b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class YearUtilitiesTest {

    @Test
    public void test1(){
        assertTrue(YearUtilities.isLeap(4));
    };
    @Test
    public void test2(){
        assertFalse(YearUtilities.isLeap(6));
    };
    @Test
    public void test3(){
        assertFalse(YearUtilities.isLeap(100));
    };
    @Test
    public void test4(){
        assertFalse(YearUtilities.isLeap(2024));
    };
}
