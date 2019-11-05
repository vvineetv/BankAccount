pipeline{
	agent any
	stages {
		stage ('First Stage') {
			steps {
				echo "FIRST STAGE !!"
			}
		}

		stage ('Second Stage') {
			steps {
				input ('Do you really want to proceed Vineet?')
			}
		}

		stage ('Third Stage') {
			when {
				not {
					branch 'master'
				}
			}

			steps {
				echo 'This is not master'
			}
		}

		stage ('Fourth Stage') {
			parallel {
				stage ('Unit Testing') {
					steps {
					echo 'Unit testing started..'
					}
				}

				stage ('Intergration Testing') {
					agent {
						docker {
							reuseNode false;
							image 'ubuntu'
						}
					}

					steps {
						echo 'Started Integration Testing..'
					}
				}
			}
		}
	}
}
