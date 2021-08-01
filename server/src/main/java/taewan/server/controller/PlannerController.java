package taewan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import taewan.server.domain.Period;
import taewan.server.domain.Plan;
import taewan.server.domain.Todolist;
import taewan.server.service.PlannerService;

import javax.transaction.Transactional;
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
    @Transactional
    public ResponseEntity period_create(@RequestBody PeriodForm form) {
        Period period = new Period();
        period.setPeriod_data(form.getPeriod_data());

        plannerService.period_create(period);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping("plan/new")
    @ResponseBody
    @Transactional
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

    @PostMapping("todo/new")
    @ResponseBody
    @Transactional
    public ResponseEntity todo_create(@RequestBody TodolistForm form) {
        Todolist todolist = new Todolist();
        if (plannerService.plan_findById(form.getPlan_id()).get() == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        todolist.setPlan(plannerService.plan_findById(form.getPlan_id()).get());
        todolist.setTodo(form.getTodo());
        todolist.setTodo_data(form.getTodo_data());

        plannerService.todolist_create(todolist);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("period/all")
    @ResponseBody
    public List<Period> period_all() {
        return plannerService.period_all();
    }

    @GetMapping("plan/all")
    @ResponseBody
    public List<Plan> plan_all() {
        return plannerService.plan_all();
    }

    @GetMapping("todo/all")
    @ResponseBody
    public List<Todolist> todolist_all() {
        return plannerService.todolist_all();
    }

    @GetMapping("plan/get")
    @ResponseBody
    public List<Plan> plan_findByPeriod(@RequestParam(value = "period_id", required = false) Long period_id) {
        return plannerService.plan_findByPeriod(period_id);
    }

    @GetMapping("todo/get")
    @ResponseBody
    public List<Todolist> todolist_findByPlan(@RequestParam(value = "plan_id", required = false) Long plan_id) {
        return plannerService.todolist_findByPlan(plan_id);
    }
}
