/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2004 - 2019. All rights reserved.
 */
package com.anaptecs.jeaf.spi.mail;

import java.util.Set;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;

import com.anaptecs.jeaf.core.api.ServiceProvider;

/**
 * JEAF Mail Service Provider is responsible for creating and sending e-mail messages using the Java Mail API. JEAF
 * provides the possibility to use the Mail Service Provider not only in a JSE, but also in an EJBContainer Runtime
 * Environment.<br/>
 * The configuration for the mail session in a JSE Runtime Environment is stored in a properties file. Nearly all the
 * necessary adjustments to the configuration for the mail session in an EJBContainer Runtime Environment should be made
 * inside the configuration of the Application Server. Only the Java Mail session binding JNDI path has to be set inside
 * the properties file in order to get the mail session from the Application Server.
 *
 * @author JEAF Generator
 * @version JEAF Release 1.4.x
 */
public interface MailServiceProvider extends ServiceProvider {
  /**
   * Method sends an e-mail using the passed message object. The subject, content and recipients of the message have to
   * be specified inside the passed message object.
   *
   * @param pMessage
   */
  void sendMail( Message pMessage );

  /**
   * Method sends an e-mail using a newly created message with the passed subject, content and recipients objects.
   *
   * @param pContent
   * @param pSubject
   * @param pRecipients
   */
  void sendMail( String pContent, String pSubject, Set<Address> pRecipients );

  /**
   * Method creates and returns an empty message object.
   *
   * @return {@link MimeMessage}
   */
  MimeMessage createMessage( );

  /**
   * Method creates and returns a message object using the passed content, subject and recipients objects.
   *
   * @param pContent
   * @param pSubject
   * @param pRecipients
   * @return {@link MimeMessage}
   */
  MimeMessage createMessage( String pContent, String pSubject, Set<Address> pRecipients );
}