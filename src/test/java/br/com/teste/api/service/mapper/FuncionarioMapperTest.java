package br.com.teste.api.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class FuncionarioMapperTest {

    private FuncionarioMapper funcionarioMapper;

    @BeforeEach
    public void setUp() {
        funcionarioMapper = new FuncionarioMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 2L;
        assertThat(funcionarioMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(funcionarioMapper.fromId(null)).isNull();
    }
}
