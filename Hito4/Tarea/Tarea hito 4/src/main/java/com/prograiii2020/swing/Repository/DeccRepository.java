package com.prograiii2020.swing.Repository;


import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Model.DeccModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeccRepository extends JpaRepository<DeccModel, Integer> {

}