pipeline {
    agent any
    stages {
      stage ('Stage1') { 
        steps { 
          echo "stage 1 print"
          echo "stage 1 extra print"
        }
      }
      stage ('Stage2') { 
        steps { 
          echo "stage 2 print"
        }
      }
      stage ('Stage3') { 
        steps { 
          echo "stage 3 print"
        }
      }
      stage ('Stage4') { 
        steps { 
            echo "stage 4 print"
        }
      }
    }
}
