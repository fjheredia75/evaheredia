package com.example.evaheredia.model

import javax.persistence.*


@Entity
@Table(name="asistente")
class Asistente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombres: String? =null
    var email: String? =null
    var institucion: String? =null
    var cargo: String?= null
}
