/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.CompanySecuredCreditor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the company secured creditor service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.CompanySecuredCreditorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditorPersistence
 * @generated
 */
public class CompanySecuredCreditorUtil {

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
		CompanySecuredCreditor companySecuredCreditor) {

		getPersistence().clearCache(companySecuredCreditor);
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
	public static Map<Serializable, CompanySecuredCreditor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompanySecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompanySecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompanySecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CompanySecuredCreditor update(
		CompanySecuredCreditor companySecuredCreditor) {

		return getPersistence().update(companySecuredCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CompanySecuredCreditor update(
		CompanySecuredCreditor companySecuredCreditor,
		ServiceContext serviceContext) {

		return getPersistence().update(companySecuredCreditor, serviceContext);
	}

	/**
	 * Returns all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching company secured creditors
	 */
	public static List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of matching company secured creditors
	 */
	public static List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching company secured creditors
	 */
	public static List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching company secured creditors
	 */
	public static List<CompanySecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	public static CompanySecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanySecuredCreditorException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	public static CompanySecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a matching company secured creditor could not be found
	 */
	public static CompanySecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanySecuredCreditorException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching company secured creditor, or <code>null</code> if a matching company secured creditor could not be found
	 */
	public static CompanySecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the company secured creditors before and after the current company secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param companySecuredCreditorId the primary key of the current company secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public static CompanySecuredCreditor[] findBygetOsiById_PrevAndNext(
			long companySecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<CompanySecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanySecuredCreditorException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			companySecuredCreditorId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the company secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of company secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching company secured creditors
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the company secured creditor in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditor the company secured creditor
	 */
	public static void cacheResult(
		CompanySecuredCreditor companySecuredCreditor) {

		getPersistence().cacheResult(companySecuredCreditor);
	}

	/**
	 * Caches the company secured creditors in the entity cache if it is enabled.
	 *
	 * @param companySecuredCreditors the company secured creditors
	 */
	public static void cacheResult(
		List<CompanySecuredCreditor> companySecuredCreditors) {

		getPersistence().cacheResult(companySecuredCreditors);
	}

	/**
	 * Creates a new company secured creditor with the primary key. Does not add the company secured creditor to the database.
	 *
	 * @param companySecuredCreditorId the primary key for the new company secured creditor
	 * @return the new company secured creditor
	 */
	public static CompanySecuredCreditor create(long companySecuredCreditorId) {
		return getPersistence().create(companySecuredCreditorId);
	}

	/**
	 * Removes the company secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor that was removed
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public static CompanySecuredCreditor remove(long companySecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanySecuredCreditorException {

		return getPersistence().remove(companySecuredCreditorId);
	}

	public static CompanySecuredCreditor updateImpl(
		CompanySecuredCreditor companySecuredCreditor) {

		return getPersistence().updateImpl(companySecuredCreditor);
	}

	/**
	 * Returns the company secured creditor with the primary key or throws a <code>NoSuchCompanySecuredCreditorException</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor
	 * @throws NoSuchCompanySecuredCreditorException if a company secured creditor with the primary key could not be found
	 */
	public static CompanySecuredCreditor findByPrimaryKey(
			long companySecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanySecuredCreditorException {

		return getPersistence().findByPrimaryKey(companySecuredCreditorId);
	}

	/**
	 * Returns the company secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor, or <code>null</code> if a company secured creditor with the primary key could not be found
	 */
	public static CompanySecuredCreditor fetchByPrimaryKey(
		long companySecuredCreditorId) {

		return getPersistence().fetchByPrimaryKey(companySecuredCreditorId);
	}

	/**
	 * Returns all the company secured creditors.
	 *
	 * @return the company secured creditors
	 */
	public static List<CompanySecuredCreditor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of company secured creditors
	 */
	public static List<CompanySecuredCreditor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of company secured creditors
	 */
	public static List<CompanySecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of company secured creditors
	 */
	public static List<CompanySecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<CompanySecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the company secured creditors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of company secured creditors.
	 *
	 * @return the number of company secured creditors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CompanySecuredCreditorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CompanySecuredCreditorPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CompanySecuredCreditorPersistence _persistence;

}