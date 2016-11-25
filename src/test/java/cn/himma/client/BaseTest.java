/**
 * 
 */
package cn.himma.client;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:spring/spring-context.xml",
		"classpath:spring/hessian-client.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {
}
