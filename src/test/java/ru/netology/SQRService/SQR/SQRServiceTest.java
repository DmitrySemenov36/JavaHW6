package ru.netology.SQRService.SQR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @Test
    public void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {

        int expected = 0;
        int minNumber = 10;
        int maxNumber = 99;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 8;
        int minNumber = 100;
        int maxNumber = 300;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 68;
        int minNumber = 1000;
        int maxNumber = 11600;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 77;
        int minNumber = 10;
        int maxNumber = 7400;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}