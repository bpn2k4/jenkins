pipeline {
  agent any

  stages {
    stage('Check Docker') {
      steps {
        sh '''#!/bin/bash
        whoami
        ls -l /var/run/docker.sock
        docker ps -a
        docker images
        '''
      }
    }
  }
}