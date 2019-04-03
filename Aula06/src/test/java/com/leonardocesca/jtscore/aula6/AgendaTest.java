package com.leonardocesca.jtscore.aula6;

import org.junit.Test;
import static org.junit.Assert.*;

public class AgendaTest {

    private Agenda dadosContatos = new Agenda();
    
    @Test
    public void testaAdicionarContato() {
        Contato contatos = new Contato(1, "Leo");
        dadosContatos.adicionarContato(contatos);
        assertEquals(1,dadosContatos.listarContatos());
    }

    @Test
    public void testaRemoverContato() {
        dadosContatos.removerContato("Leo");
        assertEquals(0,dadosContatos.listarContatos());
    }
    
    @Test
    public void testeProcurarNome() {
        Contato contatos = new Contato(1, "Leo");
        dadosContatos.adicionarContato(contatos);
        assertEquals(1,dadosContatos.buscarNome("Leo"));
    }

    @Test
    public void testeProcurarId() {
        assertEquals("Leo",dadosContatos.buscarId(1));
    }

    @Test
    public void testeListarContato() {
        assertEquals("Contato: Leo ID: 1", dadosContatos.listarContatos());
    }
}
