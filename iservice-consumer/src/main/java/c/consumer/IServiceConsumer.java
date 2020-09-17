package c.consumer;

import iservice.sdk.ServiceClientBuilder;
import iservice.sdk.entity.BaseServiceRequest;
import iservice.sdk.entity.ServiceListenerOptions;
import iservice.sdk.impl.AbstractConsumerListener;
import iservice.sdk.impl.ServiceClient;

public class IServiceConsumer {
    public static void main(String[] args) {
        ServiceClient client = ServiceClientBuilder.create().addListener(new AbstractConsumerListener<Result>() {
            @Override
            public ServiceListenerOptions getOptions() {
                return null;
            }

            @Override
            public void onResponse(Result result) {
                System.out.println("get result, call iservice finished.");
            }
        }).build();
        client.callService(new RequestParam());
    }
}

class RequestParam extends BaseServiceRequest {

}

class Result {

}