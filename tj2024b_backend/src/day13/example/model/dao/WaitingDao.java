package day13.example.model.dao;

import day13.example.model.dto.WaitingDto;

public class WaitingDao {

	// 싱글톤 만들기
	private WaitingDao() {}
	private static WaitingDao instance = new WaitingDao();
	public static WaitingDao getInstance() {return instance;}
	
	private WaitingDto[] waitingDB = new WaitingDto[100];
	
	// 대기등록 처리
	public boolean write(WaitingDto waitingDto) {
		for(int index = 0; index <= waitingDB.length-1; index++) {
			if(waitingDB[index] == null) {
				waitingDB[index] = waitingDto;
				return true;
			}
		} // for end
		return false;
	} // write end
	
	public WaitingDto[] printAll() {
		return waitingDB;
	} // printAll end
}
