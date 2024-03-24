package cucumbertests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ListUtils;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicateRemoverStep {

    List<String> listaVogais;
    List<Integer> listaNumeros;
    List<String> resultListVogais;
    List<Integer> resultListNumeros;




    @Given("I provide a String List")
    public void i_provide_a_string_list() {
        listaVogais = Arrays.asList("a", "e", "o", "i", "e", "a");

    }

    @When("the removeDuplicatesAndOrder static method is executed")
    public void the_remove_duplicates_and_order_static_method_is_executed() {
        resultListVogais = ListUtils.removeDuplicatesAndOrder(listaVogais);
    }

    @Then("the result should be duplicate free and values sorted in an alphabetical order")
    public void the_result_should_be_duplicate_free_and_values_sorted_in_an_alphabetical_order() {
        List<String> expectedResultVogais = Arrays.asList("a", "e", "i", "o");
        assertEquals(expectedResultVogais, resultListVogais);
    }

    @Given("I provide a Integer List")
    public void i_provide_a_integer_list() {
        listaNumeros = Arrays.asList(3, 5, 1, 3, 2, 5);
    }

    @When("the removeDuplicatesAndOrder static method is executed om the integer list")
    public void the_remove_duplicates_and_order_static_method_is_executed_om_the_integer_list() {
        resultListNumeros = ListUtils.removeDuplicatesAndOrder(listaNumeros);
    }

    @Then("the result should be duplicate free and values sorted in an ascending order")
    public void the_result_should_be_duplicate_free_and_values_sorted_in_an_ascending_order() {
        List<Integer> expectedResultNumeros = Arrays.asList(1, 2, 3, 5);
        assertEquals(expectedResultNumeros, resultListNumeros );
    }
}
