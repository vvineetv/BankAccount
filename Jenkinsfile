pipeline {
	agent any 
	stages {
		stage('1st Stage') {
			steps {
				echo 'Starting first stage of the pipeline'
			}
		}

		stage ('2nd Stage') {
			steps {
				input ('Are you sure you want to continue?')
			}
		}

		stage ('3rd Stage') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'Not Master'
			}
		}

		stage ('4th Stage') {
			parallel {
				stage ('Unit Testing') { 
					steps {
						echo 'Unit Testing started..'
					}
				}

				stage ('Integration Testing') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}
					steps {
						echo 'Integration Testing started..'
					}
				}
			}
		}
	}
}
