/**
 *  PolitcianImpl is the implementation of the Politician Interface.
 *  The class is a pretty trivial implementation, the reason for this is
 *  that a trivial class is easy to move to the FireStore solution.
 *
 *  @author Anders Bille Wiggers
 *  for Introduction-to-Human-Computer-InteractionI course.
 *  Copyright (c) 2018.
 *
 */

package aacorp.mypolitician.Implementation;

import com.google.firebase.firestore.GeoPoint;

import java.util.Map;

import aacorp.mypolitician.framework.Politician;

public class PoliticianImpl implements Politician {

    private String name;
    private String party;
    private GeoPoint geoPoint;
    private String bannerId;
    private String profilePictureId;
    private Map<String,StrengthImpl> strength;
    private String id;
    private boolean isMale;

    public PoliticianImpl(){
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getParty() { return party; }

    @Override
    public GeoPoint getArea() {
        return geoPoint;
    }

    @Override
    public String getBannerId() {
        return bannerId;
    }

    @Override
    public String getProfilePictureId() {
        return profilePictureId;
    }

    @Override
    public boolean getIsMale() {
        return isMale;
    }

    @Override
    public Map<String,StrengthImpl> getStrength() {
        return strength;
    }
    
    @Override
    public String getId(){
        return id;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setArea(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public void setProfilePictureId(String profilePictureId) {
        this.profilePictureId = profilePictureId;
    }

    public void setStrength(Map<String,StrengthImpl> strength) {
        this.strength = strength;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PoliticianImpl{" +
                "Name='" + name + '\'' +
                ", Party='" + party + '\'' +
                ", Location=" + geoPoint +
                ", Banner id=" + bannerId +
                ", Profile picture id=" + profilePictureId +
                ", Strength=" + strength +
                '}';
    }



}
