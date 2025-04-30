package com.example.GitHubActionsUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void myMethodShouldReturnSum() {
        //Arrange
        Controller controller = new Controller();


        //act
        int result = controller.myMethod(1, 2);

        //assert
        assertEquals(3, result);
    }

    @Test
    void divShouldReturnQuotient() {
        //Arrange
        Controller controller = new Controller();


        //act
        double result = controller.div(5, 2);

        //assert
        assertEquals(2.5, result);
    }


}