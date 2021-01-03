package com.chmmf.platform.service.impl;

import com.chmmf.platform.dto.CalculationResultDto;
import com.chmmf.platform.dto.InputDataDto;
import com.chmmf.platform.method.*;
import com.chmmf.platform.model.CalculationResult;
import com.chmmf.platform.repository.CalculationResultRepository;
import com.chmmf.platform.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class PlotServiceImpl implements PlotService {

    private final Method analyticalMethod = new AnalyticalMethod();
    private final Method crankNicholsonScheme = new CrankNicholsonScheme();
    private final Method implicitDifferenceScheme = new ImplicitDifferenceScheme();
    private final CalculationResultRepository calculationResultRepository;

    @Autowired
    public PlotServiceImpl(CalculationResultRepository calculationResultRepository) {
        this.calculationResultRepository = calculationResultRepository;
    }

    @Override
    public String plot(InputDataDto inputDataDto, Model model) {
        try {
            CalculationResult calculationResult = CalculationResult.builder()
                    .name(inputDataDto.getName())
                    .date(null)//Todo add current Time
                    .lambda(inputDataDto.getLambda())
                    .length(inputDataDto.getLength())
                    .radius(inputDataDto.getRadius())
                    .nRefraction(inputDataDto.getNRefraction())
                    .numberPoint(inputDataDto.getNumberPoint())
                    .numberOfMembers(inputDataDto.getNumberOfMembers())
                    .analyticalSolution(analyticalMethod.makeCalculation(inputDataDto))
                    .implicitSchemaSolution(implicitDifferenceScheme.makeCalculation(inputDataDto))
                    .solutionByTheCrankNicholsonScheme(crankNicholsonScheme.makeCalculation(inputDataDto))
                    .build();

            calculationResultRepository.save(calculationResult);

            model.addAttribute("InputDataDto", inputDataDto);
            model.addAttribute("CalculationResultDto", new CalculationResultDto());
            return "result";
        } catch (Exception e) {
            model.addAttribute("Error", e);
            return "error";
        }
    }
}
