#!/usr/bin/groovy

def call(String message, Closure action) {

    return steps.echo("This is a node override")

}
