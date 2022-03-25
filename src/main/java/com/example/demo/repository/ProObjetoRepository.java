package com.example.demo.repository;

import com.example.demo.objects.ProObjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProObjetoRepository extends JpaRepository<ProObjeto, Long> {

}
