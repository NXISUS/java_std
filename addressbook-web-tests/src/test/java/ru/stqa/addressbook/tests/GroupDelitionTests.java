package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase{


    
    @Test
    public void testsGroupDelition() {

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deletSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
