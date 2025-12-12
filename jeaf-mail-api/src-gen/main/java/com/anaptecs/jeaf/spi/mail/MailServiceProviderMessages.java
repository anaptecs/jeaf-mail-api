package com.anaptecs.jeaf.spi.mail;

import com.anaptecs.jeaf.xfun.annotations.MessageResource;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.errorhandling.ErrorCode;
import com.anaptecs.jeaf.xfun.api.messages.MessageID;
import com.anaptecs.jeaf.xfun.api.messages.MessageRepository;

/**
 * Class contains all generated constants for messages used by the mail service provider.
 *
 * @author JEAF Development Team
 * @version 1.0
 */
@MessageResource(path = "MailServiceProviderMessages.xml")
public final class MailServiceProviderMessages {
  /**
   * Constant for XML file that contains all messages that are defined within this class.
   */
  private static final String MESSAGE_RESOURCE = "MailServiceProviderMessages.xml";

  /**
   * Exceptions with this error code are thrown if the sending of a message fails.
   */
  public static final ErrorCode MAIL_MESSAGE_SEND_ERROR;

  /**
   * Exceptions with this code are thrown when a field cannot be written inside a message. Can be a matter of character
   * encoding.
   */
  public static final ErrorCode MAIL_MESSAGE_SET_FIELD_ERROR;

  /**
   * Exceptions with this code are thrown when a JNDI lookup has failed.
   */
  public static final ErrorCode MAIL_JNDI_LOOKUP_ERROR;

  /**
   * Exceptions with this code are thrown when the loading of the properties has failed.
   */
  public static final ErrorCode MAIL_PROPERTIES_ERROR;

  /**
   * Messages with this ID are traced when a message will be sent.
   */
  public static final MessageID SENDING_MAIL;

  /**
   * Messages with this ID are traced when a message will not be sent.
   */
  public static final MessageID NOT_SENDING_MAIL;

  /**
   * Messages with this ID are traced when a message will not be sent.
   */
  public static final ErrorCode SENDING_MAILS_DISABLED;

  /**
   *
   */
  public static final ErrorCode MAIL_FROM_NO_SET;

  /**
   *
   */
  public static final ErrorCode MAIL_FROM_PERSONAL_NO_SET;

  /**
   * Exceptions with this error code are thrown if the mail service provider implementation is used within an
   * unsupported environment.
   */
  public static final ErrorCode UNSUPPORTED_RUNTIME;
  /**
   * Static initializer contains initialization for all generated constants.
   */
  static {
    MessageRepository lRepository = XFun.getMessageRepository();
    lRepository.loadResource(MESSAGE_RESOURCE);
    // Handle all info messages.
    SENDING_MAIL = lRepository.getMessageID(5004);
    NOT_SENDING_MAIL = lRepository.getMessageID(5005);
    // Handle all messages for errors.
    MAIL_MESSAGE_SEND_ERROR = lRepository.getErrorCode(5000);
    MAIL_MESSAGE_SET_FIELD_ERROR = lRepository.getErrorCode(5001);
    MAIL_JNDI_LOOKUP_ERROR = lRepository.getErrorCode(5002);
    MAIL_PROPERTIES_ERROR = lRepository.getErrorCode(5003);
    SENDING_MAILS_DISABLED = lRepository.getErrorCode(5006);
    MAIL_FROM_NO_SET = lRepository.getErrorCode(5007);
    MAIL_FROM_PERSONAL_NO_SET = lRepository.getErrorCode(5008);
    UNSUPPORTED_RUNTIME = lRepository.getErrorCode(5009);
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private MailServiceProviderMessages( ) {
    // Nothing to do.
  }
}