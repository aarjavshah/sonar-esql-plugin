package com.exxeta.iss.sonar.esql.check;

import java.io.File;

import org.junit.Test;

import com.exxeta.iss.sonar.esql.checks.verifier.EsqlCheckVerifier;

public class UndocumentedModuleCheckTest {
	@Test
	public void test() {
		EsqlCheckVerifier.verify(new UndocumentedModuleCheck(), new File("src/test/resources/undocumentedModule.esql"));
	}
}
