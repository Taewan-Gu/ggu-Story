package taewan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import taewan.server.domain.Period;
import taewan.server.service.PlannerService;

@Controller
public class PlannerController {

    private final PlannerService plannerService;

    @Autowired
    public PlannerController(PlannerService plannerService) {
        this.plannerService = plannerService;
    }

    @PostMapping("members/new")
    @ResponseBody
    public ResponseEntity period_create(@RequestBody PeriodForm form) {
        Period period = new Period();
        period.setPeriod_data(form.getPeriod_data());

        plannerService.period_create(period);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
