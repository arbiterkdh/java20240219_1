package ch09.problem.problem07;

public class Chatting {
    static class Chat {
        void start() {
        }

        void sendMessage(String message) {
            System.out.println(message);
        }
    }

    void startChat(String chatId) {

        Chat chat = new Chat() {
            @Override
            public void start() {
                String inputData = "안녕하세요";
                String message = "[" + chatId + "]" + inputData;
                sendMessage(message);
            }
        };
        chat.start();
    }
}
