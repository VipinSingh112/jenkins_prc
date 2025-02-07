/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the company unsecured creditor service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.CompanyUnsecuredCreditorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditorPersistence
 * @generated
 */
public class CompanyUnsecuredCreditorUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		getPersistence().clearCache(companyUnsecuredCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CompanyUnsecuredCreditor>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanyUnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanyUnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanyUnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompanyUnsecuredCreditor update(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return getPersistence().update(companyUnsecuredCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompanyUnsecuredCreditor update(
		CompanyUnsecuredCreditor companyUnsecuredCreditor,
		ServiceContext serviceContext) {

		return getPersistence().update(
			companyUnsecuredCreditor, serviceContext);
	}

	/**
	 * Returns all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of matching company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	public static CompanyUnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	public static CompanyUnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a matching company unsecured creditor could not be found
	 */
	public static CompanyUnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company unsecured creditor, or <code>null</code> if a matching company unsecured creditor could not be found
	 */
	public static CompanyUnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the company unsecured creditors before and after the current company unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the current company unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public static CompanyUnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companyUnsecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<CompanyUnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			companyUnsecuredCreditorId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the company unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of company unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company unsecured creditors
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the company unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 */
	public static void cacheResult(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		getPersistence().cacheResult(companyUnsecuredCreditor);
	}

	/**
	 * Caches the company unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param companyUnsecuredCreditors the company unsecured creditors
	 */
	public static void cacheResult(
		List<CompanyUnsecuredCreditor> companyUnsecuredCreditors) {

		getPersistence().cacheResult(companyUnsecuredCreditors);
	}

	/**
	 * Creates a new company unsecured creditor with the primary key. Does not add the company unsecured creditor to the database.
	 *
	 * @param companyUnsecuredCreditorId the primary key for the new company unsecured creditor
	 * @return the new company unsecured creditor
	 */
	public static CompanyUnsecuredCreditor create(
		long companyUnsecuredCreditorId) {

		return getPersistence().create(companyUnsecuredCreditorId);
	}

	/**
	 * Removes the company unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public static CompanyUnsecuredCreditor remove(
			long companyUnsecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyUnsecuredCreditorException {

		return getPersistence().remove(companyUnsecuredCreditorId);
	}

	public static CompanyUnsecuredCreditor updateImpl(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return getPersistence().updateImpl(companyUnsecuredCreditor);
	}

	/**
	 * Returns the company unsecured creditor with the primary key or throws a <code>NoSuchCompanyUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor
	 * @throws NoSuchCompanyUnsecuredCreditorException if a company unsecured creditor with the primary key could not be found
	 */
	public static CompanyUnsecuredCreditor findByPrimaryKey(
			long companyUnsecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyUnsecuredCreditorException {

		return getPersistence().findByPrimaryKey(companyUnsecuredCreditorId);
	}

	/**
	 * Returns the company unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor, or <code>null</code> if a company unsecured creditor with the primary key could not be found
	 */
	public static CompanyUnsecuredCreditor fetchByPrimaryKey(
		long companyUnsecuredCreditorId) {

		return getPersistence().fetchByPrimaryKey(companyUnsecuredCreditorId);
	}

	/**
	 * Returns all the company unsecured creditors.
	 *
	 * @return the company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company unsecured creditors
	 */
	public static List<CompanyUnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanyUnsecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the company unsecured creditors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of company unsecured creditors.
	 *
	 * @return the number of company unsecured creditors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CompanyUnsecuredCreditorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CompanyUnsecuredCreditorPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CompanyUnsecuredCreditorPersistence _persistence;

}