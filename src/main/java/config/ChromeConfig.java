package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeConfig {

    /**
     * O método retorna um objeto WebDriver inicializado com as opções configuradas.
     * @return driver
     *
     * Abre o navegador Chrome em tela cheia.
     * Modo de usar:
     * WebDriver driver = ChromeConfig.configurarChrome();
     */
    @SuppressWarnings("deprecation")
    public static WebDriver configurarChrome() {
        // Configurar o ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\DEV\\chromedriver-win32\\chromedriver.exe");

        // Configurar as opções do Chrome para abrir em tela cheia
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Inicializar o WebDriver com as opções configuradas
        WebDriver driver = new ChromeDriver(options);

        // Configurar timeouts implícitos
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
