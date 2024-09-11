pipeline {
  agent any

  stages {
    stage('Check Git') {
      steps {
        sshagent(credentials: ['ssh-private-key']) {
          sh '''#!/bin/bash
          git clone git@github.com:bpn2k4/self-tls.git source
          cd source
          cat main.go
          git status
          '''
        }
      }
    }
  }
}