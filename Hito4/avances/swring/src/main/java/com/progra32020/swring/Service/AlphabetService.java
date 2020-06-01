package com.progra32020.swring.Service;

import com.progra32020.swring.Model.AlphabetModel;
import com.progra32020.swring.Model.ButtonModel;
import com.progra32020.swring.Repo.AlphabetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AlphabetService implements AlphabetServiceInterface {
    private static  final String q_p ="q; w; e; r; t; y; u; i; o; p";
    private static  final String a_l ="a, s, d, f, g, h, j, k, l";
    private static  final String z_m ="z- x- c- v- b- n- m";
    @Autowired
    private AlphabetRepository alphabetRepository;
    @Override
    public void saveData() {
        if(alphabetRepository.count()==0){
        alphabetRepository.save(new AlphabetModel(q_p));
        alphabetRepository.save(new AlphabetModel(a_l));
        alphabetRepository.save(new AlphabetModel(z_m));
    }
    }


    @Override
    public List<AlphabetModel> getAllLettersFirst() {
        return new ArrayList<AlphabetModel>(alphabetRepository.findAll());

    }

    @Override
    public List<AlphabetModel> getAllLettersSecond() {
        return null;
    }

    @Override
    public List<AlphabetModel> getAllLettersThree() {
        return null;
    }
}
