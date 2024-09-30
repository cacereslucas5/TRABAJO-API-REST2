package org.lucas.hibernateapp.apirest.services;

import org.lucas.hibernateapp.apirest.entities.Localidad;
import org.lucas.hibernateapp.apirest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
