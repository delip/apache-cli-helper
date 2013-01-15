package demo;

import org.apache.commons.cli.helper.CLI;
import org.apache.commons.cli.helper.CommandLineHelper;
import org.apache.commons.cli.helper.Option;

/**
 * @author Delip Rao
 */

@CLI({
  @Option(opt="h", longOpt="help", description = "Help about this program"),
  @Option(opt="t", description = "test", required = true, hasArg = true, type=Double.class, defaultValueStr = "0.5")
})
public class CLIDemo {
  public static void main(String[] args) {
    try {
      CommandLineHelper cmdHelper = null;
      cmdHelper = new CommandLineHelper(CLIDemo.class);
      cmdHelper.parse(args);
      double tValue = (Double)cmdHelper.getOptionValue("t");
    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}
