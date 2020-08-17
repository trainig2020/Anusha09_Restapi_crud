package org.anusha.messenger.dao;

import java.util.List;

import org.anusha.messenger.model.Message;

public interface MessageDaoImpl {

	List<Message> getAllMessage();

	Message insertMessage(Message message);

	Message updateMessage(Message message);

	void deleteMessage(long id);

	Message getMessageById(long id);

}