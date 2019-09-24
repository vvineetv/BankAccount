pipeline {
	agent any 
	stages {
		stage ('1st Stage') {
			steps {
				echo 'Hello!! Welcome to pipeline'
			}
		}

		stage ('2nd Stage') {
			steps {
				input ('Do you want to continue to the next step?')
			}
		}

		stage ('3rd Stage') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'Hello this is not master'
			}
		}

		stage ('4th Stage') {
			parallel {
				stage ('Unit Test') {
					steps {
						echo 'Running Unit Test...'
					}
				}

				stage ('Intergration Test') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}
					steps {
						echo 'Running Intergration Test...'
					}
				}
			}
		}
	}
}
