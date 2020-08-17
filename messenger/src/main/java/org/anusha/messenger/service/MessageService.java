package org.anusha.messenger.service;

import java.util.List;

import org.anusha.messenger.dao.MessageDao;
import org.anusha.messenger.dao.MessageDaoImpl;
import org.anusha.messenger.model.Message;

public class MessageService {

	private MessageDaoImpl messageDao = new MessageDao();

	public List<Message> getAllMessages() {

		return messageDao.getAllMessage();

	}

	public Message getMessages(long id) {
		return messageDao.getMessageById(id);
	}

	public Message addMessage(Message message) {
		return messageDao.insertMessage(message);
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		return messageDao.updateMessage(message);
	}

	public void removeMessage(long id) {
		messageDao.deleteMessage(id);
	}

}
