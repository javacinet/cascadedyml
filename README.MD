If you want to use values in application-local.yml, 
you should add the followıng confıguratıon as a ****_VM option_**** in run configuration

    -Dspring.profiles.active=local

If you comment out localValue in ScheduleTask.java without adding active profile, you wıll get the followıng error:

    Could not resolve placeholder 'local.value' in value "${local.value}"
