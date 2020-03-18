body = SendMessagesRequest()
body.messages = []

body.messages.append(Message())
body.messages[0].callback_url = 'https://my.callback.url.com'
body.messages[0].content = 'My first message'
body.messages[0].destination_number = '+61491570156'
body.messages[0].delivery_report = True
body.messages[0].format = FormatEnum.SMS
body.messages[0].message_expiry_timestamp = dateutil.parser.parse('2016-11-03T11:49:02.807Z')
body.messages[0].metadata = jsonpickle.decode('{"key1":"value1","key2":"value2"}')
body.messages[0].scheduled = dateutil.parser.parse('2016-11-03T11:49:02.807Z')
body.messages[0].source_number = '+61491570157'
body.messages[0].source_number_type = SourceNumberTypeEnum.INTERNATIONAL

body.messages.append(Message())
body.messages[1].callback_url = 'https://my.callback.url.com'
body.messages[1].content = 'My second message'
body.messages[1].destination_number = '+61491570158'
body.messages[1].delivery_report = True
body.messages[1].format = FormatEnum.MMS
body.messages[1].message_expiry_timestamp = dateutil.parser.parse('2016-11-03T11:49:02.807Z')
body.messages[1].metadata = jsonpickle.decode('{"key1":"value1","key2":"value2"}')
body.messages[1].scheduled = dateutil.parser.parse('2016-11-03T11:49:02.807Z')
body.messages[1].source_number = '+61491570159'
body.messages[1].source_number_type = SourceNumberTypeEnum.INTERNATIONAL
body.messages[1].media = ['https://images.pexels.com/photos/1018350/pexels-photo-1018350.jpeg?cs=srgb&dl=architecture-buildings-city-1018350.jpg']
body.messages[1].subject = 'This is an MMS message'


result = messages_controller.send_messages(body)