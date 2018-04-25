package okkpp.biz.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_payment")
public class Payment implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * �����˻�
     */
    @Column(name = "current_account")
    private Double currentAccount;

    /**
     * �������
     */
    @Column(name = "goods_credit")
    private Double goodsCredit;

    /**
     * ����跽
     */
    @Column(name = "goods_debit")
    private Double goodsDebit;

    /**
     * �������
     */
    @Column(name = "services_credit")
    private Double servicesCredit;

    /**
     * ����跽
     */
    @Column(name = "services_debit")
    private Double servicesDebit;

    /**
     * �������
     */
    @Column(name = "income_credit")
    private Double incomeCredit;

    /**
     * ����跽
     */
    @Column(name = "income_debit")
    private Double incomeDebit;

    /**
     * �ʱ��˻�
     */
    @Column(name = "capital_account")
    private Double capitalAccount;

    /**
     * ����
     */
    private Double credit;

    /**
     * �����˻�
     */
    @Column(name = "financial_account")
    private Double financialAccount;

    /**
     * ֱ��Ͷ���ʲ�
     */
    @Column(name = "direct_assets")
    private Double directAssets;

    /**
     * ֱ��Ͷ�ʸ�ծ
     */
    @Column(name = "direct_liabilities")
    private Double directLiabilities;

    /**
     * ֤ȯͶ���ʲ�
     */
    @Column(name = "portfolio_assets")
    private Double portfolioAssets;

    /**
     * ֤ȯͶ�ʸ�ծ
     */
    @Column(name = "portfolio_liabilities")
    private Double portfolioLiabilities;

    /**
     * �������������ʲ�
     */
    @Column(name = "financial_assets")
    private Double financialAssets;

    /**
     * �����������߸�ծ
     */
    @Column(name = "financial_liabilities")
    private Double financialLiabilities;

    /**
     * ����Ͷ�ʸ�ծ
     */
    @Column(name = "other_liabilities")
    private Double otherLiabilities;

    /**
     * �����ʲ�
     */
    @Column(name = "reserves_assets")
    private Double reservesAssets;

    /**
     * ��������©
     */
    @Column(name = "errors_omissions")
    private Double errorsOmissions;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ��������
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ���Ҵ���
     *
     * @return country - ���Ҵ���
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù��Ҵ���
     *
     * @param country ���Ҵ���
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ���
     *
     * @return year - ���
     */
    public String getYear() {
        return year;
    }

    /**
     * �������
     *
     * @param year ���
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * ��ȡ�����˻�
     *
     * @return current_account - �����˻�
     */
    public Double getCurrentAccount() {
        return currentAccount;
    }

    /**
     * ���þ����˻�
     *
     * @param currentAccount �����˻�
     */
    public void setCurrentAccount(Double currentAccount) {
        this.currentAccount = currentAccount;
    }

    /**
     * ��ȡ�������
     *
     * @return goods_credit - �������
     */
    public Double getGoodsCredit() {
        return goodsCredit;
    }

    /**
     * ���û������
     *
     * @param goodsCredit �������
     */
    public void setGoodsCredit(Double goodsCredit) {
        this.goodsCredit = goodsCredit;
    }

    /**
     * ��ȡ����跽
     *
     * @return goods_debit - ����跽
     */
    public Double getGoodsDebit() {
        return goodsDebit;
    }

    /**
     * ���û���跽
     *
     * @param goodsDebit ����跽
     */
    public void setGoodsDebit(Double goodsDebit) {
        this.goodsDebit = goodsDebit;
    }

    /**
     * ��ȡ�������
     *
     * @return services_credit - �������
     */
    public Double getServicesCredit() {
        return servicesCredit;
    }

    /**
     * ���÷������
     *
     * @param servicesCredit �������
     */
    public void setServicesCredit(Double servicesCredit) {
        this.servicesCredit = servicesCredit;
    }

    /**
     * ��ȡ����跽
     *
     * @return services_debit - ����跽
     */
    public Double getServicesDebit() {
        return servicesDebit;
    }

    /**
     * ���÷���跽
     *
     * @param servicesDebit ����跽
     */
    public void setServicesDebit(Double servicesDebit) {
        this.servicesDebit = servicesDebit;
    }

    /**
     * ��ȡ�������
     *
     * @return income_credit - �������
     */
    public Double getIncomeCredit() {
        return incomeCredit;
    }

    /**
     * �����������
     *
     * @param incomeCredit �������
     */
    public void setIncomeCredit(Double incomeCredit) {
        this.incomeCredit = incomeCredit;
    }

    /**
     * ��ȡ����跽
     *
     * @return income_debit - ����跽
     */
    public Double getIncomeDebit() {
        return incomeDebit;
    }

    /**
     * ��������跽
     *
     * @param incomeDebit ����跽
     */
    public void setIncomeDebit(Double incomeDebit) {
        this.incomeDebit = incomeDebit;
    }

    /**
     * ��ȡ�ʱ��˻�
     *
     * @return capital_account - �ʱ��˻�
     */
    public Double getCapitalAccount() {
        return capitalAccount;
    }

    /**
     * �����ʱ��˻�
     *
     * @param capitalAccount �ʱ��˻�
     */
    public void setCapitalAccount(Double capitalAccount) {
        this.capitalAccount = capitalAccount;
    }

    /**
     * ��ȡ����
     *
     * @return credit - ����
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * ���ô���
     *
     * @param credit ����
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    /**
     * ��ȡ�����˻�
     *
     * @return financial_account - �����˻�
     */
    public Double getFinancialAccount() {
        return financialAccount;
    }

    /**
     * ���ý����˻�
     *
     * @param financialAccount �����˻�
     */
    public void setFinancialAccount(Double financialAccount) {
        this.financialAccount = financialAccount;
    }

    /**
     * ��ȡֱ��Ͷ���ʲ�
     *
     * @return direct_assets - ֱ��Ͷ���ʲ�
     */
    public Double getDirectAssets() {
        return directAssets;
    }

    /**
     * ����ֱ��Ͷ���ʲ�
     *
     * @param directAssets ֱ��Ͷ���ʲ�
     */
    public void setDirectAssets(Double directAssets) {
        this.directAssets = directAssets;
    }

    /**
     * ��ȡֱ��Ͷ�ʸ�ծ
     *
     * @return direct_liabilities - ֱ��Ͷ�ʸ�ծ
     */
    public Double getDirectLiabilities() {
        return directLiabilities;
    }

    /**
     * ����ֱ��Ͷ�ʸ�ծ
     *
     * @param directLiabilities ֱ��Ͷ�ʸ�ծ
     */
    public void setDirectLiabilities(Double directLiabilities) {
        this.directLiabilities = directLiabilities;
    }

    /**
     * ��ȡ֤ȯͶ���ʲ�
     *
     * @return portfolio_assets - ֤ȯͶ���ʲ�
     */
    public Double getPortfolioAssets() {
        return portfolioAssets;
    }

    /**
     * ����֤ȯͶ���ʲ�
     *
     * @param portfolioAssets ֤ȯͶ���ʲ�
     */
    public void setPortfolioAssets(Double portfolioAssets) {
        this.portfolioAssets = portfolioAssets;
    }

    /**
     * ��ȡ֤ȯͶ�ʸ�ծ
     *
     * @return portfolio_liabilities - ֤ȯͶ�ʸ�ծ
     */
    public Double getPortfolioLiabilities() {
        return portfolioLiabilities;
    }

    /**
     * ����֤ȯͶ�ʸ�ծ
     *
     * @param portfolioLiabilities ֤ȯͶ�ʸ�ծ
     */
    public void setPortfolioLiabilities(Double portfolioLiabilities) {
        this.portfolioLiabilities = portfolioLiabilities;
    }

    /**
     * ��ȡ�������������ʲ�
     *
     * @return financial_assets - �������������ʲ�
     */
    public Double getFinancialAssets() {
        return financialAssets;
    }

    /**
     * ���ý������������ʲ�
     *
     * @param financialAssets �������������ʲ�
     */
    public void setFinancialAssets(Double financialAssets) {
        this.financialAssets = financialAssets;
    }

    /**
     * ��ȡ�����������߸�ծ
     *
     * @return financial_liabilities - �����������߸�ծ
     */
    public Double getFinancialLiabilities() {
        return financialLiabilities;
    }

    /**
     * ���ý����������߸�ծ
     *
     * @param financialLiabilities �����������߸�ծ
     */
    public void setFinancialLiabilities(Double financialLiabilities) {
        this.financialLiabilities = financialLiabilities;
    }

    /**
     * ��ȡ����Ͷ�ʸ�ծ
     *
     * @return other_liabilities - ����Ͷ�ʸ�ծ
     */
    public Double getOtherLiabilities() {
        return otherLiabilities;
    }

    /**
     * ��������Ͷ�ʸ�ծ
     *
     * @param otherLiabilities ����Ͷ�ʸ�ծ
     */
    public void setOtherLiabilities(Double otherLiabilities) {
        this.otherLiabilities = otherLiabilities;
    }

    /**
     * ��ȡ�����ʲ�
     *
     * @return reserves_assets - �����ʲ�
     */
    public Double getReservesAssets() {
        return reservesAssets;
    }

    /**
     * ���ô����ʲ�
     *
     * @param reservesAssets �����ʲ�
     */
    public void setReservesAssets(Double reservesAssets) {
        this.reservesAssets = reservesAssets;
    }

    /**
     * ��ȡ��������©
     *
     * @return errors_omissions - ��������©
     */
    public Double getErrorsOmissions() {
        return errorsOmissions;
    }

    /**
     * ���þ�������©
     *
     * @param errorsOmissions ��������©
     */
    public void setErrorsOmissions(Double errorsOmissions) {
        this.errorsOmissions = errorsOmissions;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ��������
     *
     * @return updated - ��������
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø�������
     *
     * @param updated ��������
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}