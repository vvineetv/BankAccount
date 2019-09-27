pipeline {
	agent any 
	stages {
		stage ('Stage No:1') {
			steps {
				echo 'This is first pipeline running in Dhanbad !!'
			}
		}

		stage ('Stage No:2') {
			steps {
				input('Do you want to move ahead?')
			}
		}

		stage ('Stage No:3') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'Not master !!'
			}
		}

		stage ('Stage No:4') {
			parallel {
				stage ('Unit Test Phase') {
					steps {
						echo 'Performing Unit Test. Please wait...'
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
						echo 'Performing Intergration Test. Please wait...'
					}
				}
			}
		}
	}
}
