package by.pvt.academy.yarkovich.actions.products;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.pvt.academy.yarkovich.actions.Action;
import by.pvt.academy.yarkovich.constants.AttributeNames;
import by.pvt.academy.yarkovich.constants.PageNames;
import by.pvt.academy.yarkovich.dao.ProductDAO;
import by.pvt.academy.yarkovich.entity.Product;

public class GetNewMenuAction extends Action {

	@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		List<Product> products = ProductDAO.getInstance().getWholeProd();
		request.setAttribute(AttributeNames.MENU, products);
		return PageNames.MENU_PAGE;
	}

}
