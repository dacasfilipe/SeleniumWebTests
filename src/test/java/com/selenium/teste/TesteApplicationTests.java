package com.selenium.teste;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
@SpringBootTest
class TesteApplicationTests {

	@Test
	public void entrarNoFacebook() {
		//pasta onde está o driver
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		//Criar um objeto Webdriver para a acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//informar o tempo máximo de resposta
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//informar o endereço que quer abrir
		navegador.get("http://facebook.com");
		//Encontrando o elemento email e password
		navegador.findElement(By.id("email")).sendKeys("filipedacas@hotmail.com");
		navegador.findElement(By.id("pass")).sendKeys("123456");
		//Encontrando o botão entrar
		navegador.findElement(By.name("login")).click();
		//navegador.findElement(By.id("u_0_5_KI")).click();
	}

	@Test
	public void entrarNoEstudante() {
		//pasta onde está o driver
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		//Criar um objeto Webdriver para a acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//informar o tempo máximo de resposta
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//informar o endereço que quer abrir
		navegador.get("https://estudante.sesisenai.org.br/login");
		//Encontrando o elemento email e password
		navegador.findElement(By.name("user")).sendKeys("filipedacas@hotmail.com");
		navegador.findElement(By.name("password")).sendKeys("123456");
		//Encontrando o botão entrar
		navegador.findElement(By.xpath("//button[text()='Entrar']")).click();
		//navegador.findElement(By.className("login__btn")).click();
		//pegando informações por texto
		//String nome = navegador.findElement(By.xpath("")).getText();

	}

}
