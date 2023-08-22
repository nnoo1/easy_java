package test_ch9;

public class Chatting {
  class Chat {
    void start() {}
    void sendMessage(String message){}
  }

  void startChat(String chatId) {
    String nickName = null;
    nickName = chatId;

    Chat chat = new Chat(){
      @Override
      public void start() {
        super.start();

      }
    }
  }

}
