package br.com.teste.api.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import br.com.teste.api.web.rest.TestUtil;

public class FuncionarioDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(FuncionarioDTO.class);
        FuncionarioDTO funcionarioDTO1 = new FuncionarioDTO();
        funcionarioDTO1.setId(1L);
        FuncionarioDTO funcionarioDTO2 = new FuncionarioDTO();
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
        funcionarioDTO2.setId(funcionarioDTO1.getId());
        assertThat(funcionarioDTO1).isEqualTo(funcionarioDTO2);
        funcionarioDTO2.setId(2L);
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
        funcionarioDTO1.setId(null);
        assertThat(funcionarioDTO1).isNotEqualTo(funcionarioDTO2);
    }
}
