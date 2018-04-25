package okkpp.biz.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_household_consumption_expenditure")
public class HouseholdConsumptionExpenditure implements Serializable {
    @Id
    private Integer id;

    /**
     * ����/����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ������������֧��
     */
    private Integer expenditure;

    /**
     * �˾�������������֧��
     */
    @Column(name = "expenditure_per")
    private Integer expenditurePer;

    /**
     * ���
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
     * ��ȡ����/����
     *
     * @return country - ����/����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���/����
     *
     * @param country ����/����
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
     * ��ȡ������������֧��
     *
     * @return expenditure - ������������֧��
     */
    public Integer getExpenditure() {
        return expenditure;
    }

    /**
     * ���þ�����������֧��
     *
     * @param expenditure ������������֧��
     */
    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    /**
     * ��ȡ�˾�������������֧��
     *
     * @return expenditure_per - �˾�������������֧��
     */
    public Integer getExpenditurePer() {
        return expenditurePer;
    }

    /**
     * �����˾�������������֧��
     *
     * @param expenditurePer �˾�������������֧��
     */
    public void setExpenditurePer(Integer expenditurePer) {
        this.expenditurePer = expenditurePer;
    }

    /**
     * ��ȡ���
     *
     * @return sort - ���
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * �������
     *
     * @param sort ���
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