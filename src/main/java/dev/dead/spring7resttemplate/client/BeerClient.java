package dev.dead.spring7resttemplate.client;

import dev.dead.spring7resttemplate.models.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {
    Page<BeerDTO> listBeers();
}
