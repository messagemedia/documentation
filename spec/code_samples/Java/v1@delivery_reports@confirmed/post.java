ConfirmDeliveryReportsAsReceivedRequest body = new ConfirmDeliveryReportsAsReceivedRequest();
body.setDeliveryReportIds(new LinkedList<String>());
body.getDeliveryReportIds().add("011dcead-6988-4ad6-a1c7-6b6c68ea628d");
body.getDeliveryReportIds().add("3487b3fa-6586-4979-a233-2d1b095c7718");
body.getDeliveryReportIds().add("ba28e94b-c83d-4759-98e7-ff9c7edb87a1");

deliveryReportsController.confirmDeliveryReportsAsReceivedAsync(body, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});