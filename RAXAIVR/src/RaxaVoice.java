import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;

public class RaxaVoice extends BaseAgiScript
{
    public void service(AgiRequest request, AgiChannel channel)            //the request data including the dialed extension, the caller id, channel name, parameters and more
            throws AgiException
    {
        // Answer the channel...
        answer();
         
        // ...say hello...
        streamFile("welcome");
        
        //..retreive information based on caller ID
        int CallerID = Integer.parseInt(request.getParameter("agi_arg_2"));  //parameters are stored as agi_arc_1,agi_arc_2 ...The who called is stored as second parameter.
        
        String userResponse1=getData("MainMenu",24);                        //Play MainMenu and wait for user input for 24 sec												
        
        /*
         * Now will retreive result based on what user wants
         */
        
        String result=(new RaxaRestCaller()).retrieveDataFromRest(CallerID);   //This will retreive data based on the caller ID number and store it in a string.
        
        
         //text to speech
        
        (new TextToSpeech()).play(result);
        
         /*
         * Ask Patient if he want to get the information via email,message,or from call only
         */
            					   									
        String userResponse2=getData("WhatYouWant",24);                         //Play a menu on how user wants to get message
        
        
        (new MessageSender()).AuthenticateFirstThenSend(result);                //This will send message to the user
        
        //retreive email of patient using caller ID.Otherwise Say you dont have a mail registerd if not found.
        
        (new EmailSender()).send(emailID,emailSubject,result);                   //send mail using our mail account
        
        
        // ...and hangup.
        hangup();
    }
}
