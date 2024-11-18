package pe.edu.cibertec.Tema2Sesion1c;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//esto permite ordenarlo como queremos
class ProductTest {
    //instanciamos la clase
    private Product prod1;

    @BeforeAll
    static void setUpBeforeClass() throws Exception{
        System.out.println("Ejecutando setUpBeforeClass");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception{
        System.out.println("Ejecutando tearDownAfterClass");
    }

    @BeforeEach
    void setUp() throws Exception{
        System.out.println("Ejecutando setUp");
        prod1 = new Product("P001", "TV Plasma", "TV with TDT Decod", 699.99);
    }

    @AfterEach
    void tearDown() throws Exception{
        System.out.println("Ejecutando tearDown");
        prod1 = null;
    }

    @Test
    @Order(1)
    void getCode() throws Exception{
        System.out.println("Ejecutando getCode");
        String expResult = "P001";
        String result = prod1.getCode();
        assertEquals(expResult, result);
    }
    @Test
    @Order(3)
    void getTitle() throws Exception{
        System.out.println("Ejecutando getTitle");
        String expResult = "TV Plasma";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
    }
    @Test
    @Order(2)
    void getDescription() throws Exception{
        System.out.println("Ejecutando getDescription");
        String expResult = "TV with TDT Decod";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
    }
    @Test
    @Order(4)
    void getPrice() throws Exception{
        System.out.println("Ejecutando getPrice");
        double expResult = 699.99;
        double result = prod1.getPrice();
        assertEquals(expResult, result);
    }
}