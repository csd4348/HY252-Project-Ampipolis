/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Character;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author johnp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Model.Character.DiggerTest.class, Model.Character.ProfessorTest.class, Model.Character.AssistantTest.class, Model.Character.ArchaeologistTest.class, Model.Character.CharacterTest.class})
public class CharacterSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
