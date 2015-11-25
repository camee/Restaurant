package restaurantservice;

import java.util.Calendar;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import restaurantentities.Order;
import restaurantentities.TableItem;

/**
 * Session Bean implementation class TableItemService
 */
@Stateless
@LocalBean
public class TableItemService extends AbstractFacade<TableItem> implements TableItemServiceRemote, TableItemServiceLocal {

	@PersistenceContext
	EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public TableItemService() {
        super(TableItem.class);
    }

	@Override
	protected EntityManager em() {
		return entityManager;
	}
	
	public TableItem findFreeTable(Integer minSeats, Integer maxSeats, Calendar date){
		List<TableItem> tables = findAll();
		for (TableItem table : tables) {
			if(table.getSeats() >= minSeats & table.getSeats() < maxSeats){
				Boolean reserved = false;
				for (Order order : table.getOrders()){
					if(order.getDate().equals(date)){
						reserved = true;
					}
				}
				if(reserved = false){
					return table;
				}
			}
		}
		return null;
	}

}
