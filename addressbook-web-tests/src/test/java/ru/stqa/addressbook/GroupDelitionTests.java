package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase{


    
    @Test
    public void testsGroupDelition() {

        selectGroup();
        deletSelectedGroups();
        returnToGroupPage();
    }


}
