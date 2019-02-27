package org.springframework.cloud.stream.sqs.properties;

import org.springframework.cloud.stream.binder.BinderSpecificPropertiesProvider;

/**
 * The SQS-specific binding configuration properties.
 *
 * @author Peter Oates
 * @author Artem Bilan
 */
public class SqsBindingProperties implements BinderSpecificPropertiesProvider {

    private SqsConsumerProperties consumer = new SqsConsumerProperties();

    private SqsProducerProperties producer = new SqsProducerProperties();

    @Override
    public SqsConsumerProperties getConsumer() {
        return consumer;
    }

    @Override
    public SqsProducerProperties getProducer() {
        return producer;
    }
}