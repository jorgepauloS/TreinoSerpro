import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.funcionariosveiculos.Domain.Models.Funcionario;

public class TestesFuncionario {
    @Test
    public void TesteInstancia() {
        Funcionario func = new Funcionario("Jorge");
        Assertions.assertEquals(new Integer(0), func.Id);
    }
}
