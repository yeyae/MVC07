package com.globalin.time;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.globalin.config.RootConfig;
import com.globalin.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
public class TimeMapperTest {
	@Autowired
	private TimeMapper tm;

	@Test
	public void testTime() {
		System.out.println(tm.getTime());
	}
}
