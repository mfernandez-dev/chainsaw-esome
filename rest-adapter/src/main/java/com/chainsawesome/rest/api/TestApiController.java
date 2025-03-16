package com.chainsawesome.rest.api;

import com.chainsawesome.rest.model.Prueba;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController implements TestApi {

    @Override
    public ResponseEntity<Prueba> testGet() {
        return new ResponseEntity<>(new Prueba().responseText("hola"), HttpStatus.OK);
    }
}
