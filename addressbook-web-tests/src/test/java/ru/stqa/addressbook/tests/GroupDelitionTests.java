package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase{


    
    @Test
    public void testsGroupDelition() {

        app.selectGroup();
        app.deletSelectedGroups();
        app.returnToGroupPage();
    }


}