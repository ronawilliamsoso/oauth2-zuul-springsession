package com.kakawait;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.zoro.account.AccountServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AccountServiceApplication.class)
@WebAppConfiguration
public class AccountServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
