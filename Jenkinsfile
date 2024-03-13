pipeline 
{
    agent any

    stages
    {
        stage('Hello') 
        {
            steps 
            {
                echo 'Hello World'
            }
            
      
        }
        
    }
    post
        {
        failure
    
            {
                emailext body: 'pipeline success', subject: 'pipeline status', to: 'nithyanagalakshmi2002@gmail.com'
            }
        }
}
