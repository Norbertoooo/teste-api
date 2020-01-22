package br.com.teste.api.service.mapper;

import br.com.teste.api.domain.*;
import br.com.teste.api.service.dto.FuncionarioDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Funcionario} and its DTO {@link FuncionarioDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FuncionarioMapper extends EntityMapper<FuncionarioDTO, Funcionario> {



    default Funcionario fromId(Long id) {
        if (id == null) {
            return null;
        }
        Funcionario funcionario = new Funcionario();
        funcionario.setId(id);
        return funcionario;
    }
}
