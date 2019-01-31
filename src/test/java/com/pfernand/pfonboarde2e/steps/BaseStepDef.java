package com.pfernand.pfonboarde2e.steps;

import org.apache.commons.io.IOUtils;
import org.jdbi.v3.core.Jdbi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseStepDef {

	private static final String SQL = "INSERT INTO PF_USER(UUID, CREATED_AT, FIRST_NAME, LAST_NAME, PASSWORD)\n" +
			"VALUES (uuid(), '2018-11-27 22:28:18.388', 'Cucumber', 'Cucumber2', 'tesCucumber3t');";

	@Autowired
	private Jdbi jdbi;

	void runSqlScript(final String resource) throws IOException {
		jdbi.useHandle(h -> h.createScript(readToString(resource)).execute());
	}

	private String readToString(final String resource) throws IOException {
		return IOUtils.toString(BaseStepDef.class.getResourceAsStream(resource),
				Charset.forName("UTF-8"));
	}

}

