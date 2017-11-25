package etc.jump;

public class GuGu {

    int dan;

    public GuGu(int dan) {
        this.dan = dan;
    }

    public int get(int seq) {
        return this.dan * seq;
    }

    public int[] all() {
        int[] result = new int[9];
        for(int i=0; i<9; i++) {
            result[i] = this.get(i+1);
        }
        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        int[] result = all();
        for(int i=0;i<result.length; i++) {
            sb.append(result[i]);
            if(i!=result.length-1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GuGu gugu = new GuGu(2);	// 2단
        System.out.println(gugu.get(3));
        System.out.println(gugu);
        System.out.println("----------");
        for(int i=1; i<10; i++) {
            System.out.println(new GuGu(i));
        }
    }

/*
위 소스에서 주목할 부분은 toString() 을 사용한 부분이다. 
toString은 클래스내에 선언되면 좀 특별한 의미를 갖게 된다. 

new 키워드로 생성한 객체를 System.out.println 같은 걸로 출력했을 때 
toString 메소드가 구현되어 있을 경우 toString() 메소드를 수행한 결과값을 리턴하게 된다.
 */
}
