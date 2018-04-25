package okkpp.biz.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_foreign")
public class Foreign implements Serializable {
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
     * ����ֱ��Ͷ��
     */
    private Double inflows;

    /**
     * ����ֱ��Ͷ��
     */
    private Double outflows;

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
     * ��ȡ����ֱ��Ͷ��
     *
     * @return inflows - ����ֱ��Ͷ��
     */
    public Double getInflows() {
        return inflows;
    }

    /**
     * ��������ֱ��Ͷ��
     *
     * @param inflows ����ֱ��Ͷ��
     */
    public void setInflows(Double inflows) {
        this.inflows = inflows;
    }

    /**
     * ��ȡ����ֱ��Ͷ��
     *
     * @return outflows - ����ֱ��Ͷ��
     */
    public Double getOutflows() {
        return outflows;
    }

    /**
     * ���ö���ֱ��Ͷ��
     *
     * @param outflows ����ֱ��Ͷ��
     */
    public void setOutflows(Double outflows) {
        this.outflows = outflows;
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