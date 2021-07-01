package taewan.server.domain;

import javax.persistence.*;

@Entity
public class Plan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "period_id")
    private Period period;
    private String title;

    public Period getPeriod() {
        return period;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
