package okkpp.biz.model;

import java.util.List;

public class ResultModel {

	// ��Ʒ�б�
	private List<Products> productList;
	// ��Ʒ����
	private Long recordCount;
	// ��ҳ��
	private int pageCount;
	// ��ǰҳ
	private int curPage;

	public List<Products> getProductList() {
		return productList;
	}

	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}

	public Long getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	@Override
	public String toString() {
		return "ResultModel [productList=" + productList + ", recordCount=" + recordCount + ", pageCount=" + pageCount
				+ ", curPage=" + curPage + "]";
	}

}
