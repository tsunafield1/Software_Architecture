package com.structural;

import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private final LinkedHashSet<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        this.members = new LinkedHashSet<>();
    }
    
    public void addMember(HealthcareServiceable component) {
        members.add(component);
    }
    
    public void removeMember(HealthcareServiceable component) {
        members.remove(component);
    }
    
    @Override
    public void service() {
        for(HealthcareServiceable component : members)
            component.service();
    }

    @Override
    public double getPrice() {
        double price;
        price = 0;
        for(HealthcareServiceable component : members)
            price += component.getPrice();
        return price;
    }
}
