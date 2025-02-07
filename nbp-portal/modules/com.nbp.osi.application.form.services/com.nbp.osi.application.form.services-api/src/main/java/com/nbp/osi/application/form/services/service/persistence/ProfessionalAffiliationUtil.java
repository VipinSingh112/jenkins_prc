/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the professional affiliation service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.ProfessionalAffiliationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessionalAffiliationPersistence
 * @generated
 */
public class ProfessionalAffiliationUtil {

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
		ProfessionalAffiliation professionalAffiliation) {

		getPersistence().clearCache(professionalAffiliation);
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
	public static Map<Serializable, ProfessionalAffiliation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProfessionalAffiliation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProfessionalAffiliation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProfessionalAffiliation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProfessionalAffiliation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProfessionalAffiliation update(
		ProfessionalAffiliation professionalAffiliation) {

		return getPersistence().update(professionalAffiliation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProfessionalAffiliation update(
		ProfessionalAffiliation professionalAffiliation,
		ServiceContext serviceContext) {

		return getPersistence().update(professionalAffiliation, serviceContext);
	}

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a matching professional affiliation could not be found
	 */
	public static ProfessionalAffiliation findBygetOsiById(
			long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	public static ProfessionalAffiliation fetchBygetOsiById(
		long osiApplicationId) {

		return getPersistence().fetchBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	public static ProfessionalAffiliation fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the professional affiliation where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the professional affiliation that was removed
	 */
	public static ProfessionalAffiliation removeBygetOsiById(
			long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of professional affiliations where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching professional affiliations
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the professional affiliation in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliation the professional affiliation
	 */
	public static void cacheResult(
		ProfessionalAffiliation professionalAffiliation) {

		getPersistence().cacheResult(professionalAffiliation);
	}

	/**
	 * Caches the professional affiliations in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliations the professional affiliations
	 */
	public static void cacheResult(
		List<ProfessionalAffiliation> professionalAffiliations) {

		getPersistence().cacheResult(professionalAffiliations);
	}

	/**
	 * Creates a new professional affiliation with the primary key. Does not add the professional affiliation to the database.
	 *
	 * @param professionalAffiliationId the primary key for the new professional affiliation
	 * @return the new professional affiliation
	 */
	public static ProfessionalAffiliation create(
		long professionalAffiliationId) {

		return getPersistence().create(professionalAffiliationId);
	}

	/**
	 * Removes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	public static ProfessionalAffiliation remove(long professionalAffiliationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return getPersistence().remove(professionalAffiliationId);
	}

	public static ProfessionalAffiliation updateImpl(
		ProfessionalAffiliation professionalAffiliation) {

		return getPersistence().updateImpl(professionalAffiliation);
	}

	/**
	 * Returns the professional affiliation with the primary key or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	public static ProfessionalAffiliation findByPrimaryKey(
			long professionalAffiliationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchProfessionalAffiliationException {

		return getPersistence().findByPrimaryKey(professionalAffiliationId);
	}

	/**
	 * Returns the professional affiliation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation, or <code>null</code> if a professional affiliation with the primary key could not be found
	 */
	public static ProfessionalAffiliation fetchByPrimaryKey(
		long professionalAffiliationId) {

		return getPersistence().fetchByPrimaryKey(professionalAffiliationId);
	}

	/**
	 * Returns all the professional affiliations.
	 *
	 * @return the professional affiliations
	 */
	public static List<ProfessionalAffiliation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @return the range of professional affiliations
	 */
	public static List<ProfessionalAffiliation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of professional affiliations
	 */
	public static List<ProfessionalAffiliation> findAll(
		int start, int end,
		OrderByComparator<ProfessionalAffiliation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of professional affiliations
	 */
	public static List<ProfessionalAffiliation> findAll(
		int start, int end,
		OrderByComparator<ProfessionalAffiliation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the professional affiliations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of professional affiliations.
	 *
	 * @return the number of professional affiliations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProfessionalAffiliationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ProfessionalAffiliationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ProfessionalAffiliationPersistence _persistence;

}