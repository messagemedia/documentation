let messageId = 'messageId2';
let body = new lib.CancelScheduledMessageRequest();
body.status = 'cancelled';

const promise = controller.cancelScheduledMessage(messageId, body);
promise.then((response) => {
    // this block will be executed on successful endpoint call
    // `response` will be of type 'mixed'
}, (err) => {
    // this block will be executed on endpoint call failure
    // `err` is an 'object' containing more information about the error
});