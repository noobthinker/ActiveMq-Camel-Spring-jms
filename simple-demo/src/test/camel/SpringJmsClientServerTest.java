package camel;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by xkorey on 2014/9/6.
 */
public class SpringJmsClientServerTest extends CamelSpringTestSupport {


    @Test
    public void testCamelClientInvocation() {
        // as opposed to the CamelClientRemoting example we need to define the service URI in this java code
        int response = template.requestBody("jms:queue:numbers", 22, Integer.class);
        System.out.println(response);
        assertEquals("Get a wrong response", 66, response);
    }

    @Test
    public void testCamelClientText() {
        // as opposed to the CamelClientRemoting example we need to define the service URI in this java code
        String response = template.requestBody("jms:queue:strings", "hello camel", String.class);
        System.out.println(response);
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("classpath:camel-server.xml");
    }
}
