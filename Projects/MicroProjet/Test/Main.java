package Test;

import java.sql.SQLException;
import java.util.List;

import DAO.ClientsDao;
import DAO.ClientsDaoImpl;
import Classes.Clients;

public class Main {
	public static void main(String[] args) throws SQLException {
		ClientsDao clientsDao = new ClientsDaoImpl();
		clientsDao.addClient(new Clients(4, 3, "t", "Safi", "Saif Eddine"));
		List<Clients> clients = clientsDao.ListClients();
		for (Clients c : clients) {
			System.out.println(c.toString());
		}
		clientsDao.DeleteClient(4);
	}
}
