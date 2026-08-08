package com.strands.spf;

/**
 * <p>
 * Single instance in a multi threading environment
 * </p>
 * 
 * @author strands
 * 
 */
public class SingleInstance {

  private static volatile SingleInstance instance;

  /**
   * Private constructor prevents instantiation from outside this class.
   */
  private SingleInstance() {
  }


    /**
     * Returns the single shared instance, creating it on the first call.
     *
     * @return the one and only instance of SingleInstance for this JVM
     */
    public static SingleInstance getInstance()
    {
        SingleInstance result = instance;
        if (result == null)
        {
            synchronized (SingleInstance.class)
            {
                result = instance;
                if (result == null)
                {
                    instance = result = new SingleInstance();
                }
            }
        }
        return result;
    }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
