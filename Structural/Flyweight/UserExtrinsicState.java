

@ExtrinsicState

public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private Byte[] photo;
    UserIntrinsicState userIntrinsicState;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public void setCurrentGameStreak(int currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public UserIntrinsicState getUserIntrinsicState() {
        return userIntrinsicState;
    }

    public void setUserIntrinsicState(UserIntrinsicState userIntrinsicState) {
        this.userIntrinsicState = userIntrinsicState;
    }


}