package hd.dp.facade;

public class FacadeJijin {

	public GuoZhai	guoZhai;
	public GuPiao	guPiao;
	public QiHuo	qiHuo;

	public FacadeJijin() {
		guoZhai = new GuoZhai();
		guPiao = new GuPiao();
		qiHuo = new QiHuo();
	}

	public void buyA() {
		guoZhai.buy();
		qiHuo.chao();
	}

	public void buyB() {
		guoZhai.buy();
		qiHuo.chao();
		guPiao.buy();
	}

}
