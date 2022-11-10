package com.example.evaheredia.service

import com.example.evaheredia.model.Asistente
import com.example.evaheredia.repository.AsistenteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AsistenteService {

    @Autowired
    lateinit var asistenteRepository: AsistenteRepository

    fun list():List<Asistente>{
        return asistenteRepository.findAll()
    }

    fun save(asistente: Asistente):Asistente{
        return asistenteRepository.save(asistente)
    }

}