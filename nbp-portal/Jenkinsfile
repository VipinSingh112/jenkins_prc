pipeline {
    agent any

    environment {
        LIFERAY_HOME = "/opt/liferay"  // Update with your Liferay installation path
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/your-repo.git'  // Replace with your Git repo
            }
        }

        stage('Build with Gradle') {
            steps {
                sh './gradlew clean build'  // Run Gradle build
            }
        }

        stage('Deploy to Liferay') {
            steps {
                sh 'cp modules/build/libs/*.jar $LIFERAY_HOME/deploy/'  // Copy jar to Liferay deploy folder
            }
        }
    }
}
