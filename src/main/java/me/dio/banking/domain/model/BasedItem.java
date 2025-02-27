package me.dio.banking.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasedItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long basedId;
    String icon;
    String description;

    public long getFeatureId() {
        return basedId;
    }

    public void setFeatureId(long featureId) {
        this.basedId = featureId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
