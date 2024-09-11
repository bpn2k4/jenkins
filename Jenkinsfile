pipeline {
  agent any

  stages {
    stage('Clone git') {
      steps {
        sh '''#!/bin/bash
        git status
        '''
      }
    }

    stage('Build image') {
      steps {
        sh '''#!/bin/bash
        cat Jenkinsfile
        '''
      }
    }

    stage('Build image') {
      steps {
        sh '''#!/bin/bash
        echo "Build image done"
        '''
      }
    }
  }
}