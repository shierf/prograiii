package com.progra32020.swring.Service;

import com.progra32020.swring.Model.ButtonModel;
import com.progra32020.swring.Repo.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService implements ButtonServiceInterface {
    private static  final String titleButon = "SAVE; DELETE; CANCEL; LOGIN; LOGOUT; UPDATE";
    @Autowired
    private ButtonRepository buttonRepository;

    @Override
    public void saveData() {
        if(buttonRepository.count()==0){
            String TittleButton[] =titleButon.split(";") ;
            for(String titleButon : TittleButton){
                buttonRepository.save(new ButtonModel(titleButon));

            }


        }


    }

    @Override
    public String obtenerRegistro() {
   ButtonModel bModel = buttonRepository.getTittleButton();
   String tittleButton = bModel.getTitleButton();
    return tittleButton;
    }

    @Override
    public List<ButtonModel> getAllTitleButton() {
//        List<ButtonModel> allTitles = new ArrayList<ButtonModel>();
//        buttonRepository.findAll().forEach(allTitles::add);
//        return allTitles;
        return new ArrayList<ButtonModel>(buttonRepository.findAll());
    }
}
