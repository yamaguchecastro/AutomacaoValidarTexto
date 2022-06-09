package projeto.amazon;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarTexto {

	WebDriver driver;
	By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com.br");

		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void pesquisarProduto() {
		driver.findElement(pesquisar).sendKeys("Iphone");
		driver.findElement(pesquisar).submit();
		String tituloDaPagina = driver.getTitle();
		System.out.println(tituloDaPagina);

	}

	@Test
	public void validarE2ETreinamentos() {
		driver.get("https://www.e2etreinamentos.com.br");
		String title = driver.getTitle();
		assertEquals("E2E Treinamentos", title);
	}

	@Test
	public void validarAmazon() {
		driver.get("https://www.amazon.com.br");
		String title = driver.getTitle();
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", title);
	}

	@Test
	public void validarGoogle() {
		driver.get("https://www.google.com.br");
		String title = driver.getTitle();
		assertEquals("Google", title);
	}

}
