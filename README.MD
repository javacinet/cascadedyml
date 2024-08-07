When u run the project you wıll get the followıng error:

    Could not resolve placeholder 'local.value' in value "${local.value}"

You should add the followıng confıguratıon as a ****_VM option_**** in run configuration 

    -Dspring.profiles.active=local

Or you can delete the followıng value in ScheduleTask.java

    @Value("${local.value}")
    private String localValue;
