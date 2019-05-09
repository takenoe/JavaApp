package vo;

public class EmpVO {
	private String syainNumber;
	private String name;
	private String height;
	private String weight;

	//社員番号設定
	public void setSyainNumber(String syainNumber) {
		this.syainNumber = syainNumber;
	}
	//社員番号取得
	public String getSyainNumber() {
		return syainNumber;
	}
	//社員名設定
	public void setName(String name) {
		this.name = name;
	}
	//社員名取得
	public String getName() {
		return name;
	}
	//身長設定
	public void setHeight(String height) {
		this.height = height;
	}
	//身長取得
	public String getHeight() {
		return height;
	}
	//体重設定
	public void setWeight(String weight) {
		this.weight = weight;
	}
	//体重取得
	public String getWeight() {
		return weight;
	}

}
