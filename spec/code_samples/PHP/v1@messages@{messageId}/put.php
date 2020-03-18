$messageId = 'messageId2';
$body = new Models\CancelScheduledMessageRequest;
$body->status = 'cancelled';

$result = $messagesController->cancelScheduledMessage($messageId, $body);