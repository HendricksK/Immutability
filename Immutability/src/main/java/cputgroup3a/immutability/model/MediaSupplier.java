/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.model;

/**
 *
 * @author kurvin
 */
public final class MediaSupplier {
    
    private String supplier;
    private int ID;
    private String product;
    private Double price;
    
    private MediaSupplier(){};
    
    private MediaSupplier(MediaSupplier item){
        this.ID = item.ID;
        this.product = item.product;
        this.supplier = item.supplier;
        this.price = item.price;
    }
    
    private MediaSupplier(Builder item){
        this.ID = item.ID;
        this.product = item.product;
        this.supplier = item.supplier;
        this.price = item.price;
    }
    
    public static class Builder{
        private String supplier;
        private int ID;
        private String product;
        private Double price;
        
        public Builder(int ID){
            this.ID = ID;
        }

        public Builder setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }
        
        public Builder MediaSupplier(MediaSupplier item){
            this.product = item.product;
            this.supplier = item.supplier;
            this.price = item.price;
            return this;
        }
        
        public MediaSupplier build(){
            return new MediaSupplier(this);
        }
        
    }

    public String getSupplier() {
        return supplier;
    }

    public int getID() {
        return ID;
    }

    public String getProduct() {
        return product;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MediaSupplier other = (MediaSupplier) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
    
}
