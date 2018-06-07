#!/usr/bin/groovy

import org.jenkinsci.plugins.workflow.cps

def call(String message, CpsClosure2 action) {

    return steps.echo("This is a node override")

}
