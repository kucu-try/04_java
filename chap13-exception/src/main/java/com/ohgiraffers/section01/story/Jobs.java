package main.java.com.ohgiraffers.section01.story;

public class Jobs {
    private int num;
    private String jobName;



    public Jobs(int num, String jobName) {
        this.jobName = jobName;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "num=" + num +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
