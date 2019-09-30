pipeline {
	agent any 
	stages {
		stage ('1st stage Started') {
			steps {
				echo 'Hello, this first stage ***'
			}
		}

		stage ('2nd stage Started') {
			input ('Do you want to continue? Haan ya Na?')
		}

		stage ('3rd stage Started') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'This is third stage'
			}
		}

		stage ('4th stage Started') {
			parallel {
				stage ('Unit Testing') {
					echo 'Unit Testing Started ***'
				}

				stage ('Intergration Testing') {
					agent {
						docker {
							resuseNode false
							image 'ubunut'
						}
					}
					steps {
						echo 'Intergration Testing Started ####'
					}
				}
			}
		}
	}
}
