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

    stage('Check jenkinsfile') {
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

    stage('Push image') {
      steps {
        sh '''#!/bin/bash
        echo "Push image done"
        '''
      }
    }

    stage('Deploy image') {
      steps {
        sh '''#!/bin/bash
        echo "Deploy image done"
        '''
      }
    }
  }
}