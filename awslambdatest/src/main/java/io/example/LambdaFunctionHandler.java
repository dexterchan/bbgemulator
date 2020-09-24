package io.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler {
    @Override
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Input: " + input);
        logger.log(String.format("Input ClassName: %s",input.getClass().toString()));
        logger.log("AWS Lambda function name: " + context.getFunctionName()+"\n");
        logger.log("Memory Allocated: " + context.getMemoryLimitInMB()+"\n");
        logger.log("Time remaining in milliseconds: " + context.getRemainingTimeInMillis()+"\n");
        logger.log("Cloudwatch group name " + context.getLogGroupName()+"\n");
        logger.log("AWS Lambda Request Id " + context.getAwsRequestId()+"\n");

        // TODO: implement your handler
        return "Hello from Lambda!";
    }
}
