package com.prograiii2020.swing.Repository;


import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Model.DeccModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DeccRepository extends JpaRepository<DeccModel, Integer> {
    @Query(value = "SELECT * FROM diccionario WHERE word = :wordSelected", nativeQuery = true)
    public DeccModel getWordTranslate(@Param("wordSelected") String wordSelected);

}