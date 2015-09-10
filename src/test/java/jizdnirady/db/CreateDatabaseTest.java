package jizdnirady.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CreateDatabaseTest {

    @Test
    public void createDatabase() throws Exception {
        Thread.currentThread().sleep(60000L);
    }

}
