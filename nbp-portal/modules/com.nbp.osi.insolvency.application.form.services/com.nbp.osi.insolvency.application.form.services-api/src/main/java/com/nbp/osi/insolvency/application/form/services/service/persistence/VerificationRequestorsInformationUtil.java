/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInformation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the verification requestors information service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.VerificationRequestorsInformationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInformationPersistence
 * @generated
 */
public class VerificationRequestorsInformationUtil {

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
		VerificationRequestorsInformation verificationRequestorsInformation) {

		getPersistence().clearCache(verificationRequestorsInformation);
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
	public static Map<Serializable, VerificationRequestorsInformation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VerificationRequestorsInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VerificationRequestorsInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VerificationRequestorsInformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VerificationRequestorsInformation>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VerificationRequestorsInformation update(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		return getPersistence().update(verificationRequestorsInformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VerificationRequestorsInformation update(
		VerificationRequestorsInformation verificationRequestorsInformation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			verificationRequestorsInformation, serviceContext);
	}

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a matching verification requestors information could not be found
	 */
	public static VerificationRequestorsInformation findBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInformationException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	public static VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification requestors information where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors information, or <code>null</code> if a matching verification requestors information could not be found
	 */
	public static VerificationRequestorsInformation fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the verification requestors information where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors information that was removed
	 */
	public static VerificationRequestorsInformation removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInformationException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of verification requestors informations where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors informations
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the verification requestors information in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 */
	public static void cacheResult(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		getPersistence().cacheResult(verificationRequestorsInformation);
	}

	/**
	 * Caches the verification requestors informations in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInformations the verification requestors informations
	 */
	public static void cacheResult(
		List<VerificationRequestorsInformation>
			verificationRequestorsInformations) {

		getPersistence().cacheResult(verificationRequestorsInformations);
	}

	/**
	 * Creates a new verification requestors information with the primary key. Does not add the verification requestors information to the database.
	 *
	 * @param verificationRequestorsInformationPK the primary key for the new verification requestors information
	 * @return the new verification requestors information
	 */
	public static VerificationRequestorsInformation create(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK) {

		return getPersistence().create(verificationRequestorsInformationPK);
	}

	/**
	 * Removes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	public static VerificationRequestorsInformation remove(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInformationException {

		return getPersistence().remove(verificationRequestorsInformationPK);
	}

	public static VerificationRequestorsInformation updateImpl(
		VerificationRequestorsInformation verificationRequestorsInformation) {

		return getPersistence().updateImpl(verificationRequestorsInformation);
	}

	/**
	 * Returns the verification requestors information with the primary key or throws a <code>NoSuchVerificationRequestorsInformationException</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws NoSuchVerificationRequestorsInformationException if a verification requestors information with the primary key could not be found
	 */
	public static VerificationRequestorsInformation findByPrimaryKey(
			VerificationRequestorsInformationPK
				verificationRequestorsInformationPK)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInformationException {

		return getPersistence().findByPrimaryKey(
			verificationRequestorsInformationPK);
	}

	/**
	 * Returns the verification requestors information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information, or <code>null</code> if a verification requestors information with the primary key could not be found
	 */
	public static VerificationRequestorsInformation fetchByPrimaryKey(
		VerificationRequestorsInformationPK
			verificationRequestorsInformationPK) {

		return getPersistence().fetchByPrimaryKey(
			verificationRequestorsInformationPK);
	}

	/**
	 * Returns all the verification requestors informations.
	 *
	 * @return the verification requestors informations
	 */
	public static List<VerificationRequestorsInformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @return the range of verification requestors informations
	 */
	public static List<VerificationRequestorsInformation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors informations
	 */
	public static List<VerificationRequestorsInformation> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInformation>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors informations
	 */
	public static List<VerificationRequestorsInformation> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInformation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the verification requestors informations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of verification requestors informations.
	 *
	 * @return the number of verification requestors informations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static VerificationRequestorsInformationPersistence
		getPersistence() {

		return _persistence;
	}

	private static volatile VerificationRequestorsInformationPersistence
		_persistence;

}