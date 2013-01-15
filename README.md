A simpler interface for Apache CLI library using Java annotations and reflection.

Features
--------

* simple & intuitive interface
* argument type checking
* option to specify required/mandatory arguments
* automatic parsing of command args to Java types (as a side effect of type checking)
* basic command line sanity checks (like type violation or missing required arguments)

Example usage
-------------

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

Dependencies
------------

Depends on Apache Commons CLI library
