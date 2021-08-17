package taewan.server.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Period {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String period_data;

    public Long getId() {
        return id;
    }

    public String getPeriod_data() {
        return period_data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPeriod_data(String period_data) {
        this.period_data = period_data;
    }
}
