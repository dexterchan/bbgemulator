

arn:aws:iam::192592784707:role/LAMBDA_DEPLOY_RUN

aws lambda create-function --function-name "awslambdausingcli" --runtime "java8" --role "arn:aws:iam::192592784707:user/Administrator" --handler "io.example.LambdaFunctionHandler:handleRequest" --memory-size 256 --zip-file  "fileb://awslambdatest-1.0-SNAPSHOT.zip"