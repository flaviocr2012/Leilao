package leilao;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class HelloWorldMockito {

    @Test
    void hello() {
        // Mockito não acessa o banco de dados. Ele simula o comportamento de uma classe.
        // Ao chamar o método buscartodos, ele finge que chama e devolve uma lista vazia.
        // Mockito, cria um mock da minha classe leilão dao.
        // Se tenho uma classe que depende de Leilao Dao, eu passo uma classe Leilao dao mockada.
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);
        List<Leilao> todos = mock.buscarTodos();
        Assert.assertTrue(todos.isEmpty());

    }
}
