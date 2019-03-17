package ch.heigvd.res.labio.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {

    String[] array = {"", ""};

    if (lines.contains("\n")) {
      array = lines.split("\n",2);
      array[0] += "\n";
      //array[1] += "\n";

    }

    else if (lines.contains("\r\n")) {
      array = lines.split("\r\n",2);
      array[0] += "\r\n";
      //array[1] += "\r\n";

    }

    else if (lines.contains("\r")) {
      array = lines.split("\r",2);
      array[0] += "\r";
      //array[1] += "\r";

    }

    else {
      array[1] = lines;
    }

    return array;
  }
}
