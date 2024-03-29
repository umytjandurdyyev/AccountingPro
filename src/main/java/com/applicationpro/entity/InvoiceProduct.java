package com.applicationpro.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_products")
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted=false")
public class InvoiceProduct extends BaseEntity{
    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private String name;
    private Long qty;
    private Long price;
    private Long tax;
    private Long profit;

}
