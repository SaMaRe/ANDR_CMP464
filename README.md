ANDR_CMP464
===========
Added steps for thread-creation in comments in MainActivity
Added static list view (does nothing when clicked)
Added list view that displays dialog when an item is clicked
Added beginnings of custom list view. Haven't created custom adapter yet.

 * RULES FOR ASYNCTASK THREADS
  * 
  * 1. create a class and extend AsyncTask 
  * 2. put all your background work in the doInBackground method
  * 3. make your ui changes, after background work is completed,
  *    in postExecute method.
  *    
  * RULES FOR THREADS USING RUNNABLE AND HANDLER
  * 
  * 1. create a class which implements Runnable
  * 2. pass in a listener which will execute a method on ui thread
  * 3. pass in a handler which references the ui looper
  * 4. perform background operations in run() method for Runnable
  * 5. call handler.post(new Runnable(){ public void run(){listener.callUIMethod()}})
  * 
  * @author josh
  *
  */
  02_27_14
