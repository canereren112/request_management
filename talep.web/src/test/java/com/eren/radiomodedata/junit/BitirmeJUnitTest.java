package com.eren.radiomodedata.junit;

import com.eren.bitirme.service.util.Constants;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;


/*
 * BitirmeJUnitTest.java
 * JUnit based test
 *
 * Created on September 29, 2007, 1:43 PM
 */
/**
 *
 * @author root
 */
public class BitirmeJUnitTest extends AbstractDependencyInjectionSpringContextTests {

    public BitirmeJUnitTest(String testName) {
        super(testName);
    }

    protected void onSetUp() throws Exception {
        System.out.println("================Starting Bitirme Tests======================");
        //InitialContext ctx = new InitialContext();
        //Class.forName("com.mysql.jdbc.Driver");
    }

    protected String[] getConfigLocations() {
        return Constants.CONFIG_FILES;
    }
}
