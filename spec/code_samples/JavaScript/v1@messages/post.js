let body = new lib.SendMessagesRequest();
body.messages = [];

body.messages[0] = new lib.Message();
body.messages[0].callbackUrl = 'https://my.callback.url.com';
body.messages[0].content = 'My first message';
body.messages[0].destinationNumber = '+61491570156';
body.messages[0].deliveryReport = true;
body.messages[0].format = lib.FormatEnum.SMS;
body.messages[0].messageExpiryTimestamp = moment('2016-11-03T11:49:02.807Z').parseZone('2016-11-03T11:49:02.807Z');
body.messages[0].metadata = JSON.parse('{"key1":"value1","key2":"value2"}');
body.messages[0].scheduled = moment('2016-11-03T11:49:02.807Z').parseZone('2016-11-03T11:49:02.807Z');
body.messages[0].sourceNumber = '+61491570157';
body.messages[0].sourceNumberType = lib.SourceNumberTypeEnum.INTERNATIONAL;

body.messages[1] = new lib.Message();
body.messages[1].callbackUrl = 'https://my.callback.url.com';
body.messages[1].content = 'My second message';
body.messages[1].destinationNumber = '+61491570158';
body.messages[1].deliveryReport = true;
body.messages[1].format = lib.FormatEnum.MMS;
body.messages[1].messageExpiryTimestamp = moment('2016-11-03T11:49:02.807Z').parseZone('2016-11-03T11:49:02.807Z');
body.messages[1].metadata = JSON.parse('{"key1":"value1","key2":"value2"}');
body.messages[1].scheduled = moment('2016-11-03T11:49:02.807Z').parseZone('2016-11-03T11:49:02.807Z');
body.messages[1].sourceNumber = '+61491570159';
body.messages[1].sourceNumberType = lib.SourceNumberTypeEnum.INTERNATIONAL;
body.messages[1].media = ['https://images.pexels.com/photos/1018350/pexels-photo-1018350.jpeg?cs=srgb&dl=architecture-buildings-city-1018350.jpg'];
body.messages[1].subject = 'This is an MMS message';


const promise = controller.sendMessages(body);
promise.then((response) => {
    // this block will be executed on successful endpoint call
    // `response` will be of type 'SendMessagesResponse'
}, (err) => {
    // this block will be executed on endpoint call failure
    // `err` is an 'object' containing more information about the error
});