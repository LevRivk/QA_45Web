package tests;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import enums.StateCity;
import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends AppManager {

    @Test
    public void studentReqFormPositiveTest(){
        List<Hobbies> hobbies = new ArrayList<>();
        hobbies.add(Hobbies.SPORTS);
        hobbies.add(Hobbies.MUSIC);

        Student student = new Student("Vasya","Vasilev",
                "vasya@gmail.com", Gender.OTHER,"4815162342",
                "07 Mar 2001","Maths,Physics,Chemistry",hobbies,
                "",StateCity.NCR.getCity()[0],StateCity.NCR.getState(),"street 1 ");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage(),"Test Failed");


    }
}
