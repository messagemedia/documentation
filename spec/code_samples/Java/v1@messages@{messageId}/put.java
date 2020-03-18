String messageId = "messageId2";
CancelScheduledMessageRequest body = new CancelScheduledMessageRequest();
body.setStatus("cancelled");

messagesController.cancelScheduledMessageAsync(messageId, body, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});