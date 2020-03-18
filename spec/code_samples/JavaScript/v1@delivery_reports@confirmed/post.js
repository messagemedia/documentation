let body = new lib.ConfirmDeliveryReportsAsReceivedRequest();
body.deliveryReportIds = ['011dcead-6988-4ad6-a1c7-6b6c68ea628d', '3487b3fa-6586-4979-a233-2d1b095c7718', 'ba28e94b-c83d-4759-98e7-ff9c7edb87a1'];

const promise = controller.confirmDeliveryReportsAsReceived(body);
promise.then((response) => {
    // this block will be executed on successful endpoint call
    // `response` will be of type 'mixed'
}, (err) => {
    // this block will be executed on endpoint call failure
    // `err` is an 'object' containing more information about the error
});