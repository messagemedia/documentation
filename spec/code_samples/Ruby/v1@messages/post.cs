SendMessagesRequest body = new SendMessagesRequest();
body.Messages = new List<Message>();

Message body_messages_0 = new Message();
body_messages_0.CallbackUrl = "https://my.callback.url.com";
body_messages_0.Content = "My first message";
body_messages_0.DestinationNumber = "+61491570156";
body_messages_0.DeliveryReport = true;
body_messages_0.Format = Format.SMS;
body_messages_0.MessageExpiryTimestamp = DateTime.Parse("2016-11-03T11:49:02.807Z");
body_messages_0.Metadata = APIHelper.JsonDeserialize<Object>("{\"key1\":\"value1\",\"key2\":\"value2\"}");
body_messages_0.Scheduled = DateTime.Parse("2016-11-03T11:49:02.807Z");
body_messages_0.SourceNumber = "+61491570157";
body_messages_0.SourceNumberType = SourceNumberType.INTERNATIONAL;
body.Messages.Add(body_messages_0);

Message body_messages_1 = new Message();
body_messages_1.CallbackUrl = "https://my.callback.url.com";
body_messages_1.Content = "My second message";
body_messages_1.DestinationNumber = "+61491570158";
body_messages_1.DeliveryReport = true;
body_messages_1.Format = Format.MMS;
body_messages_1.MessageExpiryTimestamp = DateTime.Parse("2016-11-03T11:49:02.807Z");
body_messages_1.Metadata = APIHelper.JsonDeserialize<Object>("{\"key1\":\"value1\",\"key2\":\"value2\"}");
body_messages_1.Scheduled = DateTime.Parse("2016-11-03T11:49:02.807Z");
body_messages_1.SourceNumber = "+61491570159";
body_messages_1.SourceNumberType = SourceNumberType.INTERNATIONAL;
body_messages_1.Media = new List<string>();
body_messages_1.Media.Add("https://images.pexels.com/photos/1018350/pexels-photo-1018350.jpeg?cs=srgb&dl=architecture-buildings-city-1018350.jpg");
body_messages_1.Subject = "This is an MMS message";
body.Messages.Add(body_messages_1);


try 
{
    SendMessagesResponse result = messages.SendMessagesAsync(body).Result;
}
catch (APIException e){};