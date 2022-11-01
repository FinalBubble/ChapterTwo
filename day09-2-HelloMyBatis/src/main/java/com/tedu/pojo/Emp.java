package com.tedu.pojo;

/*
* 和数据库的Emp表进行映射的类
* */

public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Double salary;

    @Override
    public String toString(){
        return "Emp{" +
                "id=" + id +
                ",name=" + name +
                ",job=" + job +
                ",salary=" + salary +
                "}" ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
