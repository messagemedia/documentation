$body = new Models\SendMessagesRequest;
$body->messages = array();

$body->messages[0] = new Models\Message;
$body->messages[0]->callbackUrl = 'https://my.callback.url.com';
$body->messages[0]->content = 'My first message';
$body->messages[0]->destinationNumber = '+61491570156';
$body->messages[0]->deliveryReport = true;
$body->messages[0]->format = Models\FormatEnum::SMS;
$body->messages[0]->messageExpiryTimestamp = DateTimeHelper::fromRfc3339DateTime('2016-11-03T11:49:02.807Z');
$body->messages[0]->metadata = MessageMediaMessagesLib\APIHelper::deserialize('{"key1":"value1","key2":"value2"}');
$body->messages[0]->scheduled = DateTimeHelper::fromRfc3339DateTime('2016-11-03T11:49:02.807Z');
$body->messages[0]->sourceNumber = '+61491570157';
$body->messages[0]->sourceNumberType = Models\SourceNumberTypeEnum::INTERNATIONAL;

$body->messages[1] = new Models\Message;
$body->messages[1]->callbackUrl = 'https://my.callback.url.com';
$body->messages[1]->content = 'My second message';
$body->messages[1]->destinationNumber = '+61491570158';
$body->messages[1]->deliveryReport = true;
$body->messages[1]->format = Models\FormatEnum::MMS;
$body->messages[1]->messageExpiryTimestamp = DateTimeHelper::fromRfc3339DateTime('2016-11-03T11:49:02.807Z');
$body->messages[1]->metadata = MessageMediaMessagesLib\APIHelper::deserialize('{"key1":"value1","key2":"value2"}');
$body->messages[1]->scheduled = DateTimeHelper::fromRfc3339DateTime('2016-11-03T11:49:02.807Z');
$body->messages[1]->sourceNumber = '+61491570159';
$body->messages[1]->sourceNumberType = Models\SourceNumberTypeEnum::INTERNATIONAL;
$body->messages[1]->media = array('https://images.pexels.com/photos/1018350/pexels-photo-1018350.jpeg?cs=srgb&dl=architecture-buildings-city-1018350.jpg');
$body->messages[1]->subject = 'This is an MMS message';


$result = $messagesController->sendMessages($body);