SendMessagesRequest body = new SendMessagesRequest();
body.setMessages(new LinkedList<Message>());

Message body_messages_0 = new Message();
body_messages_0.setCallbackUrl("https://my.callback.url.com");
body_messages_0.setContent("My first message");
body_messages_0.setDestinationNumber("+61491570156");
body_messages_0.setDeliveryReport(true);
body_messages_0.setFormat(FormatEnum.SMS);
body_messages_0.setMessageExpiryTimestamp(new DateTime("2016-11-03T11:49:02.807Z", DateTimeZone.UTC));
body_messages_0.setMetadata(com.messagemedia.messages.APIHelper.deserialize("{\"key1\":\"value1\",\"key2\":\"value2\"}"));
body_messages_0.setScheduled(new DateTime("2016-11-03T11:49:02.807Z", DateTimeZone.UTC));
body_messages_0.setSourceNumber("+61491570157");
body_messages_0.setSourceNumberType(SourceNumberTypeEnum.INTERNATIONAL);
body.getMessages().add(body_messages_0);

Message body_messages_1 = new Message();
body_messages_1.setCallbackUrl("https://my.callback.url.com");
body_messages_1.setContent("My second message");
body_messages_1.setDestinationNumber("+61491570158");
body_messages_1.setDeliveryReport(true);
body_messages_1.setFormat(FormatEnum.MMS);
body_messages_1.setMessageExpiryTimestamp(new DateTime("2016-11-03T11:49:02.807Z", DateTimeZone.UTC));
body_messages_1.setMetadata(com.messagemedia.messages.APIHelper.deserialize("{\"key1\":\"value1\",\"key2\":\"value2\"}"));
body_messages_1.setScheduled(new DateTime("2016-11-03T11:49:02.807Z", DateTimeZone.UTC));
body_messages_1.setSourceNumber("+61491570159");
body_messages_1.setSourceNumberType(SourceNumberTypeEnum.INTERNATIONAL);
body_messages_1.setMedia(new LinkedList<String>());
body_messages_1.getMedia().add("https://images.pexels.com/photos/1018350/pexels-photo-1018350.jpeg?cs=srgb&dl=architecture-buildings-city-1018350.jpg");
body_messages_1.setSubject("This is an MMS message");
body.getMessages().add(body_messages_1);


messagesController.sendMessagesAsync(body, new APICallBack<SendMessagesResponse>() {
    public void onSuccess(HttpContext context, SendMessagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});
