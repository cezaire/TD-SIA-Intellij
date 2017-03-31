package td1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AnimalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AnimalTest{
    private Cri cri;
    private Animal animal;

    public AnimalTest(){
    }

    @Before
    public void setUp(){
        cri = new Cri();
        animal = new Animal("lion", "male", cri);
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testMethode1(){
        Animal animal1 = new Animal("lion", "male",  new Cri());
        animal1.compatibiliteGrossesse("lion", "femele");
    }

    @Test
    public void testFixture(){
        assertEquals(true, animal.compatibiliteGrossesse("lion", "femele"));
        assertEquals(false, animal.compatibiliteGrossesse("lion", "male"));
        assertEquals(false, animal.compatibiliteGrossesse("tigre", "male"));
    }
    
    @Test
    public void testListDescendant(){
    	animal.getDescendants().add(new Descendant("simba", "male", animal));
    	animal.getDescendants().add(new Descendant("nala", "female", animal));
    	testListDescendantExtract();
    }

	private void testListDescendantExtract() {
		assertEquals("simba", animal.getDescendants().get(0).getNom());
	}
	
	@Test
	public void testCri(){		
		assertEquals("Rrrrrrrrrr", animal.getCri().pousseUnCri());
	}
	
	@Test
	public void testGetterAndSetter(){
		Cri nouveauCri = new Cri();
		ArrayList <Descendant> descendants = new ArrayList<Descendant>();
		Descendant tigrou = new Descendant("tigrou", "male", animal);
		Descendant tigra = new Descendant("tigrou", "male", animal);
		descendants.add(tigra);
		descendants.add(tigrou);
		
		animal.setEspece("jeune lion");
		animal.setSexe("male");
		animal.setCri(nouveauCri);
		animal.setDescendants(descendants);
		
		assertEquals("jeune lion", animal.getEspece());
		assertEquals("male", animal.getSexe());
		assertEquals(nouveauCri, animal.getCri());
		assertEquals(descendants, animal.getDescendants());
		assertEquals(2, animal.getDescendants().size());
	}

}




