package com.testsigma.addons.web;

import com.testsigma.addons.mssqldb.util.MSSqlSelectBaseAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import lombok.Data;
import org.openqa.selenium.NoSuchElementException;

@Data
@Action(actionText = "Execute MSSqlDB Select-Query on the connection DB_Connection_URL",
description = "This Action executes a given Select Query",
applicationType = ApplicationType.WEB)
public class MSSqlselect extends MSSqlSelectBaseAction {

	@TestData(reference = "Select-Query")
	private com.testsigma.sdk.TestData testData1;
	@TestData(reference = "DB_Connection_URL")
	private com.testsigma.sdk.TestData testData2;

	@Override
	public com.testsigma.sdk.Result execute() throws NoSuchElementException {
		super.setTestData1(testData1);
		super.setTestData2(testData2);

		return super.execute();	
	}
}