pipeline {
	agent any 
	stages {
		stage ('stage 1') {
			steps {
				echo 'Welcome to the pipeline first stage !!'
			}
		}

		stage ('stage 2') {
			steps {
				input ('Do you want to continue? Yes or No?')
			}
		}

		stage ('stage 3') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'Hello!! This is stage 3'
			}
		}

		stage ('stage 4') {
			parallel {
				stage ('Unit Test') {
					steps {
						echo 'Running Unit Test. Please wait.......'
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
						echo 'Running Intergration Test. You have to wait !!'
					}
				}
			}
		}
	}
}
