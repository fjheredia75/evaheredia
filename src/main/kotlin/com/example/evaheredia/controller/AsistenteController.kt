package com.example.evaheredia.controller

import com.example.evaheredia.model.Asistente
import com.example.evaheredia.service.AsistenteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/asistente")
class AsistenteController {

    @Autowired
    lateinit var asistenteService: AsistenteService

    @GetMapping
    fun list():List<Asistente>{
        return asistenteService.list()
    }

    @PostMapping
    fun save(@RequestBody asistente:Asistente):Asistente{
        return asistenteService.save(asistente)
    }
}