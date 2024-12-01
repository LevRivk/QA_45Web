package tests;

import dto.Student;
import enums.Gender;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {

    @Test
    public void studentReqFormPositiveTest(){
        Student student = new Student("Vasya","Vasilev",
                "vasya@gmail.com", Gender.OTHER,"4815162342",
                "07 Mar 2001","Math","Music",
                "","Delhi","NCR","Street 1 ");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
    }
}
