package com.uabc.edu.clase.backend.repository;

import com.uabc.edu.clase.backend.model.Billionaires;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillionairesRepository extends CrudRepository<Billionaires, Long> {
//    /***
//     * Busca billnarios por apellido
//     * @param lastName apellido
//     * @return List<Billionaires> lista de billonarios
//     */
//
//    public List<Billionaires> findByLastNameBetween(String lastName);
//
//    /****
//     * Busca un billionario por id
//     * @return Billionaires billonario encontrado
//     * @param id identificador de Billonario
//     */
//    public Billionaires findById(long id);

}
