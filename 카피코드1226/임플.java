package 카피코드1226;

public class 임플 implements 도서서비스{
	private 북[] 북스;
	private int boca;
	public 임플(int c) {
		북스 = new 북[c];
		boca = 0;
	}

	@Override
	public void 애드(북 bo) {
		if(boca < 북스.length) {
			북스[boca] = bo;
			boca++;
			System.out.println(bo.get제() + "  추가됨");
		} else System.out.println("가득참");
		
	}

	@Override
	public void 서치(String 키워드) {
		boolean huregu = false;
		for(int i=0; i<boca; i++) {
			if(북스[i].get제().contains(키워드) ||
					북스[i].get저().contains(키워드) ||
					북스[i].get번().contains(키워드)) {
				System.out.println(북스[i].투스());
				huregu = true;
			}
		} if(!huregu) System.out.println("없어");
		
	}

}
