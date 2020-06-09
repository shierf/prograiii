package com.prograiii2020.swing.Service;

import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Model.DeccModel;

import java.util.List;

public interface DeccServiceInterface {
    public void saveData();
    public String getRow();
    public List<DeccModel> getDecc();
}
