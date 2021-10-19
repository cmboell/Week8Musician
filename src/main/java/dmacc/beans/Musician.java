/**
 *@author -Colby Boell -cmboell
 *CIS175 -Fall 2021
 *Oct 18, 2021
 */
package dmacc.beans;

/**
 * @author cmboe
 *
 */
public class Musician{
	private long id;
	private String artistName;
	private String phone;
	private String genre;

	public Musician() {
		super();
	}

	public Musician(String artistName) {
		super();
		this.artistName = artistName;
	}

	public Musician(String artistName, String phone, String genre) {
		super();
		this.artistName = artistName;
		this.phone = phone;
		this.genre = genre;
	}

	public Musician(int id, String artistName, String phone, String genre) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.phone = phone;
		this.genre = genre;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
	return "Musician[id = “ + id + “,artistName=" + artistName + ",phone=" +phone+ ", genre=" + genre + "]";
	}

}