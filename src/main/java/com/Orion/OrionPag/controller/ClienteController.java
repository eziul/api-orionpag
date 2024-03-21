package com.Orion.OrionPag.controller;

import com.Orion.OrionPag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(2L);
        cliente1.setNome("Luiz Guilherme");
        cliente1.setTelefone("45 99925-5274");
        cliente1.setEmail("ziulluiz@orion.com");

        var cliente2 = new Cliente();
        cliente2.setId(1L);
        cliente2.setNome("Ingrid Frances");
        cliente2.setTelefone("45 99258-5457");
        cliente2.setEmail("Ingridinha@orion.com");


        return Arrays.asList(cliente1, cliente2);
    }
}
