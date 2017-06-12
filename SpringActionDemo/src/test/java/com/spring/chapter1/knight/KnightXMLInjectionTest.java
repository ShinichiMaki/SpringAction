package com.spring.chapter1.knight;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.chapter1.knight.FakePrintStream;
import com.spring.chapter1.knight.Knight;

//指定使用的单元测试执行类，这里就指定的是SpringJUnit4ClassRunner.class
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * <p>
 * 单个文件：@ContextConfiguration(Locations="../applicationContext.xml")
 * </p>
 * <p>
 * 多个文件：@ContextConfiguration(locations = { "classpath*:/spring1.xml",
 * "classpath*:/spring2.xml" })
 * </p>
 *
 */
@ContextConfiguration
public class KnightXMLInjectionTest {

	@Autowired
	public Knight knight;

	@Autowired
	FakePrintStream printStream;

	@After
	public void clearPrintStream() {
		printStream.clear();
	}

	@Test
	public void shouldInjectKnightWithSlayDragonQuest() {
		knight.embarkOnQuest();
	}
}
