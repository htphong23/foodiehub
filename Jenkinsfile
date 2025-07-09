pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6' // hoặc tên bạn đã cấu hình trong Jenkins (Manage Jenkins → Global Tool Configuration)
        jdk 'jdk11'         // hoặc phiên bản JDK đã cài trong Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                echo '📥 Cloning source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo '🔨 Building the project...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo '📦 Packaging application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build SUCCESSFUL!'
        }
        failure {
            echo '❌ Build FAILED!'
        }
    }
}
