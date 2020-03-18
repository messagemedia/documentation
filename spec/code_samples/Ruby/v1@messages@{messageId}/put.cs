string messageId = "messageId2";
CancelScheduledMessageRequest body = new CancelScheduledMessageRequest();
body.Status = "cancelled";

try 
{
    dynamic result = messages.CancelScheduledMessageAsync(messageId, body).Result;
}
catch (APIException e){};