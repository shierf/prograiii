package com.procesualHito3.CoronaVirusWeb.Controller;

import com.procesualHito3.CoronaVirusWeb.Model.VirusModel;
import com.procesualHito3.CoronaVirusWeb.Services.VirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class userController {
    @Autowired
    private VirusService virusService;

    @GetMapping("/coronavirus")
    public ResponseEntity<List<VirusModel>> getAllDepart() {
        try {
            List<VirusModel> depar = virusService.getAllDepar();

            if (depar.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(depar, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/coronavirus")
    public ResponseEntity save(@RequestBody VirusModel VIRUS) {
        try {
            return new ResponseEntity<>(virusService.save(VIRUS), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @GetMapping("/coronavirus/{idcoronavirus}")
    public ResponseEntity<VirusModel> getDeparByIdPer(@PathVariable("idcoronavirus") Integer idDep) {
        try {
            VirusModel DepModel = virusService.getDeparByIdPer(idDep);

            if ( DepModel!= null) {
                return new ResponseEntity<>(DepModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/coronavirus/{idcoronavirus}")
    public ResponseEntity<VirusModel> update(@PathVariable("idcoronavirus") Integer idDep, @RequestBody VirusModel DepModel) {
        try {
            VirusModel DUpdate = virusService.update(DepModel, idDep);
            if (DUpdate != null) {
                return new ResponseEntity<>(DUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/coronavirus/{idcoronavirus}")
    public ResponseEntity<String> delete(@PathVariable("idcoronavirus") Integer idDep) {
        try {
            virusService.delete(idDep);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
