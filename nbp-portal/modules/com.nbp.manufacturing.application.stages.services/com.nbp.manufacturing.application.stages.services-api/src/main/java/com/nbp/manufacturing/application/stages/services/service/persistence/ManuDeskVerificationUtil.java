/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu desk verification service. This utility wraps <code>com.nbp.manufacturing.application.stages.services.service.persistence.impl.ManuDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationPersistence
 * @generated
 */
public class ManuDeskVerificationUtil {

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
	public static void clearCache(ManuDeskVerification manuDeskVerification) {
		getPersistence().clearCache(manuDeskVerification);
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
	public static Map<Serializable, ManuDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuDeskVerification update(
		ManuDeskVerification manuDeskVerification) {

		return getPersistence().update(manuDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuDeskVerification update(
		ManuDeskVerification manuDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(manuDeskVerification, serviceContext);
	}

	/**
	 * Returns all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId) {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start,
			int end) {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId, start, end,
				orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId, start, end,
				orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_First(
				String status, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId_First(
				status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_First(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetManuDeskVerificationByStatus_ApplicationId_First(
				status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_Last(
				String status, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId_Last(
				status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_Last(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetManuDeskVerificationByStatus_ApplicationId_Last(
				status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification[]
			findBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long manuDeskVerificationId, String status,
				long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().
			findBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
				manuDeskVerificationId, status, manufacturingApplicationId,
				orderByComparator);
	}

	/**
	 * Removes all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId) {

		getPersistence().removeBygetManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public static int countBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId) {

		return getPersistence().
			countBygetManuDeskVerificationByStatus_ApplicationId(
				status, manufacturingApplicationId);
	}

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification findBygetManufactuirngById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().findBygetManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactuirngById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu desk verification where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu desk verification that was removed
	 */
	public static ManuDeskVerification removeBygetManufactuirngById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().removeBygetManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public static int countBygetManufactuirngById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId) {

		return getPersistence().findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	public static List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			OrderByComparator<ManuDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
			findBygetDeskVerificationManufactuirngById_First(
				long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().
			findBygetDeskVerificationManufactuirngById_First(
				manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetDeskVerificationManufactuirngById_First(
				manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
			findBygetDeskVerificationManufactuirngById_Last(
				long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().findBygetDeskVerificationManufactuirngById_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public static ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetDeskVerificationManufactuirngById_Last(
				manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification[]
			findBygetDeskVerificationManufactuirngById_PrevAndNext(
				long manuDeskVerificationId, long manufacturingApplicationId,
				OrderByComparator<ManuDeskVerification> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().
			findBygetDeskVerificationManufactuirngById_PrevAndNext(
				manuDeskVerificationId, manufacturingApplicationId,
				orderByComparator);
	}

	/**
	 * Removes all the manu desk verifications where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId) {

		getPersistence().removeBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public static int countBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetDeskVerificationManufactuirngById(
			manufacturingApplicationId);
	}

	/**
	 * Caches the manu desk verification in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerification the manu desk verification
	 */
	public static void cacheResult(ManuDeskVerification manuDeskVerification) {
		getPersistence().cacheResult(manuDeskVerification);
	}

	/**
	 * Caches the manu desk verifications in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerifications the manu desk verifications
	 */
	public static void cacheResult(
		List<ManuDeskVerification> manuDeskVerifications) {

		getPersistence().cacheResult(manuDeskVerifications);
	}

	/**
	 * Creates a new manu desk verification with the primary key. Does not add the manu desk verification to the database.
	 *
	 * @param manuDeskVerificationId the primary key for the new manu desk verification
	 * @return the new manu desk verification
	 */
	public static ManuDeskVerification create(long manuDeskVerificationId) {
		return getPersistence().create(manuDeskVerificationId);
	}

	/**
	 * Removes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification remove(long manuDeskVerificationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().remove(manuDeskVerificationId);
	}

	public static ManuDeskVerification updateImpl(
		ManuDeskVerification manuDeskVerification) {

		return getPersistence().updateImpl(manuDeskVerification);
	}

	/**
	 * Returns the manu desk verification with the primary key or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification findByPrimaryKey(
			long manuDeskVerificationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getPersistence().findByPrimaryKey(manuDeskVerificationId);
	}

	/**
	 * Returns the manu desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification, or <code>null</code> if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification fetchByPrimaryKey(
		long manuDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(manuDeskVerificationId);
	}

	/**
	 * Returns all the manu desk verifications.
	 *
	 * @return the manu desk verifications
	 */
	public static List<ManuDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of manu desk verifications
	 */
	public static List<ManuDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu desk verifications
	 */
	public static List<ManuDeskVerification> findAll(
		int start, int end,
		OrderByComparator<ManuDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu desk verifications
	 */
	public static List<ManuDeskVerification> findAll(
		int start, int end,
		OrderByComparator<ManuDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu desk verifications.
	 *
	 * @return the number of manu desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManuDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManuDeskVerificationPersistence _persistence;

}