pipeline {
	agent any 
	stages {
		stage ('1st Stage Started') {
			steps {
				echo 'First stage started.... HELLO!!!'
			}
		}

		stage ('2nd Stage Started') {
			steps {
				input ('DO YOU WANT TO PROCEED?')
			}
		}

		stage ('3rd Stage Started') {
			when {
				not {
					branch 'master'
				}
			}
			steps {
				echo 'This is the third stage'
			}
		}

		stage ('4th Stage Started') {
			parallel {
				stage ('Unit Testing') {
					steps {
						echo 'Unit Testing started ...'
					}
				}

				stage ('Intergration Testing') {
					agent {
						docker {
							reuseNode false
							image 'ubuntu'
						}
					}
					steps {
						echo 'Intergration Testing Started ....'
					}
				}
			}
		}
	}
}
