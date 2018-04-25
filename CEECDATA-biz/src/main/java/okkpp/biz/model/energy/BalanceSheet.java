package okkpp.biz.model.energy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_energy_balance_sheet")
public class BalanceSheet implements Serializable {
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
     * ú��ú��Ʒ������
     */
    private Integer coal;

    /**
     * ��Ȼ��������
     */
    @Column(name = "natural_gas")
    private Integer naturalGas;

    /**
     * ��Դ�����ܼ�
     */
    private Integer imports;

    /**
     * ú��ú��Ʒ������
     */
    @Column(name = "imports_coal")
    private Integer importsCoal;

    /**
     * ��Ȼ��������
     */
    @Column(name = "imports_natural_gas")
    private Integer importsNaturalGas;

    /**
     * ��Դ�������ܼ�
     */
    private Integer total;

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
     * ��ȡú��ú��Ʒ������
     *
     * @return coal - ú��ú��Ʒ������
     */
    public Integer getCoal() {
        return coal;
    }

    /**
     * ����ú��ú��Ʒ������
     *
     * @param coal ú��ú��Ʒ������
     */
    public void setCoal(Integer coal) {
        this.coal = coal;
    }

    /**
     * ��ȡ��Ȼ��������
     *
     * @return natural_gas - ��Ȼ��������
     */
    public Integer getNaturalGas() {
        return naturalGas;
    }

    /**
     * ������Ȼ��������
     *
     * @param naturalGas ��Ȼ��������
     */
    public void setNaturalGas(Integer naturalGas) {
        this.naturalGas = naturalGas;
    }

    /**
     * ��ȡ��Դ�����ܼ�
     *
     * @return imports - ��Դ�����ܼ�
     */
    public Integer getImports() {
        return imports;
    }

    /**
     * ������Դ�����ܼ�
     *
     * @param imports ��Դ�����ܼ�
     */
    public void setImports(Integer imports) {
        this.imports = imports;
    }

    /**
     * ��ȡú��ú��Ʒ������
     *
     * @return imports_coal - ú��ú��Ʒ������
     */
    public Integer getImportsCoal() {
        return importsCoal;
    }

    /**
     * ����ú��ú��Ʒ������
     *
     * @param importsCoal ú��ú��Ʒ������
     */
    public void setImportsCoal(Integer importsCoal) {
        this.importsCoal = importsCoal;
    }

    /**
     * ��ȡ��Ȼ��������
     *
     * @return imports_natural_gas - ��Ȼ��������
     */
    public Integer getImportsNaturalGas() {
        return importsNaturalGas;
    }

    /**
     * ������Ȼ��������
     *
     * @param importsNaturalGas ��Ȼ��������
     */
    public void setImportsNaturalGas(Integer importsNaturalGas) {
        this.importsNaturalGas = importsNaturalGas;
    }

    /**
     * ��ȡ��Դ�������ܼ�
     *
     * @return total - ��Դ�������ܼ�
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * ������Դ�������ܼ�
     *
     * @param total ��Դ�������ܼ�
     */
    public void setTotal(Integer total) {
        this.total = total;
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