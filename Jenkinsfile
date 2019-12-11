pipeline{
	agent any
	stages{
		stage('First Stage'){
			steps{
				echo 'This is First Stage ##'
			}
		}
		
		stage('Second Stage'){
			steps{
				input('Do you want to continue#');
			}
		}
		
		stage('Third Stage'){
			when{
				not{
					branch 'master'
				}
			}
			steps{
				echo 'Not master##'
			}
		}
		
		stage('Fourth Stage'){
			parallel{
				stage('Unit Testing'){
					steps{
						echo 'Unit Testing Started##'
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
						echo 'Integration Testing Started $$'
					}
				}
			}
		}
	}
}
