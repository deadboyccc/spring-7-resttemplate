package dev.dead.spring7resttemplate.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(BeerClientImpl.class)
class BeerClientImplTest {
    @Autowired
    BeerClient beerClient;

    @Test
    void listBeers() {
    }
}