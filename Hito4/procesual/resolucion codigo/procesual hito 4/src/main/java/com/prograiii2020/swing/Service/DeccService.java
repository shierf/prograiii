package com.prograiii2020.swing.Service;

import com.prograiii2020.swing.Model.AlphabetModel;
import com.prograiii2020.swing.Model.DeccModel;
import com.prograiii2020.swing.Repository.DeccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeccService implements DeccServiceInterface {

@Autowired
public DeccRepository deccRepository;
    @Override
    public void saveData() {
        if (deccRepository.count() == 0) {
                deccRepository.save(new DeccModel("MONDAY", "SEGUNDA-FEIRA","LUNES"));
                deccRepository.save(new DeccModel("TUESDAY", "TERCA-FEIRA","MARTES"));
                deccRepository.save(new DeccModel("WEDMESDAY", "QUARTA-FEIRA","MIERCOLES"));
                deccRepository.save(new DeccModel("THUSDAY", "QUINTA-FEIRA","JUEVES"));
                deccRepository.save(new DeccModel("FRIDAY", "SEXTA-FEIRA","VIERNES"));
                deccRepository.save(new DeccModel("SATURDAY", "SABADO","SABADO"));
                deccRepository.save(new DeccModel("SUNDAY", "DOMINGO","DOMINGO"));
        }
    }

    @Override
    public String traducir(String t, String l) {
        DeccModel deccMode = deccRepository.getWordTranslate(t);
        String ingles = deccMode.getIngles();
        String ln_i = "INGLES";
        String word = deccMode.getWord();
        String ln_w = "ESPAÑOL";
        String portugues = deccMode.getPortugues();
        String ln_p = "PORTUGUES";
        String traduccion = "";
        if(l.equals(ln_i)){
            traduccion = ingles;
        }
        if(l.equals(ln_w)){
            traduccion = word;
        }
        if(l.equals(ln_p)){
            traduccion = portugues;
        }
        return traduccion;

    }

    @Override
    public String getRow() {
        return null;
    }

    @Override
    public List<DeccModel> getDecc() {
        return null;
    }
}
