package cn.didadu.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jinggg on 16/4/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean prodTestBean;

    @Test
    public void proBeanShouldInject(){
        String expected = "I am from production profile";
        String actual = prodTestBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
