package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RentalTest {

    private Customer customer;
    private final Movie newReleaseMovie = new NewReleaseMovie("Rambo");
    private final Movie newReleaseMovie2 = new NewReleaseMovie("Rambo2");
    private final Movie childrenMovie = new ChildrenMovie("Winipoo");
    private final Movie regularMovie = new RegularMovie("Winipoa");


    @BeforeEach
    public void setup() {

        customer = new Customer("Hisler");
        Locale.setDefault(new Locale("en_EN"));
    }

    @Test

    public void whenRentedANewRelase_AmountShouldBe_9_0() throws Exception {
        customer.addRental(new Rental(newReleaseMovie, 3));
        customer.statement();
        assertEquals(9.0,customer.getTotal());
        assertEquals(2,customer.getFrequentRenterPoints());
    }


    @Test
    public void whenRentedANewRelase_AmountShouldBe_3_0() throws Exception {
        customer.addRental(new Rental(newReleaseMovie, 1));
        customer.statement();
        assertEquals(3.0,customer.getTotal());
        assertEquals(1,customer.getFrequentRenterPoints());
    }


    @Test
    public void whenRentedTwoNewRelase_AmountShouldBe_18_0() throws Exception {
        customer.addRental(new Rental(newReleaseMovie, 3));
        customer.addRental(new Rental(newReleaseMovie2, 3));
        customer.statement();
        assertEquals(18.0,customer.getTotal());
        assertEquals(4,customer.getFrequentRenterPoints());
    }


    @Test

    public void whenRentedAChildrenMovie_AmountShouldBe_1_5() throws Exception {
        customer.addRental(new Rental(childrenMovie, 2));
        customer.statement();
        assertEquals(1.5,customer.getTotal());
        assertEquals(1,customer.getFrequentRenterPoints());

    }


    @Test
    public void whenRentedAChildrenMovieForFourDays_AmountShouldBe_1_5() throws Exception {
        customer.addRental(new Rental(childrenMovie, 4));
        customer.statement();
        assertEquals(3.0,customer.getTotal());
        assertEquals(1,customer.getFrequentRenterPoints());
    }


    @Test
    public void whenRentedARegular_AmountShouldBe_2_0() throws Exception {
        customer.addRental(new Rental(regularMovie, 1));
        customer.statement();
        assertEquals(2.0,customer.getTotal());
        assertEquals(1,customer.getFrequentRenterPoints());
    }

    @Test
    public void whenRentedARegularMovieForSixDays_AmountShouldBe_8_0() throws Exception {
        customer.addRental(new Rental(regularMovie, 6));
        customer.statement();
        assertEquals(8.0,customer.getTotal());
        assertEquals(1,customer.getFrequentRenterPoints());
    }


}

