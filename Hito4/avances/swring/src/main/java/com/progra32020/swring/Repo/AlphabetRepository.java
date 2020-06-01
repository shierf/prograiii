package com.progra32020.swring.Repo;

import com.progra32020.swring.Model.AlphabetModel;
import com.progra32020.swring.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlphabetRepository extends JpaRepository<AlphabetModel,Integer> {
    @Query( value = "select letter from alphabet where id = 49 ",nativeQuery = true)
    public AlphabetModel AlphabetModel();
}
