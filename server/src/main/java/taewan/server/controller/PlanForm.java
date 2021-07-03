package taewan.server.controller;

public class PlanForm {
    private Long period_id;
    private String title;

    public Long getPeriod_id() {
        return period_id;
    }


    public String getTitle() {
        return title;
    }

    public void setPeriod_id(Long period_id) {
        this.period_id = period_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
