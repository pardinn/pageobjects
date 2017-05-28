package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.CoursesPage;
import pageobjects.LoginPage;
import pageobjects.StudentDashboardPage;
import pageobjects.WorkingWithElementsCoursePage;

/**
 * Created by morae on 27/05/2017.
 */
public class FirstTests extends BaseTest {

    @Test
    public void test1() {
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.goTo();

        LoginPage loginPage = coursesPage.clickSignInLink();
        StudentDashboardPage studentDashboardPage = loginPage.login(USERNAME, PASSWORD);

        Assert.assertTrue(studentDashboardPage.isAt(), "The user was not able to successfully login");
    }

    @Test
    public void test2() {
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.goTo();

        LoginPage loginPage = coursesPage.clickSignInLink();
        StudentDashboardPage studentDashboardPage = loginPage.login(USERNAME, PASSWORD);

        Assert.assertTrue(studentDashboardPage.isAt(), "The user was not able to successfully login");

        WorkingWithElementsCoursePage userInteractionsCoursePage = studentDashboardPage.ResumeCourse();
        Assert.assertTrue(userInteractionsCoursePage.isAt(), "The course did not open succesfully");
    }
}
