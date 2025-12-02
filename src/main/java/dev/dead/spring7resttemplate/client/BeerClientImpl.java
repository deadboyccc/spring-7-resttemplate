package dev.dead.spring7resttemplate.client;

import dev.dead.spring7resttemplate.models.BeerDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Slf4j
public class BeerClientImpl implements BeerClient {
    private final RestTemplateBuilder restTemplateBuilder;

    @Override
    public Page<BeerDTO> listBeers() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity("http://localhost:8080/api/v1/beer", String.class);

        return null;
    }
}
