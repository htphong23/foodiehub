pipeline {
  agent any

  tools {
    maven 'Maven 3.9'
    jdk 'JDK 11'
  }

  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/htphong23/foodiehub.git'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean install -DskipTests'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
      }
    }
  }

  post {
    success {
      echo '✅ Build thành công!'
    }
    failure {
      echo '❌ Build thất bại!'
    }
  }
}
