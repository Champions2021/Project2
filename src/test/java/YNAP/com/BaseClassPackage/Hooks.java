package YNAP.com.BaseClassPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public BaseClass baseClass = new BaseClass();

    @Before
    public void setUp(){
        baseClass.openBrowser();
    }
    @After
    public void tearDown(){
        baseClass.closeBrowser();
    }

} //Hooks class ends

