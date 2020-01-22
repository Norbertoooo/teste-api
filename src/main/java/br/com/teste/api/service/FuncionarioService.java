package br.com.teste.api.service;

import br.com.teste.api.service.dto.FuncionarioDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link br.com.teste.api.domain.Funcionario}.
 */
public interface FuncionarioService {

    /**
     * Save a funcionario.
     *
     * @param funcionarioDTO the entity to save.
     * @return the persisted entity.
     */
    FuncionarioDTO save(FuncionarioDTO funcionarioDTO);

    /**
     * Get all the funcionarios.
     *
     * @return the list of entities.
     */
    List<FuncionarioDTO> findAll();


    /**
     * Get the "id" funcionario.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<FuncionarioDTO> findOne(Long id);

    /**
     * Delete the "id" funcionario.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
