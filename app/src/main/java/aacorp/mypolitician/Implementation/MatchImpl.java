package aacorp.mypolitician.Implementation;

import com.google.firebase.firestore.GeoPoint;

import java.util.Map;

import aacorp.mypolitician.framework.Match;

public class MatchImpl implements Match {

    private String name;
    private String party;
    private GeoPoint area;
    private int bannerId;
    private int profilePictureId;
    private Map<String,StrengthImpl> strength;

    public MatchImpl(){
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getParty() {
        return party;
    }

    @Override
    public GeoPoint getArea() {
        return area;
    }

    @Override
    public int getBannerId() {
        return bannerId;
    }

    @Override
    public int getProfilePictureId() {
        return profilePictureId;
    }

    @Override
    public Map<String,StrengthImpl> getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setArea(GeoPoint area) {
        this.area = area;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public void setProfilePictureId(int profilePictureId) {
        this.profilePictureId = profilePictureId;
    }

    public void setStrength(Map<String,StrengthImpl> strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "MatchImpl{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", area=" + area +
                ", bannerId=" + bannerId +
                ", profilePictureId=" + profilePictureId +
                ", strength=" + strength +
                '}';
    }
}
