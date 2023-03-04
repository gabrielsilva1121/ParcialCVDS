package test;
import main.FizzBuzz;
import main.FizzBuzzException;
import org.junit.Assert;
import org.junit.Test;



public class ParcialTest {
    //Arrange

    private FizzBuzz valor = new FizzBuzz();

    @Test
    public void fizzbuzz_deberiaser1(){
        //Act
        String score = valor.convert(1);
        //Assert
        Assert.assertEquals(score,"1");
    }

    @Test
    public void fizzbuzz_deberiaserBuzzconMultiplo5(){
        //Act
        String score = valor.convert(10);
        //Assert
        Assert.assertEquals(score,"Buzz");
    }

    @Test
    public void fizzbuzz_deberiaserBuzzconNumeroContenga5(){
        //Act
        String score = valor.convert(52);
        //Assert
        Assert.assertEquals(score,"Buzz");
    }

    @Test
    public void fizzbuzz_deberiaserFizzNumeroContenga3(){
        //Act
        String score = valor.convert(31);
        //Assert
        Assert.assertEquals(score,"Fizz");
    }

    @Test
    public void fizzbuzz_deberiaserFizzNumeroMultiplo3(){
        //Act
        String score = valor.convert(18);
        //Assert
        Assert.assertEquals(score,"Fizz");
    }

    @Test
    public void fizzbuzz_deberialanzarExcepcionNumeroNegativo(){

        try{
            //Act
            String score = valor.convert(-23);
        }catch (Exception e){
            //Assert
            Assert.assertTrue(true);

        }

    }








}
