pipleline {
	agent any
	stages {
		stage ('First stage') {
			steps {
				echo 'Hi Vineet. This is first stage!!'
			}
		}
		
		stage ('Second Stage') {
			steps {
				input ('Do you want to continue?')
			}
		}
		
		stage ('Third Stage') {
			when {
				not {
					branch 'master'	
				}
			}
			steps {
				echo 'This is third stage!!'
			}
		}
		
		stage ('Fouth Stage') {
			parallel {
				stage ('Unit Test') {
					echo 'Performing Unit Test..'
				}
				
				stage ('Intergration Test') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}
					steps {
						echo 'Performing Intergration Test..'
					}
				}
			}
		}
	}
}
