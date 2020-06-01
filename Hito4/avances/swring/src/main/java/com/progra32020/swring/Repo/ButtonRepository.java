package com.progra32020.swring.Repo;

import com.progra32020.swring.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ButtonRepository extends JpaRepository <ButtonModel, Integer >{
    @Query( value = "SELECT * FROM button ORDER BY RANDOM() LIMIT 1",nativeQuery = true)
    public ButtonModel getTittleButton();
}
