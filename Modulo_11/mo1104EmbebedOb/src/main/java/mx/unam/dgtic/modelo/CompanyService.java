package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import mx.unam.dgtic.dominio.Address;
import mx.unam.dgtic.dominio.Company;
import mx.unam.dgtic.dominio.Employee;

public class CompanyService {
	protected EntityManager em;

	public CompanyService(EntityManager em) {
		super();
		this.em = em;
	}

	public Company findCompany(int id) {
		return em.find(Company.class, id);
	}

	@SuppressWarnings("unchecked")
	public Collection<Company> findAllCompanies() {
		Query query = em.createQuery("SELECT c FROM Company c");
		return (Collection<Company>) query.getResultList();
	}

	public Company createCompany(String name, String street, String city, String state, String zip) {
		Company company = new Company();
		company.setName(name);

		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);

		company.setAddress(address);

		em.getTransaction().begin();
		em.persist(company);
		em.getTransaction().commit();

		return company;
	}

}
