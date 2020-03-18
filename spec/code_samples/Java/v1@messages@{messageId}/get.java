String messageId = "messageId2";

messagesController.getMessageStatusAsync(messageId, new APICallBack<GetMessageStatusResponse>() {
    public void onSuccess(HttpContext context, GetMessageStatusResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});