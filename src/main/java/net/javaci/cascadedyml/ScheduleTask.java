package net.javaci.cascadedyml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTask {

    @Value("${project1.value1}")
    private String p1v1;

    @Value("${project1.value2}")
    private String p1v2;

    @Value("${project2.value1}")
    private String p2v1;

    @Value("${project2.value2}")
    private String p2v2;

    // Comment the followıng lıne out after adding this -Dspring.profiles.active=local as a VM option
    // @Value("${local.value}")
    private String localValue;

    @Scheduled(fixedRate = 5000)
    public void task() {
        System.out.println("project1.value1 = " + p1v1);
        System.out.println("project1.value2 = " + p1v2);
        System.out.println("-------------------------");
        System.out.println("project2.value1 = " + p2v1);
        System.out.println("project2.value2 = " + p2v2);
        System.out.println("-------------------------");
        System.out.println("local.value = " + localValue);
        System.out.println("#########################");
    }
}
