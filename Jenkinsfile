pipeline {
	agent any {
		stages {
			stage ('1st Stage') {
				steps {
					echo 'First stage Initiated!!'
				}
			}

			stage ('2nd Stage') {
				steps {
					input ('Do you really want to continue? Sure?')
				}
			}

			stage ('3rd Stage') {
				when {
					not {
						branch 'master'
					}
				}

				steps {
					echo 'Not MASTER!!'
				}
			}

			stage ('4th Stage') {
				parallel {
					stage ('Unit Testing') {
						steps {
							echo 'Unit Testing started!!'
						}
					}

					stage ('Integration Testing') {
						agent {
							docker {
								reuseNode false;
								image 'ubuntu'
							}
						}

						steps {
							echo 'Integration Testing started!!'
						}
					}
				}
			}
		}
	}
}
