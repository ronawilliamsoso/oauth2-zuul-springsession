package com.zoro.registry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zoro.eureka.ServiceRegistryApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceRegistryApplication.class)
public class ServiceDiscoveryApplicationTests {

	@Test
	public void contextLoads() {
	}

}
