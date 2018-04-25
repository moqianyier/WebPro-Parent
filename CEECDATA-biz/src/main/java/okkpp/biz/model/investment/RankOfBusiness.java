package okkpp.biz.model.investment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_investment_rank_of_business")
public class RankOfBusiness implements Serializable {
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
     * ��ҵ��Ӫ��������
     */
    @Column(name = "business_rank")
    private Integer businessRank;

    /**
     * ������ҵ����
     */
    @Column(name = "start_rank")
    private Integer startRank;

    /**
     * ���뽨���������
     */
    @Column(name = "construction_rank")
    private Integer constructionRank;

    /**
     * ���뽨���������(��)
     */
    @Column(name = "construction_number")
    private Integer constructionNumber;

    /**
     * ���뽨�����ʱ��(��)
     */
    @Column(name = "construction_days")
    private Double constructionDays;

    /**
     * ע���ʲ�����
     */
    @Column(name = "property_rank")
    private Integer propertyRank;

    /**
     * ע���ʲ�����(��)
     */
    @Column(name = "property_number")
    private Integer propertyNumber;

    /**
     * ע���ʲ�ʱ��(��)
     */
    @Column(name = "property_days")
    private Double propertyDays;

    /**
     * ����Ŵ�����
     */
    @Column(name = "credit_rank")
    private Integer creditRank;

    /**
     * ����˰������
     */
    @Column(name = "taxes_rank")
    private Integer taxesRank;

    /**
     * ��СͶ���߱�������
     */
    @Column(name = "investors_rank")
    private Integer investorsRank;

    /**
     * ��СͶ���߱���ָ��
     */
    @Column(name = "investors_index")
    private Double investorsIndex;

    /**
     * �羳ó������
     */
    @Column(name = "trading_rank")
    private Integer tradingRank;

    /**
     * ��ִͬ������
     */
    @Column(name = "contracts_rank")
    private Integer contractsRank;

    /**
     * ��ִͬ��ʱ��(��)
     */
    @Column(name = "contracts_days")
    private Double contractsDays;

    /**
     * ����Ʋ�����
     */
    @Column(name = "insolvency_rank")
    private Integer insolvencyRank;

    /**
     * ����Ʋ�ʱ��(��)
     */
    @Column(name = "insolcenvy_days")
    private Double insolcenvyDays;

    /**
     * ����Ʋ��ջ���(����/��Ԫ)
     */
    @Column(name = "insolvency_rate")
    private Double insolvencyRate;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ����ʱ��
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
     * ��ȡ��ҵ��Ӫ��������
     *
     * @return business_rank - ��ҵ��Ӫ��������
     */
    public Integer getBusinessRank() {
        return businessRank;
    }

    /**
     * ������ҵ��Ӫ��������
     *
     * @param businessRank ��ҵ��Ӫ��������
     */
    public void setBusinessRank(Integer businessRank) {
        this.businessRank = businessRank;
    }

    /**
     * ��ȡ������ҵ����
     *
     * @return start_rank - ������ҵ����
     */
    public Integer getStartRank() {
        return startRank;
    }

    /**
     * ���ÿ�����ҵ����
     *
     * @param startRank ������ҵ����
     */
    public void setStartRank(Integer startRank) {
        this.startRank = startRank;
    }

    /**
     * ��ȡ���뽨���������
     *
     * @return construction_rank - ���뽨���������
     */
    public Integer getConstructionRank() {
        return constructionRank;
    }

    /**
     * �������뽨���������
     *
     * @param constructionRank ���뽨���������
     */
    public void setConstructionRank(Integer constructionRank) {
        this.constructionRank = constructionRank;
    }

    /**
     * ��ȡ���뽨���������(��)
     *
     * @return construction_number - ���뽨���������(��)
     */
    public Integer getConstructionNumber() {
        return constructionNumber;
    }

    /**
     * �������뽨���������(��)
     *
     * @param constructionNumber ���뽨���������(��)
     */
    public void setConstructionNumber(Integer constructionNumber) {
        this.constructionNumber = constructionNumber;
    }

    /**
     * ��ȡ���뽨�����ʱ��(��)
     *
     * @return construction_days - ���뽨�����ʱ��(��)
     */
    public Double getConstructionDays() {
        return constructionDays;
    }

    /**
     * �������뽨�����ʱ��(��)
     *
     * @param constructionDays ���뽨�����ʱ��(��)
     */
    public void setConstructionDays(Double constructionDays) {
        this.constructionDays = constructionDays;
    }

    /**
     * ��ȡע���ʲ�����
     *
     * @return property_rank - ע���ʲ�����
     */
    public Integer getPropertyRank() {
        return propertyRank;
    }

    /**
     * ����ע���ʲ�����
     *
     * @param propertyRank ע���ʲ�����
     */
    public void setPropertyRank(Integer propertyRank) {
        this.propertyRank = propertyRank;
    }

    /**
     * ��ȡע���ʲ�����(��)
     *
     * @return property_number - ע���ʲ�����(��)
     */
    public Integer getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * ����ע���ʲ�����(��)
     *
     * @param propertyNumber ע���ʲ�����(��)
     */
    public void setPropertyNumber(Integer propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    /**
     * ��ȡע���ʲ�ʱ��(��)
     *
     * @return property_days - ע���ʲ�ʱ��(��)
     */
    public Double getPropertyDays() {
        return propertyDays;
    }

    /**
     * ����ע���ʲ�ʱ��(��)
     *
     * @param propertyDays ע���ʲ�ʱ��(��)
     */
    public void setPropertyDays(Double propertyDays) {
        this.propertyDays = propertyDays;
    }

    /**
     * ��ȡ����Ŵ�����
     *
     * @return credit_rank - ����Ŵ�����
     */
    public Integer getCreditRank() {
        return creditRank;
    }

    /**
     * ���û���Ŵ�����
     *
     * @param creditRank ����Ŵ�����
     */
    public void setCreditRank(Integer creditRank) {
        this.creditRank = creditRank;
    }

    /**
     * ��ȡ����˰������
     *
     * @return taxes_rank - ����˰������
     */
    public Integer getTaxesRank() {
        return taxesRank;
    }

    /**
     * ���ý���˰������
     *
     * @param taxesRank ����˰������
     */
    public void setTaxesRank(Integer taxesRank) {
        this.taxesRank = taxesRank;
    }

    /**
     * ��ȡ��СͶ���߱�������
     *
     * @return investors_rank - ��СͶ���߱�������
     */
    public Integer getInvestorsRank() {
        return investorsRank;
    }

    /**
     * ������СͶ���߱�������
     *
     * @param investorsRank ��СͶ���߱�������
     */
    public void setInvestorsRank(Integer investorsRank) {
        this.investorsRank = investorsRank;
    }

    /**
     * ��ȡ��СͶ���߱���ָ��
     *
     * @return investors_index - ��СͶ���߱���ָ��
     */
    public Double getInvestorsIndex() {
        return investorsIndex;
    }

    /**
     * ������СͶ���߱���ָ��
     *
     * @param investorsIndex ��СͶ���߱���ָ��
     */
    public void setInvestorsIndex(Double investorsIndex) {
        this.investorsIndex = investorsIndex;
    }

    /**
     * ��ȡ�羳ó������
     *
     * @return trading_rank - �羳ó������
     */
    public Integer getTradingRank() {
        return tradingRank;
    }

    /**
     * ���ÿ羳ó������
     *
     * @param tradingRank �羳ó������
     */
    public void setTradingRank(Integer tradingRank) {
        this.tradingRank = tradingRank;
    }

    /**
     * ��ȡ��ִͬ������
     *
     * @return contracts_rank - ��ִͬ������
     */
    public Integer getContractsRank() {
        return contractsRank;
    }

    /**
     * ���ú�ִͬ������
     *
     * @param contractsRank ��ִͬ������
     */
    public void setContractsRank(Integer contractsRank) {
        this.contractsRank = contractsRank;
    }

    /**
     * ��ȡ��ִͬ��ʱ��(��)
     *
     * @return contracts_days - ��ִͬ��ʱ��(��)
     */
    public Double getContractsDays() {
        return contractsDays;
    }

    /**
     * ���ú�ִͬ��ʱ��(��)
     *
     * @param contractsDays ��ִͬ��ʱ��(��)
     */
    public void setContractsDays(Double contractsDays) {
        this.contractsDays = contractsDays;
    }

    /**
     * ��ȡ����Ʋ�����
     *
     * @return insolvency_rank - ����Ʋ�����
     */
    public Integer getInsolvencyRank() {
        return insolvencyRank;
    }

    /**
     * ���ý���Ʋ�����
     *
     * @param insolvencyRank ����Ʋ�����
     */
    public void setInsolvencyRank(Integer insolvencyRank) {
        this.insolvencyRank = insolvencyRank;
    }

    /**
     * ��ȡ����Ʋ�ʱ��(��)
     *
     * @return insolcenvy_days - ����Ʋ�ʱ��(��)
     */
    public Double getInsolcenvyDays() {
        return insolcenvyDays;
    }

    /**
     * ���ý���Ʋ�ʱ��(��)
     *
     * @param insolcenvyDays ����Ʋ�ʱ��(��)
     */
    public void setInsolcenvyDays(Double insolcenvyDays) {
        this.insolcenvyDays = insolcenvyDays;
    }

    /**
     * ��ȡ����Ʋ��ջ���(����/��Ԫ)
     *
     * @return insolvency_rate - ����Ʋ��ջ���(����/��Ԫ)
     */
    public Double getInsolvencyRate() {
        return insolvencyRate;
    }

    /**
     * ���ý���Ʋ��ջ���(����/��Ԫ)
     *
     * @param insolvencyRate ����Ʋ��ջ���(����/��Ԫ)
     */
    public void setInsolvencyRate(Double insolvencyRate) {
        this.insolvencyRate = insolvencyRate;
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
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}