package okkpp.biz.model.investment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_investment_cost_of_business")
public class CostOfBusiness implements Serializable {
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
     * ������ҵ����������(��)
     */
    private Integer number;

    /**
     * ������ҵ����ʱ�䣨��)
     */
    private Double days;

    /**
     * ������ҵ�ɱ�ռ�˾�������أ�%��
     */
    private Double percentage;

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
     * ��ȡ������ҵ����������(��)
     *
     * @return number - ������ҵ����������(��)
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * ���ÿ�����ҵ����������(��)
     *
     * @param number ������ҵ����������(��)
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * ��ȡ������ҵ����ʱ�䣨��)
     *
     * @return days - ������ҵ����ʱ�䣨��)
     */
    public Double getDays() {
        return days;
    }

    /**
     * ���ÿ�����ҵ����ʱ�䣨��)
     *
     * @param days ������ҵ����ʱ�䣨��)
     */
    public void setDays(Double days) {
        this.days = days;
    }

    /**
     * ��ȡ������ҵ�ɱ�ռ�˾�������أ�%��
     *
     * @return percentage - ������ҵ�ɱ�ռ�˾�������أ�%��
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * ���ÿ�����ҵ�ɱ�ռ�˾�������أ�%��
     *
     * @param percentage ������ҵ�ɱ�ռ�˾�������أ�%��
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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