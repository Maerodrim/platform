package com.chmmf.platform.service;

import com.chmmf.platform.dto.InputDataDto;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface PlotService {
    String makeCalculation(InputDataDto inputDataDto, Model model);
}
