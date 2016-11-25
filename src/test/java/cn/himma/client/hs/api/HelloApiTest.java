/**
 * 
 */
package cn.himma.client.hs.api;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.himma.client.BaseTest;
import cn.himma.hs.api.HelloApi;

/**
 * @Desc
 * @author wewenge.yan
 * @Date 2016年8月26日
 * @ClassName HelloApiTest
 */
public class HelloApiTest extends BaseTest {

	@Autowired
	private HelloApi HelloApi;

	@Test
	public void testSayHello() {
		String sayHello = HelloApi.sayHello("test");
		System.out.println(sayHello);
	}

}
