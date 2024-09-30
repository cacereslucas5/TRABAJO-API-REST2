package org.lucas.hibernateapp.apirest.repositories;


import org.lucas.hibernateapp.apirest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
