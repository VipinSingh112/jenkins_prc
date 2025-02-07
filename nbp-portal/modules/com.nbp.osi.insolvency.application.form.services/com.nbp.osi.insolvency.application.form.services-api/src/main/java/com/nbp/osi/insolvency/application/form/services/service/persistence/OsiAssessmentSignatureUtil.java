/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi assessment signature service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiAssessmentSignaturePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignaturePersistence
 * @generated
 */
public class OsiAssessmentSignatureUtil {

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
		OsiAssessmentSignature osiAssessmentSignature) {

		getPersistence().clearCache(osiAssessmentSignature);
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
	public static Map<Serializable, OsiAssessmentSignature> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiAssessmentSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiAssessmentSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiAssessmentSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiAssessmentSignature> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiAssessmentSignature update(
		OsiAssessmentSignature osiAssessmentSignature) {

		return getPersistence().update(osiAssessmentSignature);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiAssessmentSignature update(
		OsiAssessmentSignature osiAssessmentSignature,
		ServiceContext serviceContext) {

		return getPersistence().update(osiAssessmentSignature, serviceContext);
	}

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a matching osi assessment signature could not be found
	 */
	public static OsiAssessmentSignature findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssessmentSignatureException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	public static OsiAssessmentSignature fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	public static OsiAssessmentSignature fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi assessment signature where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assessment signature that was removed
	 */
	public static OsiAssessmentSignature removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssessmentSignatureException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi assessment signatures where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assessment signatures
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the osi assessment signature in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 */
	public static void cacheResult(
		OsiAssessmentSignature osiAssessmentSignature) {

		getPersistence().cacheResult(osiAssessmentSignature);
	}

	/**
	 * Caches the osi assessment signatures in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignatures the osi assessment signatures
	 */
	public static void cacheResult(
		List<OsiAssessmentSignature> osiAssessmentSignatures) {

		getPersistence().cacheResult(osiAssessmentSignatures);
	}

	/**
	 * Creates a new osi assessment signature with the primary key. Does not add the osi assessment signature to the database.
	 *
	 * @param osiAssessmentSignatureId the primary key for the new osi assessment signature
	 * @return the new osi assessment signature
	 */
	public static OsiAssessmentSignature create(long osiAssessmentSignatureId) {
		return getPersistence().create(osiAssessmentSignatureId);
	}

	/**
	 * Removes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	public static OsiAssessmentSignature remove(long osiAssessmentSignatureId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssessmentSignatureException {

		return getPersistence().remove(osiAssessmentSignatureId);
	}

	public static OsiAssessmentSignature updateImpl(
		OsiAssessmentSignature osiAssessmentSignature) {

		return getPersistence().updateImpl(osiAssessmentSignature);
	}

	/**
	 * Returns the osi assessment signature with the primary key or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	public static OsiAssessmentSignature findByPrimaryKey(
			long osiAssessmentSignatureId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssessmentSignatureException {

		return getPersistence().findByPrimaryKey(osiAssessmentSignatureId);
	}

	/**
	 * Returns the osi assessment signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature, or <code>null</code> if a osi assessment signature with the primary key could not be found
	 */
	public static OsiAssessmentSignature fetchByPrimaryKey(
		long osiAssessmentSignatureId) {

		return getPersistence().fetchByPrimaryKey(osiAssessmentSignatureId);
	}

	/**
	 * Returns all the osi assessment signatures.
	 *
	 * @return the osi assessment signatures
	 */
	public static List<OsiAssessmentSignature> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @return the range of osi assessment signatures
	 */
	public static List<OsiAssessmentSignature> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assessment signatures
	 */
	public static List<OsiAssessmentSignature> findAll(
		int start, int end,
		OrderByComparator<OsiAssessmentSignature> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assessment signatures
	 */
	public static List<OsiAssessmentSignature> findAll(
		int start, int end,
		OrderByComparator<OsiAssessmentSignature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi assessment signatures from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi assessment signatures.
	 *
	 * @return the number of osi assessment signatures
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiAssessmentSignaturePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiAssessmentSignaturePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiAssessmentSignaturePersistence _persistence;

}