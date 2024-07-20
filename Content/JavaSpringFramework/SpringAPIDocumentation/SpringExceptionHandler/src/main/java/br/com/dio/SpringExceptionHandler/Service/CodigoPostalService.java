package br.com.dio.SpringExceptionHandler.Service;

import org.springframework.stereotype.Service;

import br.com.dio.SpringExceptionHandler.handler.BusinessException;

@Service
public class CodigoPostalService {
    public String buscarCidade(String ibge) {
        if (ibge == null || ibge.isEmpty())
            throw new BusinessException("O campo IBGE precisa ser informado");
        else
            return "São Paulo";
    }
}
