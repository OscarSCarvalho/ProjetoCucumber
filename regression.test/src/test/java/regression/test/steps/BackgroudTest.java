package regression.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import regression.test.runner.Executa;

public class BackgroudTest {

	@Given("que esteja na tela login")
	public void queEstejaNaTelaLogin() {
      Executa.abrirNavegador();
	}

	@Given("informo o usuario {string}")
	public void informoOUsuario(String string) {

	}

	@Given("informo a senha {string}")
	public void informoASenha(String string) {

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {

	}

	@Given("informo o usuario invalido {string}")
	public void informoOUsuarioInvalido(String string) {

	}

	@Given("informo a senha invalida  {string}")
	public void informoASenhaInvalida(String string) {

	}

	@Given("informo o ususario invalido {string}")
	public void informoOUsusarioInvalido(String string) {

	}

	@Given("informo a senha valida  {string}")
	public void informoASenhaValida(String string) {

	}

	@Then("login mensagem de ussuario bloqueado")
	public void loginMensagemDeUssuarioBloqueado() {

	}

}
