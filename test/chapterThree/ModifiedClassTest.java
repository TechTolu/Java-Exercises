package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedClassTest {
    ModifiedClass modifiedClass;
    @BeforeEach
    void setUp(){
        modifiedClass = new ModifiedClass(" ",0);
    }
    @Test
    void modifiedClassCanBeCreated(){
        //WHEN
        modifiedClass.setName("Lekan");
        modifiedClass.setBalance(5000);
        //ASSERT
        assertEquals("Lekan",modifiedClass.getName());
        assertEquals(5000,modifiedClass.getBalance());
    }

    @Test
    void depositCanBeMade(){
        //WHEN
        modifiedClass.deposit(5500);
        //ASSERT
        assertEquals(5500, modifiedClass.getBalance());
    }

    @Test
    void withdrawalCanBeMade(){
        //WHEN
        modifiedClass.setBalance(5500);
        modifiedClass.withdrawal(2350);
        //ASSERT
        assertEquals(3150, modifiedClass);
    }
}


