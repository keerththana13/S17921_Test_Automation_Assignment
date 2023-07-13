import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.example.Common.Constants;

public class ReportsPage {
    private WebDriver driver;
    private By reportsContainer = By.id("container_reports");

    public ReportsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openReportsPage() {
        driver.get(Constants.WEB_URL);
        driver.manage().window().maximize();
    }

    public void clickReportsContainer() {
        driver.findElement(reportsContainer).click();
    }
}