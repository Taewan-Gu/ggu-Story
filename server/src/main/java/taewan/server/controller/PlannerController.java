package taewan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import taewan.server.domain.Period;
import taewan.server.domain.Plan;
import taewan.server.service.PlannerService;

import java.util.List;

@Controller
public class PlannerController {

    private final PlannerService plannerService;

    @Autowired
    public PlannerController(PlannerService plannerService) {
        this.plannerService = plannerService;
    }

    @PostMapping("period/new")
    @ResponseBody
    public ResponseEntity period_create(@RequestBody PeriodForm form) {
        Period period = new Period();
        period.setPeriod_data(form.getPeriod_data());

        plannerService.period_create(period);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping("plan/new")
    @ResponseBody
    public ResponseEntity plan_create(@RequestBody PlanForm form) {
        Plan plan = new Plan();
        if (plannerService.period_findById(form.getPeriod_id()).get() == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        plan.setPeriod(plannerService.period_findById(form.getPeriod_id()).get());
        plan.setTitle(form.getTitle());

        plannerService.plan_create(plan);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("period/all")
    @ResponseBody
    public List<Period> period_all() {
        return plannerService.period_all();
    }
}
