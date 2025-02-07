/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManuCompanyInfoAddress. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoAddressLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressLocalService
 * @generated
 */
public class ManuCompanyInfoAddressLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ManuCompanyInfoAddressLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manu company info address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was added
	 */
	public static ManuCompanyInfoAddress addManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return getService().addManuCompanyInfoAddress(manuCompanyInfoAddress);
	}

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	public static ManuCompanyInfoAddress createManuCompanyInfoAddress(
		long manuCompanyInfoAddressId) {

		return getService().createManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
			long manuCompanyInfoAddressId)
		throws PortalException {

		return getService().deleteManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	/**
	 * Deletes the manu company info address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was removed
	 */
	public static ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return getService().deleteManuCompanyInfoAddress(
			manuCompanyInfoAddress);
	}

	public static void deleteMultipleFormById(long applicationId) {
		getService().deleteMultipleFormById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ManuCompanyInfoAddress fetchManuCompanyInfoAddress(
		long manuCompanyInfoAddressId) {

		return getService().fetchManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<ManuCompanyInfoAddress> getMA_CIA(
		long manufacturingApplicationId) {

		return getService().getMA_CIA(manufacturingApplicationId);
	}

	public static List<ManuCompanyInfoAddress> getMA_CII(
		long manuCompanyInfoId) {

		return getService().getMA_CII(manuCompanyInfoId);
	}

	/**
	 * Returns the manu company info address with the primary key.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress getManuCompanyInfoAddress(
			long manuCompanyInfoAddressId)
		throws PortalException {

		return getService().getManuCompanyInfoAddress(manuCompanyInfoAddressId);
	}

	/**
	 * Returns a range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> getManuCompanyInfoAddresses(
		int start, int end) {

		return getService().getManuCompanyInfoAddresses(start, end);
	}

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	public static int getManuCompanyInfoAddressesCount() {
		return getService().getManuCompanyInfoAddressesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu company info address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was updated
	 */
	public static ManuCompanyInfoAddress updateManuCompanyInfoAddress(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return getService().updateManuCompanyInfoAddress(
			manuCompanyInfoAddress);
	}

	public static ManuCompanyInfoAddressLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManuCompanyInfoAddressLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManuCompanyInfoAddressLocalServiceUtil.class,
			ManuCompanyInfoAddressLocalService.class);

}