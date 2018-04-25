package okkpp.biz.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_external")
public class External implements Serializable {
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
     * ��ծ�ܶ�
     */
    @Column(name = "total_debt")
    private Double totalDebt;

    /**
     * ������ծ
     */
    @Column(name = "long_debt")
    private Double longDebt;

    /**
     * ˽�˷ǵ�����ծ
     */
    @Column(name = "private_debt")
    private Double privateDebt;

    /**
     * ����������������ծ
     */
    @Column(name = "public_debt")
    private Double publicDebt;

    /**
     * ���ʻ��һ�����֯����
     */
    @Column(name = "imf_credit")
    private Double imfCredit;

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
     * ��ȡ��ծ�ܶ�
     *
     * @return total_debt - ��ծ�ܶ�
     */
    public Double getTotalDebt() {
        return totalDebt;
    }

    /**
     * ������ծ�ܶ�
     *
     * @param totalDebt ��ծ�ܶ�
     */
    public void setTotalDebt(Double totalDebt) {
        this.totalDebt = totalDebt;
    }

    /**
     * ��ȡ������ծ
     *
     * @return long_debt - ������ծ
     */
    public Double getLongDebt() {
        return longDebt;
    }

    /**
     * ���ó�����ծ
     *
     * @param longDebt ������ծ
     */
    public void setLongDebt(Double longDebt) {
        this.longDebt = longDebt;
    }

    /**
     * ��ȡ˽�˷ǵ�����ծ
     *
     * @return private_debt - ˽�˷ǵ�����ծ
     */
    public Double getPrivateDebt() {
        return privateDebt;
    }

    /**
     * ����˽�˷ǵ�����ծ
     *
     * @param privateDebt ˽�˷ǵ�����ծ
     */
    public void setPrivateDebt(Double privateDebt) {
        this.privateDebt = privateDebt;
    }

    /**
     * ��ȡ����������������ծ
     *
     * @return public_debt - ����������������ծ
     */
    public Double getPublicDebt() {
        return publicDebt;
    }

    /**
     * ��������������������ծ
     *
     * @param publicDebt ����������������ծ
     */
    public void setPublicDebt(Double publicDebt) {
        this.publicDebt = publicDebt;
    }

    /**
     * ��ȡ���ʻ��һ�����֯����
     *
     * @return imf_credit - ���ʻ��һ�����֯����
     */
    public Double getImfCredit() {
        return imfCredit;
    }

    /**
     * ���ù��ʻ��һ�����֯����
     *
     * @param imfCredit ���ʻ��һ�����֯����
     */
    public void setImfCredit(Double imfCredit) {
        this.imfCredit = imfCredit;
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