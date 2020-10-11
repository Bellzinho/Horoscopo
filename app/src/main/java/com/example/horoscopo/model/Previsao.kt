package com.example.horoscopo.model

@JsonIgnoreProperties(ignoreUnknown = true)
data class Previsao(var signo: String, var texto: String, var autor: String, var urlOrigem: String,
                    var dataAcesso: DataAcesso)

data class DataAcesso(var date: String, var timezone_type: String, var timezone: String)
