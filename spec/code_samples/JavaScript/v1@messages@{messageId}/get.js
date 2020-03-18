let messageId = 'messageId2';

const promise = controller.getMessageStatus(messageId);
promise.then((response) => {
    // this block will be executed on successful endpoint call
    // `response` will be of type 'GetMessageStatusResponse'
}, (err) => {
    // this block will be executed on endpoint call failure
    // `err` is an 'object' containing more information about the error
});