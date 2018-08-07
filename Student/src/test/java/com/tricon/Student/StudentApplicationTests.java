package com.tricon.Student;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {

	 @Mock
	    MyDatabase databaseMock; 

	    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

	    @Test
	    public void testQuery()  {
	        ClassToTest t  = new ClassToTest(databaseMock); 
	        boolean check = t.query("* from t"); 
	        assertTrue(check); 
	        verify(databaseMock).query("* from t"); 
	    }
}
