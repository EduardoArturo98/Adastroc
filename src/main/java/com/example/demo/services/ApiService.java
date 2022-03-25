package com.example.demo.services;

import com.example.demo.objects.ProObjeto;
import com.example.demo.repository.ProObjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApiService {

    private ProObjetoRepository proObjetoRepository;

    public ProObjeto criarRegistro(String nickname,
                                   String id,
                                   String tecnologia1,
                                   String tecnologia2,
                                   String tecnologia3,
                                   String tecnologia4,
                                   String tecnologia5,
                                   String tecnologia6,
                                   String tecnologia7,
                                   String devweb,
                                   String experiencia,
                                   String senioridade) {

        ProObjeto proObjeto = new ProObjeto();

        proObjeto.setDevweb(devweb);
        proObjeto.setId1(id);
        proObjeto.setNickname(nickname);
        proObjeto.setSenioridade(senioridade);
        proObjeto.setTecnologia1(tecnologia1);
        proObjeto.setTecnologia2(tecnologia2);
        proObjeto.setTecnologia3(tecnologia3);
        proObjeto.setTecnologia4(tecnologia4);
        proObjeto.setTecnologia5(tecnologia5);
        proObjeto.setTecnologia6(tecnologia6);
        proObjeto.setTecnologia7(tecnologia7);
        proObjeto.setExperiencia(experiencia);

        proObjetoRepository.save(proObjeto);
        return proObjeto;
    }
}
