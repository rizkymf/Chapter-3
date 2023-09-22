package demotest.controller;

import org.binaracademy.demotest.controller.UserInputController;
import org.binaracademy.demotest.model.Invoice;
import org.binaracademy.demotest.model.Pesanan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputControllerTest {

    InputStream inputStream = System.in;
    UserInputController userInputController;

    @BeforeEach
    void init() {

    }

    @Test
    void testInputMainMenu_exit() {
        String userInput = "0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        userInputController = new UserInputController();

        assertDoesNotThrow(() -> userInputController.inputMainMenu());
    }

    @Test
    void testInputMainMenu_pesanMakanan() {
        String userInput = "1\n2\n" +
                "3\n3\n" +
                "99\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        userInputController = new UserInputController();

        Invoice invoice = assertDoesNotThrow(() -> userInputController.inputMainMenu());
        assertEquals(2, invoice.getPesananList().size());
        assertEquals(45000, invoice.getTotalPembayaran());
        invoice.getPesananList().forEach(pesanan -> {
            assertTrue(!pesanan.getNamaProduk().isEmpty());
            assertTrue(pesanan.getQuantity() > 0);
        });
    }

    @Test
    void testInputMainMenu_noProduct() {
        String userInput = "4";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        userInputController = new UserInputController();

        assertThrows(NoSuchElementException.class, () -> userInputController.inputMainMenu());
    }

    @Test
    void testInputMainMenu_inputChar() {
        Invoice expectedInvoice = new Invoice(new ArrayList<>(), 0);

        String userInput = "3\na";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);
        userInputController = new UserInputController();

        Invoice invoice = userInputController.inputMainMenu();

        assertEquals(expectedInvoice, invoice);
    }

}
