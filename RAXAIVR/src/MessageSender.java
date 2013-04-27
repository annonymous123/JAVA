
public class MessageSender {
		public void AuthenticateFirstThenSend(String result){
			check();
			send();
		}
		
		/*
		 * First we check if the user number is in our database i.e if user is registerd
		 * All SMS gateway provide links to our Account.we will check our SendBOx account and see how many messages has been send to the user
		 * today.If it extend maxLimit we will not send it and convey a message that reach maximum limit. 
		 * 
		 * 
		 */
		public void check(){
			
		}
		/*
		 * We will send our message using HTTP API of sms GAteway Provider.
		 * Something like this:
		 * http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=atulag.92@gmail.com:myPassword3&senderID=TEST SMS&receipientno=918149195049&dcs=0&msgtxt=This is Test message&state=4 
		 */
		public void send(){
			
		}
		/*
		 * This fuction will be used if the user is communicating to us via messages.We will be having two thread
		 * running for this class.One thread will be listening to the SMS Gateway to see if any messages have arrived.
		 * Once the message has arrived it will authenticate it.It will then send user an message and wait for a reply.
		 * After getting what user wants it will send the result to user.User can edit this also.
		 * "Personal name,Mobile Number,Visiting Time should be modified.
		 * Instead of thread we can ping server every 15 seconds.Thread though should be the best solution.
		 * 
		 * 
		 */
		public void USSDMessageSender {
			authenticateUser();
			fetchReply();
			authenticateUser();
			CAllRestAPI();
			composeMessage();   //Try to make message below 140 characters
			EditRestApi();      //POST Request using uuid retrieved from MObile number provider by mvayoo 
		}
}
