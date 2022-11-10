package com.example.evaheredia.repository

import com.example.evaheredia.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AsistenteRepository:JpaRepository<Asistente, Long> {

}