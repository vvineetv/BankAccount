pipeline {
	agent any
	stages {
		stage ('Pehla Stage') {
			steps {
				echo 'Pehla stage prarambh'
			}
		}

		stage ('Doosra Stage') {
			steps {
				input ('Aap aage badhna chahate hain?')
			}
		}

		stage ('Teesra Stage') {
			when {
				not {
					branch 'master'
				}
			}

			steps {
				echo 'Yeh master nahi hai!!'
			}
		}

		stage ('Chautha Stage') {
			parallel {
				stage ('Unit Testing') {
					echo 'Unit Testing chal raha hai!!'
				}

				stage ('Integration testing') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}

					steps {
						echo 'Unit Testing chal raha hai!!'
					}
				}
			}
		}
	}
}
