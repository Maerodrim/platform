package com.chmmf.platform.controller;

import com.chmmf.platform.dto.CalculationResultDto;
import com.chmmf.platform.dto.InputDataDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlotController {

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start(Model model) {
        model.addAttribute("InputDataDto", new InputDataDto());
        model.addAttribute("CalculationResultDto", new CalculationResultDto());
        return "start";
    }

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public String gerResult(@ModelAttribute InputDataDto inputDataDto, Model model){
        model.addAttribute("InputDataDto", inputDataDto);
        model.addAttribute("CalculationResultDto", new CalculationResultDto());
        return "result";
    }
}
