package com.jindo.core.business;

import com.jindo.core.log.LogFactory;
import com.jindo.core.model.Page;
import com.jindo.core.model.User;
import java.util.logging.Logger;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 */
public class PageVisitor {

  private static final Logger logger = LogFactory.getLogger();

  /**
   * Logging lại thông tin của User
   * @param user
   * @param page
   */
  public void visit(User user, Page page){
    logger.info(user + " visited "+ page);
    logger.warning(user + " visited "+ page);
    logger.severe(user + " visited "+ page);
  }
}
