import create.StartGame;
import create.StartGameImpl;

public class Main {

    public static void main(String[] args) {
        StartGame st = new StartGameImpl();   // 인터페이스 형식으로 추상개념을 구현해 놓은 StartGameImpl를 호출
        st.createCharactor();                 // 인터페이스의 캐릭터 생성 메소드를 호출
    }
}
