/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMaster;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis supporting documents master service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisSupportingDocumentsMasterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMasterPersistence
 * @generated
 */
public class CannabisSupportingDocumentsMasterUtil {

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
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		getPersistence().clearCache(cannabisSupportingDocumentsMaster);
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
	public static Map<Serializable, CannabisSupportingDocumentsMaster>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisSupportingDocumentsMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisSupportingDocumentsMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisSupportingDocumentsMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisSupportingDocumentsMaster>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisSupportingDocumentsMaster update(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		return getPersistence().update(cannabisSupportingDocumentsMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisSupportingDocumentsMaster update(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisSupportingDocumentsMaster, serviceContext);
	}

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType) {

		return getPersistence().findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end) {

		return getPersistence().findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_First(
				String documentTye, String userType, String applicationType,
				String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocProperty_First(
			documentTye, userType, applicationType, landType,
			orderByComparator);
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_First(
			String documentTye, String userType, String applicationType,
			String landType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().fetchBygetSupportingDocProperty_First(
			documentTye, userType, applicationType, landType,
			orderByComparator);
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_Last(
				String documentTye, String userType, String applicationType,
				String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocProperty_Last(
			documentTye, userType, applicationType, landType,
			orderByComparator);
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_Last(
			String documentTye, String userType, String applicationType,
			String landType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().fetchBygetSupportingDocProperty_Last(
			documentTye, userType, applicationType, landType,
			orderByComparator);
	}

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public static CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocProperty_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType, String landType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocProperty_PrevAndNext(
			cannabisSupportingDocMasterId, documentTye, userType,
			applicationType, landType, orderByComparator);
	}

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 */
	public static void removeBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType) {

		getPersistence().removeBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType);
	}

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the number of matching cannabis supporting documents masters
	 */
	public static int countBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType) {

		return getPersistence().countBygetSupportingDocProperty(
			documentTye, userType, applicationType, landType);
	}

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType) {

		return getPersistence().findBygetSupportingDocApplicant(
			documentTye, userType, applicationType);
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end) {

		return getPersistence().findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetSupportingDocApplicant(
			documentTye, userType, applicationType, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_First(
				String documentTye, String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocApplicant_First(
			documentTye, userType, applicationType, orderByComparator);
	}

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_First(
			String documentTye, String userType, String applicationType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().fetchBygetSupportingDocApplicant_First(
			documentTye, userType, applicationType, orderByComparator);
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_Last(
				String documentTye, String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocApplicant_Last(
			documentTye, userType, applicationType, orderByComparator);
	}

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public static CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_Last(
			String documentTye, String userType, String applicationType,
			OrderByComparator<CannabisSupportingDocumentsMaster>
				orderByComparator) {

		return getPersistence().fetchBygetSupportingDocApplicant_Last(
			documentTye, userType, applicationType, orderByComparator);
	}

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public static CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocApplicant_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType,
				OrderByComparator<CannabisSupportingDocumentsMaster>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findBygetSupportingDocApplicant_PrevAndNext(
			cannabisSupportingDocMasterId, documentTye, userType,
			applicationType, orderByComparator);
	}

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 */
	public static void removeBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType) {

		getPersistence().removeBygetSupportingDocApplicant(
			documentTye, userType, applicationType);
	}

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the number of matching cannabis supporting documents masters
	 */
	public static int countBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType) {

		return getPersistence().countBygetSupportingDocApplicant(
			documentTye, userType, applicationType);
	}

	/**
	 * Caches the cannabis supporting documents master in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 */
	public static void cacheResult(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		getPersistence().cacheResult(cannabisSupportingDocumentsMaster);
	}

	/**
	 * Caches the cannabis supporting documents masters in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMasters the cannabis supporting documents masters
	 */
	public static void cacheResult(
		List<CannabisSupportingDocumentsMaster>
			cannabisSupportingDocumentsMasters) {

		getPersistence().cacheResult(cannabisSupportingDocumentsMasters);
	}

	/**
	 * Creates a new cannabis supporting documents master with the primary key. Does not add the cannabis supporting documents master to the database.
	 *
	 * @param cannabisSupportingDocMasterId the primary key for the new cannabis supporting documents master
	 * @return the new cannabis supporting documents master
	 */
	public static CannabisSupportingDocumentsMaster create(
		long cannabisSupportingDocMasterId) {

		return getPersistence().create(cannabisSupportingDocMasterId);
	}

	/**
	 * Removes the cannabis supporting documents master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public static CannabisSupportingDocumentsMaster remove(
			long cannabisSupportingDocMasterId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().remove(cannabisSupportingDocMasterId);
	}

	public static CannabisSupportingDocumentsMaster updateImpl(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster) {

		return getPersistence().updateImpl(cannabisSupportingDocumentsMaster);
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key or throws a <code>NoSuchCannabisSupportingDocumentsMasterException</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public static CannabisSupportingDocumentsMaster findByPrimaryKey(
			long cannabisSupportingDocMasterId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisSupportingDocumentsMasterException {

		return getPersistence().findByPrimaryKey(cannabisSupportingDocMasterId);
	}

	/**
	 * Returns the cannabis supporting documents master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master, or <code>null</code> if a cannabis supporting documents master with the primary key could not be found
	 */
	public static CannabisSupportingDocumentsMaster fetchByPrimaryKey(
		long cannabisSupportingDocMasterId) {

		return getPersistence().fetchByPrimaryKey(
			cannabisSupportingDocMasterId);
	}

	/**
	 * Returns all the cannabis supporting documents masters.
	 *
	 * @return the cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisSupportingDocumentsMaster>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supporting documents masters
	 */
	public static List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisSupportingDocumentsMaster> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis supporting documents masters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis supporting documents masters.
	 *
	 * @return the number of cannabis supporting documents masters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisSupportingDocumentsMasterPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisSupportingDocumentsMasterPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisSupportingDocumentsMasterPersistence
		_persistence;

}