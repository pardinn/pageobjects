package expanded.tests;

import expanded.pageobjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by morae on 27/05/2017.
 */
public class ExpandedTests extends BaseTest {

    @Test(description = "Login to UltimateQA and validates user is at Student Dashboard Page")
    public void test1() {
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.goTo();

        LoginPage loginPage = coursesPage.clickSignInLink();
        StudentDashboardPage studentDashboardPage = loginPage.login(USERNAME, PASSWORD);

        Assert.assertTrue(studentDashboardPage.isAt(), "The user was not able to successfully login");
    }

    @Test(description = "Login to UltimateQA and Resume Course")
    public void test2() {
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.goTo();

        LoginPage loginPage = coursesPage.clickSignInLink();
        StudentDashboardPage studentDashboardPage = loginPage.login(USERNAME, PASSWORD);

        Assert.assertTrue(studentDashboardPage.isAt(), "The user was not able to successfully login");

        WorkingWithElementsCoursePage userInteractionsCoursePage = studentDashboardPage.ResumeCourse();
        Assert.assertTrue(userInteractionsCoursePage.isAt(), "The course did not open successfully");
    }

    @Test(description= "Open complicated page and click on first Twitter button")
    public void test3(){
        ComplicatedPage complicatedPage = new ComplicatedPage(driver);
        complicatedPage.goTo();
        Assert.assertTrue(complicatedPage.isAt(), "The complicated page did not open successfully");

        complicatedPage.clickFirstTwitterButton();
        Assert.assertFalse(complicatedPage.isAt());
    }

    @Test(description = "Open complicated page and perform a search in Search box")
    public void test4(){
        ComplicatedPage complicatedPage = new ComplicatedPage(driver);
        complicatedPage.goTo();
        Assert.assertTrue(complicatedPage.isAt(), "The complicated page did not open successfully");

        complicatedPage.search("Selenium");
        Assert.assertFalse(complicatedPage.isAt());
    }

    @Test(description = "In complicated page, open toggle and validate it is open")
    public void test5(){
        ComplicatedPage complicatedPage = new ComplicatedPage(driver);
        complicatedPage.goTo();
        Assert.assertTrue(complicatedPage.isAt(), "The complicated page did not open successfully");

        complicatedPage.openToggle();
        Assert.assertTrue(complicatedPage.isToggleOpen(), "The toggle did not open successfully");
    }
}
