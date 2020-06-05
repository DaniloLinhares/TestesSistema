package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import java.util.List;

public class MadeUpBusinessSteps {

    /* montarListaAPartirListaPreDefinida */

    @When("o usuário/cliente seleciona o(s) seguinte(s) itens:/produto:")
    public void selecionarItemListaPreDefinida(DataTable dataTable) {
        List<String> ssl = dataTable.asList();
        for(String a : ssl){
            System.out.println("LISTA: " + a);
        }
    }

    // REGEX
    // @When("^.*seleciona os? seguintes? (?:itens|produto):$")
    // public void selecionarItemListaPreDefinida(DataTable dataTable) {
    // }

    @Given("o usuário escolhe a lista de compras frutas")
    public void oUsuárioEscolheAListaDeComprasFrutas() {
    }

    @When("o usuário seleciona o item uva")
    public void oUsuárioSelecionaOItemUva() {
    }

    @When("o usuário finaliza a seleção")
    public void oUsuárioFinalizaASeleção() {
    }

    @Then("os seguintes itens são adicionados à lista de compras:")
    public void osSeguintesItensSãoAdicionadosÀListaDeCompras(DataTable dataTable) {
    }

    /* adicionarItensAvulsos */

    @Given("a lista de compras contém {int} itens")
    public void criarListaComItens(int quantidadeItens) {
    }

    @When("o usuário adiciona {int} itens avulsos")
    public void adicionarItensAvulsos(int quantidadeItensAvulsos) {
    }

    @Then("a quantidades de itens da lista é atualizado para {int}")
    public void validarQuantidadeItensListaCompras(int quantidadeItensLista) {
    }

}


