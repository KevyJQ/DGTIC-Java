package mx.unam.dgtic.dominio;

public class CachedEntity {
	private long createTime;

	public CachedEntity() {
		createTime = System.currentTimeMillis();
	}

	public long getCaheAge() {
		return System.currentTimeMillis() - createTime;
	}
	
}
