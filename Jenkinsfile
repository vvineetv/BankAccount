pipeline {
	agent any 
	stages {
		stage ('1st Stage') {
			steps {
				echo '1st Stage started!!'
			}
		}

		stage ('2nd Stage') {
			steps {
				input('Are you sure you want to continue?')
			}
		}

		stage ('3rd Stage') {
			when {
				not {
					branch 'master'
				}
			}

			steps {
				echo 'Not master please!!'
			}
		}

		stage ('4th Stage') {
			parallel {
				stage ('Unit Testing') {
					echo 'Unit testing started !!'
				}

				stage ('Intergration Testing') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}

					steps {
						echo 'Integration Testing started!!!'
					}
				}
			}
		}
	}
}
