#!groovy
println('------------------------------------------------------------------Import Job CI/Job1')
def pipelineScript = new File('/var/jenkins_config/jobs/job1-pipeline.groovy').getText("UTF-8")

pipelineJob('CI/Job1') {
    description("Job Pipline 1")
    parameters {
         stringParam {
            name('PARAM1')
            defaultValue('PARAM1')
            description("PARAM1 Desc")
            trim(false)
        }
        stringParam {
            name('BRANCH')
            defaultValue('master')
            description("BRANCH Select")
            trim(false)
        }
         booleanParam {
            name('SKIP_TESTS')
            defaultValue(false)
            description(" SKIP_TESTS contole")
        }
    }
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}