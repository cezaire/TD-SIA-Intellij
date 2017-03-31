package td1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AnimalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DescendantTest{
    private Descendant descendant;
    private Animal animal;

    public DescendantTest(){
    	
    }

    @Before
    public void setUp(){
    	animal = new Animal("lion", "male", new Cri());
        descendant = new Descendant("tito", "male", animal);
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testMethode(){
    	String ascendant = descendant.ascendant();
        assertEquals("lion", ascendant);
    }
    
    @Test
    public void testGetterAndSetter(){
    	Animal animal = new Animal("chat", "femelle", new Cri());
    	descendant.setNom("tita");
    	descendant.setSexe("femele");
    	descendant.setAnimal(animal);
    	
    	assertEquals("tita", descendant.getNom());
    	assertEquals("femele", descendant.getSexe());
    	assertEquals(animal, descendant.getAnimal());
    }
}




