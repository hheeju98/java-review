package ex03.protoss;

public class Zealot {
    private final String name; // 이름 ( 변할 수 없으면 final)
    private static int power = 10; // 공격력
    private static int armor = 10; // 방어력
    private int hp; // 체력
    private int sh; // 쉴드(보호막)

    // 상대방의 상태
    public void attack() {
    }

    public void powerUpgrade() {
        power++;
        System.out.println("공격력이 1증가하였습니다.");
    }

    public void armorUpgrade() {
        armor++;
        System.out.println("방어력이 1증가하였습니다.");
    }

    public Zealot(String name) {
        super();
        this.name = name;
        this.hp = 100;
        this.sh = 100;

        // 공격 방어는 태어나기도 전에 정해져 있음
        // 그래서 힙이 아니라 static 최초 값을 강제로 넣어준다.
        // 어택이라는 메소드 만들어야할지 말아야할지 생각
        // 상태가 행위를 변경해야함

    }
}
