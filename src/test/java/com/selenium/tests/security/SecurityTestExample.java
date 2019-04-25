package com.selenium.tests.security;

import com.selenium.context.annotations.Description;
import com.selenium.context.base.AbstractWebTest;
import com.selenium.context.flag.SecurityExecutable;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecurityTestExample extends AbstractWebTest
{
    private static final Logger logger = LoggerFactory.getLogger(SecurityTestExample.class);

    private static String DEFAULT_CONTEXT = "CONTENT_NAME";

    @Test
    @Description("")
    @Category({SecurityExecutable.class})
    @Ignore
    public void testSpiderDepthOne()
    {
        zapTest.spider("https://www.instagram.com/", true, DEFAULT_CONTEXT, 1);
        zapTest.setEnablePassiveScan(false);
        zapTest.scan("https://www.instagram.com/, 100", 1);
        zapTest.createTestResultHtmlReport(zapTest, zapTest.getAlerts(), configuration.getZapHtmlReport());
    }
}
