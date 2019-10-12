pipeline {
	agent any
	stages {
		stage ('Stage 1') {
			steps {
				echo 'This is Stage 1'
			}
		}

		stage ('Stage 2') {
			steps {
				input ('Are you sure that you want to continue? Y/N')
			}
		}

		stage ('Stage 3') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'I am not master!!'
			}
		}

		stage ('Stage 4') {
			parallel {
				stage ('Unit Testing') {
					steps {
						echo 'Unit Testing running.. Please wait..'
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
						echo 'Integration Testing started.. Please wait...'
					}
				}
			}
		}
	}
}
