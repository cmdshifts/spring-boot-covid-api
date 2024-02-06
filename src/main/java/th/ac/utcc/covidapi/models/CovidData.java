package th.ac.utcc.covidapi.models;

public class CovidData {
    private Integer year;
    private Integer weeknum;
    private String province;
    private Long new_case;
    private Long total_case;
    private Long new_case_excludeabroad;
    private Long total_case_excludeabroad;
    private Long new_death;
    private Long total_death;
    private String update_date;

    @Override
    public String toString() {
        return "CovidData{" +
                "year=" + year +
                ", weeknum=" + weeknum +
                ", province='" + province + '\'' +
                ", new_case=" + new_case +
                ", total_case=" + total_case +
                ", new_case_excludeabroad=" + new_case_excludeabroad +
                ", total_case_excludeabroad=" + total_case_excludeabroad +
                ", new_death=" + new_death +
                ", total_death=" + total_death +
                ", update_date='" + update_date + '\'' +
                '}';
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getNew_case() {
        return new_case;
    }

    public void setNew_case(Long new_case) {
        this.new_case = new_case;
    }

    public Long getTotal_case() {
        return total_case;
    }

    public void setTotal_case(Long total_case) {
        this.total_case = total_case;
    }

    public Long getNew_case_excludeabroad() {
        return new_case_excludeabroad;
    }

    public void setNew_case_excludeabroad(Long new_case_excludeabroad) {
        this.new_case_excludeabroad = new_case_excludeabroad;
    }

    public Long getTotal_case_excludeabroad() {
        return total_case_excludeabroad;
    }

    public void setTotal_case_excludeabroad(Long total_case_excludeabroad) {
        this.total_case_excludeabroad = total_case_excludeabroad;
    }

    public Long getNew_death() {
        return new_death;
    }

    public void setNew_death(Long new_death) {
        this.new_death = new_death;
    }

    public Long getTotal_death() {
        return total_death;
    }

    public void setTotal_death(Long total_death) {
        this.total_death = total_death;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }
}
