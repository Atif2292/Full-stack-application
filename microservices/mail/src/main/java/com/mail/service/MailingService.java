package com.mail.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mail.dto.MailDTO;
import com.mail.model.MailEntity;
import com.mail.repo.MailRepo;


@Service
public class MailingService {


	@Autowired
	private MailRepo mailRepo;

	@Autowired
	private ModelMapper modelMapper;

	public MailDTO addMail(MailDTO mailDTO) {
		MailEntity mailEntity = modelMapper.map(mailDTO, MailEntity.class);
		mailRepo.save(mailEntity);
		return mailDTO;

	}

}
