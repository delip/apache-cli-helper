package org.apache.commons.cli.helper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Delip Rao
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Option {
  public String opt();
  public String longOpt() default ""; // There's no longOpt unless you define one
  public boolean hasArg() default false;
  public boolean required() default false; // is this a mandatory argument?
  // description has no default value (like "") to enforce documentation
  public String description();
  // for type checking. Default no type checking, return string as is
  public Class<?> type() default String.class;
  // a string representation of the default value
  public String defaultValueStr() default "";
}
