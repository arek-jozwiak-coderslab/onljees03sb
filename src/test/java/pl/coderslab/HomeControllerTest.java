package pl.coderslab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class HomeControllerTest {

    private BookService bookService;

    @BeforeEach
    public void init() {
        bookService = mock(BookService.class);
    }

    @Test
    void home() {
        HomeController homeController = new HomeController(bookService);
        assertEquals("homepage", homeController.home());

    }
}
