string messageId = "messageId2";

try 
{
    GetMessageStatusResponse result = messages.GetMessageStatusAsync(messageId).Result;
}
catch (APIException e){};