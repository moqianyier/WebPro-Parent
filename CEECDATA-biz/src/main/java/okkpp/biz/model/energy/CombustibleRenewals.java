package okkpp.biz.model.energy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_energy_combustible_renewals_and_waste_percentage")
public class CombustibleRenewals implements Serializable {
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
     * ��ȼ�Ŀ�������Դ������������ռ��Դ�����ѱ��� 
     */
    private Double rate;

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
     * ��ȡ��ȼ�Ŀ�������Դ������������ռ��Դ�����ѱ��� 
     *
     * @return rate - ��ȼ�Ŀ�������Դ������������ռ��Դ�����ѱ��� 
     */
    public Double getRate() {
        return rate;
    }

    /**
     * ������ȼ�Ŀ�������Դ������������ռ��Դ�����ѱ��� 
     *
     * @param rate ��ȼ�Ŀ�������Դ������������ռ��Դ�����ѱ��� 
     */
    public void setRate(Double rate) {
        this.rate = rate;
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