pipeline{
	agent any
		stages{
			stage('One'){
				steps{
					echo 'This is Vineet !!'
				}
			}

			stage('Two'){
				steps{
					input('Do you want to proceed?')
				}
			}

			stage('Three'){
				when{
					not{
						branch "master"
					}
				}
				steps{
					echo 'Hello'
				}
			}

			stage('Four'){
				parallel{
					stage('Unit Test'){
						steps{
							echo "Running the unit test...."
						}
					}

					stage('Intergration Test'){
						agent {
							docker{
								reuseNode false
								image 'ubuntu'
							}
						}
						steps{
							echo 'Running the Intergration test...'
						}
					}
				}
			}
		}
}