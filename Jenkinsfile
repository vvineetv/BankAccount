pipeline{
	agent any 
	stages{
		stage('Stage No:1'){
			steps {
				echo 'Stage No:1 running'
			}
		}

		stage('Stage No:2'){
			steps {
				input('Are you sure, you want to continue?')
			}
		}

		stage('Stage No:3'){
			when{
				not{
					branch 'master'
				}
			}

			steps{
				echo 'NOT MASTER!!'
			}
		}

		stage('Stage No:4'){
			parallel{
				stage('Unit Testing'){
					steps{
						echo 'Unit testing started!!'
					}
				}

				stage('Integration Testing'){
					agent{
						docker{
							reuseNode false
							image 'ubuntu'
						}
					}

					steps{
						echo 'Unit Testing started!!'
					}
				}
			}
		}
	}
}
