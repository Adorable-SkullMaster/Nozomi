/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated;


import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DefaultCatalog extends CatalogImpl {

  /**
   * The reference instance of <code></code>
   */
  public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();
  private static final long serialVersionUID = -880724243;
  /**
   * The schema <code>public</code>.
   */
  public final Public PUBLIC = Public.PUBLIC;

  /**
   * No further instances allowed
   */
  private DefaultCatalog() {
    super("");
  }

  @Override
  public final List<Schema> getSchemas() {
    List result = new ArrayList();
    result.addAll(getSchemas0());
    return result;
  }

  private final List<Schema> getSchemas0() {
    return Arrays.<Schema>asList(
        Public.PUBLIC);
  }
}
