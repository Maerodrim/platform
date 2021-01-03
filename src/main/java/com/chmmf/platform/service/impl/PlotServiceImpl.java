package com.chmmf.platform.service.impl;

import com.chmmf.platform.dto.CalculationResultDto;
import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.service.PlotService;
import org.springframework.ui.Model;

public class PlotServiceImpl implements PlotService {
    @Override
    public String makeCalculation(InputDataDto inputDataDto, Model model) {
        try {
            model.addAttribute("InputDataDto", inputDataDto);
            model.addAttribute("CalculationResultDto", new CalculationResultDto());
            return "result";
        }
        catch (Exception e){
            model.addAttribute("Error", e);
            return "error";
        }
    }
}
