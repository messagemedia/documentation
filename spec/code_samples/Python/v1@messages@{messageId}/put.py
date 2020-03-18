message_id = 'messageId2'
body = CancelScheduledMessageRequest()
body.status = 'cancelled'

result = messages_controller.cancel_scheduled_message(message_id, body)