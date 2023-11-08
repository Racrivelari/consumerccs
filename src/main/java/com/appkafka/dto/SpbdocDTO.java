package com.appkafka.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpbdocDTO {

    private String codMsg;
    private String numCtrlCCS;
    private String cnpjBaseEntRespons;
    private int agIf;
    private long ctDep;
    private LocalDate dtIni;
    private LocalDate dtFim;
    private LocalDateTime dtHrBC;
    private LocalDate dtMovto;

}
