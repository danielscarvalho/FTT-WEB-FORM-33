package ftt.ec.model;

import java.util.Date;
import java.util.Objects;

public class User {
	
	private int userId;
	private String userName;
	private String userEmail;
	private String userColor;
	private String userCar;
	private Date userDob;
	
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		
		if (userId == null)
			this.setUserId(0);
		else
			this.setUserId(Integer.valueOf(userId));
	
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the userColor
	 */
	public String getUserColor() {
		return userColor;
	}
	/**
	 * @param userColor the userColor to set
	 */
	public void setUserColor(String userColor) {
		this.userColor = userColor;
	}
	/**
	 * @return the userCar
	 */
	public String getUserCar() {
		return userCar;
	}
	/**
	 * @param userCar the userCar to set
	 */
	public void setUserCar(String userCar) {
		this.userCar = userCar;
	}
	/**
	 * @return the userDob
	 */
	public Date getUserDob() {
		return userDob;
	}
	/**
	 * @param userDob the userDob to set
	 */
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userCar, userColor, userDob, userEmail, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(userCar, other.userCar) && Objects.equals(userColor, other.userColor)
				&& Objects.equals(userDob, other.userDob) && Objects.equals(userEmail, other.userEmail)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userColor="
				+ userColor + ", userCar=" + userCar + ", userDob=" + userDob + "]";
	}
	
	

}
